package ua.rd.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Order {

    @Autowired
    private Client client;

    @Autowired
    @Qualifier("clientService")
    private Service service;


    public Order() {
    }

    public Order(Client client) {
        this.client = client;
    }

    public void printOrder() {
        System.out.println("client of order: " + client);
        System.out.println("service of order: " );
        service.hello();
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
