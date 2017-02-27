package ua.rd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.rd.bean.*;

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
    public Application application() {
        //return new Application(client(), consoleEventLogger());
        return new Application();
    }

    @Bean
    public Order order() {
        return new Order();
    }

    @Bean
    Service clientService() {
        Service s = new ClientService();
        return s;
    }

    @Bean
    Service adminService() {
        Service s = new AdminService();
        return s;
    }
}

