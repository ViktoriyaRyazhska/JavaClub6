package com.booklib.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import com.booklib.entity.Author;
import com.booklib.entity.Book;
import com.booklib.service.AuthorService;
import com.booklib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
        model.addAttribute("authors", authorService.findAll());
        model.addAttribute("authorsList", getAuthorsList());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(
            @RequestParam String title,
            @RequestParam String genre,
            @RequestParam int copies,
            @RequestParam String id,
            @RequestParam(name = "coauthors", defaultValue = "0") String[] coauthors,
            Model model) {
        if (title.isEmpty() || genre.isEmpty() || id.isEmpty()) {
            model.addAttribute("error", "Fill all fields!");
            model.addAttribute("books", bookService.list());
            model.addAttribute("authors", authorService.findAll());
            model.addAttribute("authorsList", getAuthorsList());
            return "addBook";
        }
        Book book = new Book();
        Author author = authorService.findAuthorById(Long.parseLong(id));
        Set<Author> coauthor = new HashSet<Author>();
        for (String a : coauthors) {
            coauthor.add(authorService.findAuthorById(Long.parseLong(a)));
        }

        book.setTitle(title);
        book.setGenre(genre);
        book.setCopies(copies);
        book.setMain_author(author);
        book.setCoauthors(coauthor);
        bookService.save(book);
        return "redirect:/allBooks";
    }

    @ModelAttribute("authorsList")
    public List<String> getAuthorsList() {
        List<String> authorsList = new ArrayList<String>();
        List<Author> authors = authorService.findAll();

        for (Author a : authors) {
            authorsList.add(a.getId().toString());
        }

        return authorsList;
    }

}