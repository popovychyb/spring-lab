package org.example.task1.beansAutowired;

import org.example.task1.beansOther.OtherBeanA;
import org.example.task1.beansOther.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanField {
    @Autowired
    private OtherBeanA otherBeanA;
    @Autowired
    private OtherBeanB otherBeanB;

    @Override
    public String toString() {
        return otherBeanA.toString() + " " + otherBeanB.toString();
    }
}
