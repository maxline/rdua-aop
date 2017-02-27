package ua.rd.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class ClientService implements Service {

    @Autowired
    private AuthBean authBean;

    @Override
    public void hello() {
        System.out.println("hello from ClientService");
        System.out.println(authBean.isAuthenticated());
    }
}
