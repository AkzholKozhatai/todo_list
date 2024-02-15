package org.example.service;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

@Component("TestServiceBek")
public class TestService {

    public void test() {

        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("context.getApplicationName() = " + context.getBean("TestServiceBek"));
//        ApplicationContextEvent event = ;
//        System.out.println("event.getApplicationContext().getBean(\"TestServiceBek\") = " + event.getApplicationContext().getBean("TestServiceBek"));
        context.close();

    }
}
