package ua.javaclub14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import ua.javaclub14.model.Author;
import ua.javaclub14.model.Book;
import ua.javaclub14.model.BookUser;
import ua.javaclub14.service.AuthorService;
import ua.javaclub14.service.BookService;
import ua.javaclub14.service.BookUserService;

import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

//    public void setBookService(BookService bookService){
//        this.bookService=bookService;
//    }
    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookUserService bookUserService;



    @GetMapping("/editBooks")
    public String bookForm(Locale locale, Model model) {

        model.addAttribute("books", bookService.list());
        model.addAttribute("authors", authorService.list());


        return "editBooks";
    }


//    @RequestMapping( "addBook")
    @PostMapping("/addBook")
    public String saveBook(@ModelAttribute("book") @Valid Book book,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("books", bookService.list());
            return "editBooks";
        }


        bookService.addBook(book);
        return "redirect:/";
    }

    @RequestMapping("searchBookByTitle")
    public String booksByTitle(@RequestParam("title") String title, Model model) {
        System.out.println("findBookByTitle Controller list work");

        if (title.isEmpty()) {
            return "editBooks";
        } else {
            List<Book> bookList = bookService.findBookByTitle(title);
            model.addAttribute("books", bookList);
            List<Author> authorList = authorService.list();
            model.addAttribute("authors", authorList);
            return "searchBookByTitle";
        }
    }

        @RequestMapping("searchBookByAuthor")
        public String booksByAuthor(@RequestParam("name") String name, Model model) {
            System.out.println("findBookByTitle Controller list work");

            if (name.isEmpty()) {
                return "editBooks";
            } else {
                List<Book> bookList = bookService.list();
                model.addAttribute("books", bookList);
                List<Author> authorList = authorService.findAuthorByNameAndSurname(name);
                model.addAttribute("authors", authorList);
                return "searchBookByAuthor";
            }
        }

    @GetMapping("deleteBook/{bookid}")
    public String deleteBook(@PathVariable Long bookid) {
        Book book = bookService.findBookById(bookid);
        bookService.deleteBook(book);
        return "redirect:/editBooks";
    }

    @RequestMapping("sortPopular")
    public String sortByPopular(@RequestParam("tripStart") String tripStart, @RequestParam("tripFinish") String tripFinish, Model model) throws ParseException {


        System.out.println(tripStart);
        System.out.println(tripFinish);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-mm-dd");

        Date start= format.parse(tripStart);
        Date finish= format.parse(tripStart);

            List<Book> bookList = bookService.findBookByPopular();
            model.addAttribute("books", bookList);
            List<BookUser> bookUserList = bookUserService.listByDate(start,finish);
            model.addAttribute("booksUsers", bookList);

            return "sortPopular";

    }



}
