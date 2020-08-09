package com.example.springtest;

import com.example.springtest.annotationbeans.SecondName;
import com.example.springtest.annotationbeans.Teacher;
import com.example.springtest.beans.MyBean;
import com.example.springtest.configurations.AnnotationBeanConfiguration;
import com.example.springtest.configurations.ExplicitBeanConfiguration;
import com.example.springtest.explicitbeans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringtestApplication {

    public static void main(String[] args) {
        // For XML Bean configuration
        xmlBean();

        // For Java Bean configuration
        javaBean();

        //For Annotation Bean configuration
        annotationBean();
    }

    private static void xmlBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyBean myBeanService = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBeanService.sayHello());

        myBeanService.setName("SDA");
        System.out.println(myBeanService.sayHello());
    }

    private static void javaBean() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ExplicitBeanConfiguration.class);
        applicationContext.refresh();

        Student student = applicationContext.getBean(Student.class);
        System.out.println(student.toString());

        student = new Student("John", 30, "Tartu", "94564955234");
        System.out.println(student);
    }

    private static void annotationBean() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AnnotationBeanConfiguration.class);
        applicationContext.refresh();

        Teacher teacher = applicationContext.getBean(Teacher.class);
        System.out.println(teacher.getBeanName().getName());

        teacher.setBeanName(new SecondName());
        System.out.println(teacher.getBeanName().getName());
    }
}
