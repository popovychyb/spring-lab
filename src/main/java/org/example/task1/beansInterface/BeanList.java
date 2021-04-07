package org.example.task1.beansInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeanList {
    @Autowired
    private List<BeanInterface> beans;

    public void getBeans(){
        for (BeanInterface bean : beans) {
            System.out.println(bean);
        }
    }
}
