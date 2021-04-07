package org.example.task1.beansInterface;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BeanThird implements BeanInterface{
    @Override
    public String toString() {
        return "BeanThird";
    }
}
