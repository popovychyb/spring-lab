package org.example.task1.beansAutowired;

import org.example.task1.beansOther.OtherBeanA;
import org.example.task1.beansOther.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanConstructor {
    private OtherBeanA otherBeanA;
    private OtherBeanB otherBeanB;

    @Autowired
    public BeanConstructor(OtherBeanA otherBeanA, OtherBeanB otherBeanB) {
        this.otherBeanA = otherBeanA;
        this.otherBeanB = otherBeanB;
    }

    @Override
    public String toString() {
        return otherBeanA.toString() + " " + otherBeanB.toString();
    }
}
