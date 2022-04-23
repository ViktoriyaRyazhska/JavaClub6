package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.AuthorBook;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.UserBook;
import team6.library.javaclub6.service.AuthorBookService;
import team6.library.javaclub6.service.AuthorService;
import team6.library.javaclub6.service.BookService;
import team6.library.javaclub6.service.UserBookService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
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

//    @GetMapping("/registerBook")
//    public String getForm(Model model){
//        model.addAttribute("authorBook", new AuthorBook());
//        model.addAttribute("book", new Book());
//        model.addAttribute("author", new Author());
//        return "admin/registerBook";
//    }

    @PostMapping("/registerBook")
    public String submit(@ModelAttribute("authorBook") AuthorBook authorBook,
                         @RequestParam String title,
                         @RequestParam Date deployDate,
                         @RequestParam int copyNumber,
                         @RequestParam String name,
                         @RequestParam String surname, Model model){
        //model.addAttribute("authorBook", authorBook);
        //Book book = (Book) model.getAttribute("book");
        //Author author = (Author) model.getAttribute("author");
        //model.addAttribute("author", author);
        //book.setDeployDate(new Date(System.currentTimeMillis()));
        Book book = new Book();
        book.setTitle(title);
        book.setDeployDate(deployDate);
        book.setCopyNumber(copyNumber);

        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);

        System.out.println("attribute!" + model.getAttribute("book"));
        System.out.println("OBJECT" + book);
        bookService.save(book);
        authorBookService.newAuthorBook(book, authorService.findByNameSurname(author.getName(), author.getSurname()));
        return "admin/index";
    }

//    @PostMapping("/registerBook")
//    public String submit(@ModelAttribute("book") Book book, BindingResult result, ModelMap model){
//        Author author = new Author();
//        model.addAttribute("title", book.getTitle());
//        model.addAttribute("deployDate", book.getDeployDate());
//        model.addAttribute("copyNumber", book.getCopyNumber());
//        model.addAttribute("name", author.getName());
//        model.addAttribute("surname", author.getSurname());
//        //bookService.save(book);
//        authorBookService.newAuthorBook(book, authorService.findByNameSurname(author.getName(), author.getSurname()));
//        return "redirect:/";
//    }
}
