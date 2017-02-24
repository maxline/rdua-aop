package ua.rd.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.rd.bean.Client;
import ua.rd.bean.ConsoleEventLogger;

@Configuration
public class AppConfig {
    @Bean
    public Client client() {
        return new Client("5", "Mike Tyson");
    }

    @Bean
    public ConsoleEventLogger consoleEventLogger() {
        return new ConsoleEventLogger();
    }

    @Bean
    public Application app() {
        return new Application(client(), consoleEventLogger());
    }

}

