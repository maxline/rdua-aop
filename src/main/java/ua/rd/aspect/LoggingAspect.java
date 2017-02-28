package ua.rd.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Sergey Mikhluk.
 */
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* ua.rd.bean.*Client.*(*))")
    private void allLogEventMethods(){
    }

    @Before("allLogEventMethods()")
    private void logBefore(){
        System.out.println("Before");
    }
}
