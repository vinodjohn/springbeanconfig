package com.example.springtest.annotationbeans;

import com.example.springtest.interfaces.BeanName;
import org.springframework.stereotype.Component;

/**
 * @author Vinod John
 */
@Component(value = "firstName")
public class FirstName implements BeanName {

    private final String name;

    public FirstName() {
        this.name = "SDA";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
