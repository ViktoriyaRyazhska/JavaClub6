package com.booklib.controller;

import java.util.List;
import java.util.Locale;

import com.booklib.dao.AuthorDao;
import com.booklib.entity.Author;
import com.booklib.entity.Book;
//<<<<<<< HEAD
import com.booklib.service.AuthorService;
//=======
import com.booklib.entity.User;
//>>>>>>> b822d509ec55c8fb62729ec9da2c2bc5f2d197b0
import com.booklib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;

    @GetMapping("/allBooks")
    public String books(Locale locale, Model model) {
        model.addAttribute("books", bookService.list());
        return "allBooks";
    }

    @ModelAttribute("book")
    public Book formBackingObject() {
        return new Book();
    }

    @GetMapping("/allBooks/{title}")
    public String booksByTitle(@PathVariable("title") String title, Model model) {
        System.out.println(title);

        if (title.isEmpty()) {
            return "allBooks";
        } else {
            List<Book> bookList = bookService.findBookByTitle(title);
            model.addAttribute("books", bookList);
            return "allBooks";
        }

    }

    @GetMapping("/allBooks/author={author}")
    public String booksByAuthor(@PathVariable("author") String author, Model model) {
        System.out.println(author);

        if (author.isEmpty()) {
            return "allBooks";
        }

        Author authors = authorService.findAuthorBySurname(author);
        List<Book> bookList = bookService.findBookByAuthor(authors);
        model.addAttribute("books", bookList);
        return "allBooks";

    }

    @GetMapping("/single-book")
    public String singleBook(@RequestParam String id, Model model) {
        model.addAttribute("book", bookService.findBookById(Long.parseLong(id)));
        model.addAttribute("authors", bookService.findBookById(Long.parseLong(id)).getCoauthors());
        return "single-book";
    }

    @GetMapping("/updateCopies")
    public String updateCopies(@RequestParam String id) {
        Book book = bookService.findBookById(Long.parseLong(id));
        int copies = book.getCopies() - 1;
        bookService.updateCopies(Long.parseLong(id), copies);
        return "redirect:/allBooks";
    }

    @GetMapping("/deleteBook")
    public String deleteBook(@RequestParam String id) {
        Book book = bookService.findBookById(Long.parseLong(id));
        bookService.deleteBook(book);
        return "redirect:/allBooks";
    }

    @GetMapping("/addBook")
    public String addBook(Locale locale, Model model) {
        model.addAttribute("books", bookService.list());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute("book") @Valid Book book,
                           BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("books", bookService.list());
            return "addBook";
        }
        bookService.save(book);
        return "redirect:/allBooks";
    }

}