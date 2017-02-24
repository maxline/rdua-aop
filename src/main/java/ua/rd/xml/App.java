package ua.rd.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.rd.bean.Client;
import ua.rd.bean.ConsoleEventLogger;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App() {
    }

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");

        App app = (App) ctx.getBean("app");

        //app.client = new Client("1","John Smith");
        //app.eventLogger = new ConsoleEventLogger();

        //app.client.setId("1");
        //app.client.setFullName("Adam Smith");

        app.logEvent("Hello 1");
        app.logEvent("Hello 2");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
