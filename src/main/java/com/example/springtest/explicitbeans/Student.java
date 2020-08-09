package com.example.springtest.explicitbeans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Student bean
 *
 * @author Vinod John
 */
@Getter
@ToString
@AllArgsConstructor
public class Student {
    private final String name;
    private final int age;
    private final String address;
    private final String phone;
}
