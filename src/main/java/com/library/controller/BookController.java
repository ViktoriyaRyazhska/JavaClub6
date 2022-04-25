package com.library.controller;

import com.library.AuthorEditor;
import com.library.model.Author;
import com.library.model.Book;
import com.library.service.AuthorService;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Set;

@Controller
@RequestMapping("admin/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private AuthorEditor authorEditor;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Author.class, this.authorEditor);
    }

    @GetMapping
    public String allBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "admin/book_list";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.findAll());
        return "admin/book_add";
    }

    @PostMapping("/add")
    public String addBook(@Valid @ModelAttribute Book book) {
        bookService.addBook(book);
        return "redirect:/admin/books";
    }

    @GetMapping("/{id}")
    public String getBook(Model model, @PathVariable Long id) {
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("authors", book.getAuthorSet());
        return "admin/book_details";
    }

    @GetMapping("delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        Book book = bookService.findBookById(id);
        bookService.deleteBook(book);
        return "redirect:/admin/books";
    }

    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") long id, Model model){
        model.addAttribute("book", this.bookService.findBookById(id));
        model.addAttribute("title", this.bookService.findBookById(id).getTitle());
        model.addAttribute("mainAuthor", this.bookService.findBookById(id).getMainAuthor());
        //all authors
        model.addAttribute("authors", authorService.findAll());
        //all authors of book
        model.addAttribute("authorsSet", bookService.findBookById(id).getAuthorSet());
        model.addAttribute("amountOfCopies", bookService.findBookById(id).getAmountOfCopies());
        return "admin/book_edit";
    }

    @PostMapping("/edit/{id}")
    public String editBook(@PathVariable("id") long id, @RequestParam String title, @RequestParam Integer amountOfCopies, @RequestParam Author mainAuthor, @RequestParam(required = false)Set<Author> authorsSet) {
        Book book = this.bookService.findBookById(id);
        book.setTitle(title);
        book.setAmountOfCopies(amountOfCopies);
        book.setMainAuthor(mainAuthor);
        book.setAuthorSet(authorsSet);
        this.bookService.updateBook(book);
        return "redirect:/admin/books";
    }

}
