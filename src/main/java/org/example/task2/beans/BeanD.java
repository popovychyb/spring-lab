package org.example.task2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanD implements BeanValidator {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private int value;

    private void initBean() {
        System.out.println("inside init method of BeanD");
    }

    private void destroyBean() {
        System.out.println("inside destroy method of BeanD");
    }

    @Override
    public boolean validate() {
        return name != null && value > 0;
    }

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
