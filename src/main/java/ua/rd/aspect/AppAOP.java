package ua.rd.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.rd.bean.Client;
import ua.rd.bean.ConsoleEventLogger;
import ua.rd.bean.EventLogger;
import ua.rd.bean.Order;

public class AppAOP {
    private Client client;
    private EventLogger eventLogger;

    public AppAOP() {
    }

    public AppAOP(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringAOP.xml");

        AppAOP app = (AppAOP) ctx.getBean("appAOP");


        Client client = (Client) ctx.getBean("client");
        client.getId();
        client.getFullName();
        client.setId("6");
        System.out.println(client);

//        app.logEvent("Hello 1");
//        app.logEvent("Hello 2");


    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
