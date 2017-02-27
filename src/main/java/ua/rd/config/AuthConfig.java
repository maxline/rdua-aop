package ua.rd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.rd.bean.AuthBean;

@Configuration
public class AuthConfig {

    @Bean
    public AuthBean authBean() {
        return new AuthBean("authenticated!!!!!!!!!");
    }
}
