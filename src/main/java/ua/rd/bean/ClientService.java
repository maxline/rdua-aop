package ua.rd.bean;

public class ClientService implements Service {
    @Override
    public void hello() {
        System.out.println("hello from ClientService");
    }
}
