package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.AuthorBook;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.service.*;
import team6.library.javaclub6.service.AuthorBookService;
import team6.library.javaclub6.service.AuthorService;
import team6.library.javaclub6.service.BookService;
import team6.library.javaclub6.service.UserBookService;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    UserService userService;

    @Autowired
    EmailService emailService;

    @GetMapping("")
    public String index(){
        return "admin/index";
    }

    @GetMapping("/sendmail")
    public String sendEmail(Model model){
        model.addAttribute("users", userService.getReadersList());
        return "admin/sendemail";
    }

    @PostMapping("/send")
    public String send(HttpServletRequest request){
        if (request.getParameter("to").equals("all")){
            emailService.sendEmailToAllUsers(request.getParameter("subject"), request.getParameter("text"));
        } else {
            emailService.sendEmailToOneUser(request.getParameter("to"), request.getParameter("subject"), request.getParameter("text"));
        }
        return "redirect:/admin";
    }

    @GetMapping("/books")
    public String bookList(Model model){
        model.addAttribute("books", bookService.list());
        return "admin/booklist";
    }

    @GetMapping("/book")
    public String bookById(@RequestParam(name = "id") int id, Model model){
        model.addAttribute("book", bookService.findById(id));
        model.addAttribute("averageTime", bookService.getAverageTimeOfReading(id));
        return "admin/bookbyid";
    }

    @GetMapping("/numberofrequests")
    public String numberOfRequests(Model model, @RequestParam(name = "firstDate", required = false) Date first, @RequestParam(name = "secondDate", required = false) Date second){
        Date today = new Date(System.currentTimeMillis());
        if (first == null || second == null) {
            first = new Date(today.getYear(), today.getMonth(), 1);
            second = new Date(today.getYear(), today.getMonth() + 1, 1);
        }
        model.addAttribute("firstDate", first);
        model.addAttribute("secondDate", second);
        model.addAttribute("number", userBookService.getNumberOfBookGivenInSelectedPeriod(first, second));
        return "admin/numberofrequests";
    }

    @PostMapping("/calculate")
    public String calculate(HttpServletRequest request){
        Date firstDate = Date.valueOf(request.getParameter("firstDate"));
        Date secondDate = Date.valueOf(request.getParameter("secondDate"));
        return "redirect:/admin/numberofrequests?firstDate=" + firstDate + "&secondDate=" + secondDate;
    }

    @GetMapping("/usermissedlist")
    public String userMissedReturnDateList(Model model){
        model.addAttribute("users", userService.getUserMissedReturnDate());
        return "admin/usermissedlist";
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
    public ModelAndView showUpdatePage(@RequestParam int id,
                                       @RequestParam int copyNumber,
                                       @RequestParam Date deployDate,
                                       @RequestParam String title, ModelMap model){
        Book book = new Book();
        book.setId(id);
        book.setCopyNumber(copyNumber);
        book.setDeployDate(deployDate);
        book.setTitle(title);

        Author author = new Author(); // find author's id by book id
        author.setId(authorBookService.findAuthorIdByBookId(id));

        model.addAttribute("book", book);
        model.addAttribute("author", author);
        return new ModelAndView("admin/updatebook/updateBook", "model", model); //pass modelMap
    }

    @PostMapping("/updateBook")
    public String updateBook(@RequestParam int id,
                             @RequestParam String title,
                             @RequestParam Date deployDate,
                             @RequestParam int copyNumber,
                             @RequestParam String name,
                             @RequestParam String surname,
                             @ModelAttribute("book") Book book){
        book.setId(id);
        book.setTitle(title);
        book.setDeployDate(deployDate);
        book.setCopyNumber(copyNumber);

        Author author = new Author();
        author.setName(name);
        author.setSurname(surname);
        bookService.update(book);

        if (!authorService.finaByNameSurnameBool(name, surname) && name != null && surname != null){
            authorService.saveAuthor(author);
            authorBookService.newAuthorBook(book, authorService.findByNameSurname(author.getName(), author.getSurname()));
        } else {
            authorBookService.update(book, authorService.findByNameSurname(author.getName(), author.getSurname()));
        }
        return "admin/updatebook/updateBook";
    }
}
