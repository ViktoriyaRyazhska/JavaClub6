package com.library.controller;

import com.library.AuthorEditor;
import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Request;
import com.library.service.AuthorService;
import com.library.service.BookService;
import com.library.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
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

    @Autowired
    private RequestService requestService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Author.class, this.authorEditor);
    }

    @GetMapping
    public String allBooks(Model model) {
        List<Book> books = bookService.findAll();
        List<Integer> availableCopies = new ArrayList<>();
        for (Book book : books) {
            availableCopies.add(book.getAmountOfCopies() - bookService.getNotReturned(book));
        }
        model.addAttribute("books", books);
        model.addAttribute("availableCopies", availableCopies);
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
    public String editBook(@PathVariable("id") long id, Model model) {
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
    public String editBook(@PathVariable("id") long id, @RequestParam String title, @RequestParam Integer amountOfCopies, @RequestParam Author mainAuthor, @RequestParam(required = false) Set<Author> authorsSet) {
        Book book = this.bookService.findBookById(id);
        book.setTitle(title);
        book.setAmountOfCopies(amountOfCopies);
        book.setMainAuthor(mainAuthor);
        book.setAuthorSet(authorsSet);
        this.bookService.updateBook(book);
        return "redirect:/admin/books";
    }

    @GetMapping("/addAuthor")
    public String showFormAuthor(Model model) {
        Author author = new Author();
        model.addAttribute("author", author);
        return "admin/author_add";
    }

    @PostMapping("/addAuthor")
    public String addAuthor(@Valid @ModelAttribute Author author) {
        authorService.addAuthor(author);
        return "redirect:/admin/books/add";
    }

    @GetMapping("/statistic/{id}")
    public String showStatistic(@PathVariable Long id, Model model) {
        Book book = bookService.findBookById(id);
        List<Request> requests = requestService.findByBookId(id);
        double numberOfRequests = requests.size();
        Double sumDaysOdReadingbook = 0.0;
        List<Double> readingDays = new ArrayList<>();
        for (Request request : requests) {
            if (request.getReturnDate() == null) {
                Period days = Period.between(request.getRequestDate(), LocalDate.now());
                readingDays.add((double) days.getDays());
                sumDaysOdReadingbook+=days.getDays();
            }else{
                Period days = Period.between(request.getRequestDate(),request.getReturnDate());
                readingDays.add((double) days.getDays());
                sumDaysOdReadingbook+=days.getDays();
            }


        }
        System.out.println(readingDays);

        model.addAttribute("book", book);
        model.addAttribute("requests", requests);
        model.addAttribute("numberOfRequests", numberOfRequests);
        model.addAttribute("sumDays",sumDaysOdReadingbook);
        model.addAttribute("readingDays",readingDays);
        return "admin/book_statistic";
    }

}
