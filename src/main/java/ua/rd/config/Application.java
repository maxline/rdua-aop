package ua.rd.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.rd.bean.Client;
import ua.rd.bean.ConsoleEventLogger;

public class Application {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public Application(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
        Application app = (Application) ctx.getBean("app");

        app.logEvent("Hello 5");
        app.logEvent("Hello 2");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
