package ua.rd.bean;

public class ConsoleEventLogger implements EventLogger {

    @Override
    public void logEvent(String message) {
        System.out.println(message);
    }
}
