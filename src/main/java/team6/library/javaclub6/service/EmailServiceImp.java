package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import team6.library.javaclub6.model.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmailServiceImp implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private UserService userService;

    @Override
    public void sendEmailToOneUser(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("javaclub6.team6.library@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);
    }

    @Override
    public void sendEmailToAllUsers(String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("javaclub6.team6.library@gmail.com");
        List<User> users = userService.getReadersList();
        List<String> usersEmail = new ArrayList<>();
        for (User i:users) {
            usersEmail.add(i.getEmail());
        }
        String[] result = new String[usersEmail.size()];
        usersEmail.toArray(result);
        message.setTo(result);
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);
    }
}
