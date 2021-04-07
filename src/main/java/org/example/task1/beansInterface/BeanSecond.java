package org.example.task1.beansInterface;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanSecond implements BeanInterface{
    @Override
    public String toString() {
        return "BeanSecond";
    }
}
