package org.example;

import org.example.config.AppConfig;
import org.example.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBean("YandexEdagoi"));
        System.out.println(context.getBean("TestServiceBek"));

        ((TestService) context.getBean("TestServiceBek")).test();

        System.out.println(context.getBean("TestServiceBek"));
    }
}