package team6.library.javaclub6.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@PropertySource(value = {"classpath:application.properties"})
@Configuration
public class MailConfig {

    @Autowired
    private Environment environment;

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(environment.getRequiredProperty("mail.host"));
        mailSender.setPort(Integer.parseInt(environment.getRequiredProperty("mail.port")));
        mailSender.setUsername(environment.getRequiredProperty("mail.username"));
        mailSender.setPassword(environment.getRequiredProperty("mail.password"));
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", environment.getRequiredProperty("mail.transport.protocol"));
        props.put("mail.smtp.auth", environment.getRequiredProperty("mail.smtp.auth"));
        props.put("mail.smtp.starttls.enable", environment.getRequiredProperty("mail.smtp.starttls.enable"));
        props.put("mail.debug", environment.getRequiredProperty("mail.debug"));
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        return mailSender;
    }
}
