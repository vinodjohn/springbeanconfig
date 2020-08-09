package com.example.springtest.beans;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @author Vinod John
 */
@Service("myBean")
@Data
public class MyBean {
    private static final String GREETING = "Hello! ";

    private String name;

    public String sayHello() {
        return GREETING.concat(name);
    }
}
