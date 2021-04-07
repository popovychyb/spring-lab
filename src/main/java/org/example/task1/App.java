package org.example.task1;

import org.example.task1.config.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx;

        System.out.println("beans1: ");
        ctx = new AnnotationConfigApplicationContext(FirstConfig.class);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("\nbeans2: ");
        ctx = new AnnotationConfigApplicationContext(SecondConfig.class);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("\nbeans by interface and list: ");
        ctx = new AnnotationConfigApplicationContext(InterfaceConfig.class);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        System.out.println("\nall beans");
        ctx = new AnnotationConfigApplicationContext(AllConfig.class);
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
