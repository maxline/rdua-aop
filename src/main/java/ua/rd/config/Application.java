package ua.rd.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.rd.bean.Client;
import ua.rd.bean.ConsoleEventLogger;
import ua.rd.bean.Order;
import ua.rd.bean.Service;

public class Application {
    @Autowired
    private Client client;
    @Autowired
    private ConsoleEventLogger eventLogger;

    @Autowired
    private Order order;


//    @Autowired
//    @Qualifier("adminService")
//    private Service service;

    public Application() {
    }

    public Application(Client client, ConsoleEventLogger eventLogger, Order order) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.order = order;
    }

    public static void main(String[] args) {
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(AppConfig.class);
        Application app = (Application) ctx.getBean("application");

        app.logEvent("Hello 5");
        app.logEvent("Hello 2");
        app.order.printOrder();
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
