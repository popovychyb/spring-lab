package org.example.task1.beansInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BeansInjection {
    private BeanInterface oneBean;
    private BeanInterface twoBean;
    private BeanInterface threeBean;

    public BeansInjection(BeanInterface oneBean, @Qualifier("beanSecond") BeanInterface twoBean,
                          @Qualifier("beanThird") BeanInterface threeBean) {
        this.oneBean = oneBean;
        this.twoBean = twoBean;
        this.threeBean = threeBean;
    }

    @Override
    public String toString() {
        return "BeansInjection{" +
                "oneBean=" + oneBean +
                ", twoBean=" + twoBean +
                ", threeBean=" + threeBean +
                '}';
    }
}
