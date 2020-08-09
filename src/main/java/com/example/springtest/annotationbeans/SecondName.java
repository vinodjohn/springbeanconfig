package com.example.springtest.annotationbeans;

import com.example.springtest.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Vinod John
 */
@Component(value = "secondName")
public class SecondName implements BeanName {
    private final String name;

    public SecondName() {
        this.name = "International";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
