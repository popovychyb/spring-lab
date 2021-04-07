package org.example.task1.beansInterface;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Primary
public class BeanFirst implements BeanInterface {
    @Override
    public String toString() {
        return "BeanFirst";
    }
}
