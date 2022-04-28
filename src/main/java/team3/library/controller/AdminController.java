package team3.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import team3.library.service.AuthorService;
import team3.library.service.BookService;
import team3.library.model.Author;
import team3.library.model.AuthorBook;
import team3.library.model.Book;
import team3.library.service.AuthorBookService;
import team3.library.service.UserBookService;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

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
        System.out.println("THIS IS OBJECT IN CONTROLLER" + userBookService.hasReadBookList());
        return "admin/userReadBooks";
    }

    @GetMapping("/showFrom")
    public ModelAndView showForm(){
        Map<String, Object> model = new HashMap<>();
        model.put("author", new Author());
        model.put("book", new Book());
        System.out.println("MODEL.BOOK"+model.get("book"));
        return new ModelAndView("admin/registerBook", "model", model);
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

}
