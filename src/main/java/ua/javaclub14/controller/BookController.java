package ua.javaclub14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ua.javaclub14.model.Author;
import ua.javaclub14.model.Book;
import ua.javaclub14.service.AuthorService;
import ua.javaclub14.service.BookService;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;


    @GetMapping("/editBooks")
    public String bookForm(Locale locale, Model model) {

        model.addAttribute("books", bookService.list());
        model.addAttribute("authors", authorService.list());
        System.out.println("Book Controller list work");


        return "editBooks";
    }


//    @GetMapping("search/")
//    public String getBook(@RequestParam String title, Model model) {
//        System.out.println("Book Controller work");
//        model.addAttribute("books", bookService.findBookByTitle(title));
//        model.addAttribute("authors", authorService.list());
//
//        return "searchBook";
//    }

    @PostMapping("/")
    public String saveBook(@ModelAttribute("book") @Valid Book book,
                             BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("books", bookService.list());
            return "editBooks";
        }

        bookService.addBook(book);
        return "redirect:/";
    }

    @RequestMapping("searchBook")
    public String booksByTitle(@RequestParam("title") String title, Model model) {
        System.out.println("findBookByTitle Controller list work");

        if (title.isEmpty()) {
            return "editBooks";
        } else {
            List<Book> bookList = bookService.findBookByTitle(title);
            model.addAttribute("books", bookList);
//            model.addAttribute("authors", authorService.list());
            return "redirect:/editBook";
        }

    }
}
