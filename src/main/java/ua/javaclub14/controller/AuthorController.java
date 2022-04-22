package ua.javaclub14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ua.javaclub14.model.Author;
import ua.javaclub14.model.User;
import ua.javaclub14.service.AuthorService;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/editAuthors")
    public String authorForm(Locale locale, Model model) {
        model.addAttribute("authors", authorService.list());
        return "editAuthors";
    }
    @ModelAttribute("author")
    public Author formBackingObject() {
        return new Author();
    }

    @PostMapping("/addAuthor")
    public String saveAuthor(@ModelAttribute("author") @Valid Author author,
                           BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("authors", authorService.list());
            return "editAuthors";
        }

        authorService.addAuthor(author);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String getAuthor(Model model, @PathVariable Long id) {
        Author author = authorService.findAuthorById(id);
        model.addAttribute("author", author);
        return "editAuthors";
    }

    @GetMapping("delete/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        Author author = authorService.findAuthorById(id);
        authorService.deleteAuthor(author);
        return "redirect:/editAuthors";
    }

}
