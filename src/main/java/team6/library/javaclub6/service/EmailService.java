package team6.library.javaclub6.service;

public interface EmailService {
    void sendEmailToOneUser(String to, String subject, String text);
    void sendEmailToAllUsers(String subject, String text);
}
