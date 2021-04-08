package org.example.task2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean, BeanValidator {
    private final String name;
    private final int value;

    public BeanA(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside afterPropertiesSet method of BeanA");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside destroy method of BeanA");
    }

    @Override
    public boolean validate() {
        return name != null && value > 0;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
