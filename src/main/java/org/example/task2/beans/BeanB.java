package org.example.task2.beans;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:task2.properties")
public class BeanB implements BeanValidator {
    private String name;
    private int value;

    private void initBean() {
        System.out.println("inside init method of BeanB");
    }

    private void anotherInitMethod() {
        System.out.println("inside anotherInitMethod of BeanB");
    }

    private void destroyBean() {
        System.out.println("inside destroy method of BeanB");
    }

    @Override
    public boolean validate() {
        return name != null && value > 0;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
