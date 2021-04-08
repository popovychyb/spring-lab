package org.example.task2.config;

import org.example.task2.beans.BeanB;
import org.example.task2.beans.BeanC;
import org.example.task2.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfigAnother {
    @Bean(initMethod = "initBean",
            destroyMethod = "destroyBean")
    @DependsOn("beanD")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(initMethod = "initBean",
            destroyMethod = "destroyBean")
    @DependsOn("beanB")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean(initMethod = "initBean",
            destroyMethod = "destroyBean")
    public BeanD beanD() {
        return new BeanD();
    }
}
