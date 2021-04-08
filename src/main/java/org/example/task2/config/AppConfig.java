package org.example.task2.config;

import org.example.task2.beans.BeanA;
import org.example.task2.beans.BeanE;
import org.example.task2.beans.BeanF;
import org.springframework.context.annotation.*;

@Configuration
@Import(AppConfigAnother.class)
@ComponentScan(basePackages = "org.example.task2")
public class AppConfig {
    @Bean
    public BeanA beanA() {
        return new BeanA("beanA", 4);
    }

    @Bean
    public BeanE beanE() {
        return new BeanE("beanE", 5);
    }

    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF("beanF", 6);
    }
}
