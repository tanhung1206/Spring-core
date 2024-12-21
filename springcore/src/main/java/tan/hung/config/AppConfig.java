package tan.hung.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import tan.hung.EmailService;

@Configuration
public class AppConfig {

    @Bean
    public EmailService getEmailService() {
        return new EmailService();
    }

    @Bean
    @Scope("prototype")
    public EmailService getPrototypeEmailService() {
        return new EmailService();
    }
}
