package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.AuthorBook;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.service.AuthorBookService;
import team6.library.javaclub6.service.AuthorService;
import team6.library.javaclub6.service.BookService;
import team6.library.javaclub6.service.UserBookService;

import java.security.Principal;
import java.sql.Date;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AuthorService authorService;

    @Autowired
    UserBookService userBookService;

    @Autowired
    BookService bookService;

    @Autowired
    AuthorBookService authorBookService;

    @GetMapping("")
    public String index(){
        return "admin/index";
    }

    @GetMapping("/userReadBooks")
    public String userReadBooks(Model model){
        model.addAttribute("userReadBook", userBookService.hasReadBookList());
        return "admin/userReadBooks";
    }

    @GetMapping("/showFrom")
    public String showForm(){
        return "admin/registerbook/registerBook";
    }

    @PostMapping("/registerBook")
    public String submit(@ModelAttribute("authorBook") AuthorBook authorBook,
                         @RequestParam String title,
                         @RequestParam Date deployDate,
                         @RequestParam int copyNumber,
                         @RequestParam String name,
                         @RequestParam String surname){

        Book book = new Book();
        book.setTitle(title);
        book.setDeployDate(deployDate);
        book.setCopyNumber(copyNumber);

        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);

        bookService.save(book);
        if (!authorService.finaByNameSurnameBool(author.getName(), author.getSurname())) {
            authorService.saveAuthor(author);
        }
        authorBookService.newAuthorBook(book, authorService.findByNameSurname(author.getName(), author.getSurname()));
        return "admin/index";
    }

    @GetMapping("/search")
    public String search(){
        return "admin/updatebook/searchBook";
    }

    @PostMapping("/searchBook")
    public String searchShowBooks(@RequestParam String title, Model model){
        model.addAttribute("book", bookService.findByTitle(title));
        return "admin/updatebook/searchBook";
    }

    @GetMapping("/updateBook")
    public ModelAndView showUpdatePage(@RequestParam int id){
        Book book = new Book();
        book.setId(id);
        return new ModelAndView("admin/updatebook/updateBook", "book", book);
    }

    @PostMapping("/updateBook")
    public String updateBook(@RequestParam int id,
                             @RequestParam String title,
                             @RequestParam Date deployDate,
                             @RequestParam int copyNumber,
                             @RequestParam String name,
                             @RequestParam String surname, @ModelAttribute("book") Book book){
        //Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setDeployDate(deployDate);
        book.setCopyNumber(copyNumber);

        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);
        bookService.update(book);
        if (!authorService.finaByNameSurnameBool(name, surname)){
            authorService.saveAuthor(author);
        }
        //if !authorBookService.newAuthorBook(book, author) => save ELSE update
        authorBookService.newAuthorBook(book, author);
        return "admin/updatebook/updateBook";
    }
}
