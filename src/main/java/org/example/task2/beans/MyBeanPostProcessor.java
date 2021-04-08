package org.example.task2.beans;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("inside postProcessBeforeInitialization method of " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("inside postProcessAfterInitialization method of " + beanName);
        if (bean instanceof BeanValidator) {
            if (((BeanValidator) bean).validate()) {
                System.out.println(beanName + " is valid");
            } else {
                System.out.println(beanName + " is not valid");
            }
        }
        return bean;
    }
}
