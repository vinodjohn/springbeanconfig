package com.example.springtest.annotationbeans;

import com.example.springtest.interfaces.BeanName;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Teacher bean
 *
 * @author Vinod John
 */
@Component
@Getter
@Setter
public class Teacher {

    private BeanName beanName;

    public Teacher(@Qualifier("firstName") BeanName name) {
        this.beanName = name;
    }
}
