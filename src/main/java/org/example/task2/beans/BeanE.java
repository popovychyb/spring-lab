package org.example.task2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements BeanValidator {
    private final String name;
    private final int value;

    public BeanE(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("inside preDestroy method of BeanE");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("inside postConstruct method of BeanE");
    }

    @Override
    public boolean validate() {
        return name != null && value > 0;
    }

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
