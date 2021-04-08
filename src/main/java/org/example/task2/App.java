package org.example.task2;

import org.example.task2.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        ctx.close();
    }
}
