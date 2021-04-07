package org.example.task1.beansAutowired;

import org.example.task1.beansOther.OtherBeanA;
import org.example.task1.beansOther.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanSetter {
    private OtherBeanA otherBeanA;
    private OtherBeanB otherBeanB;

    @Autowired
    public void setOtherBeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    @Override
    public String toString() {
        return otherBeanA.toString() + " " + otherBeanB.toString();
    }
}
