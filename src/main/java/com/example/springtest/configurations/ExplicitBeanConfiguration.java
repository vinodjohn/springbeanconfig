package com.example.springtest.configurations;

import com.example.springtest.explicitbeans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Vinod John
 */
@Configuration
public class ExplicitBeanConfiguration {

    @Bean
    public Student studentBean() {
        return new Student("Vinod", 20, "Tallinn", "3686413412");
    }
}
