package org.example.task2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanF implements BeanValidator {
    private final String name;
    private final int value;

    public BeanF(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean validate() {
        return name != null && value > 0;
    }

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
