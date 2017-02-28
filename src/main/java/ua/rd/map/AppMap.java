package ua.rd.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMap {
    private ListService listService;


    public AppMap() {
    }

    public AppMap(ListService listService) {
        this.listService = listService;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringMap.xml");

        AppMap app = (AppMap) ctx.getBean("appMap");

        System.out.println(app.listService);
    }



}
