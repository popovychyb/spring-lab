package org.example.task2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC implements BeanValidator {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private int value;

    private void initBean() {
        System.out.println("inside init method of BeanC");
    }

    private void destroyBean() {
        System.out.println("inside destroy method of BeanC");
    }

    @Override
    public boolean validate() {
        return name != null && value > 0;
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
