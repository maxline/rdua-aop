package ua.rd.test12;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Mikhluk.
 */
public class AppRun {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("springContext.xml");

        SomeService service = appCtx.getBean(SomeService.class);
        service.call();

        appCtx.close();
    }
}