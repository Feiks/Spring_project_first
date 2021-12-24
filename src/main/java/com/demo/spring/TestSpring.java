package com.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml");
       MyClass myClass =  context.getBean("MyClass",MyClass.class);
        System.out.println(myClass.getName());

        context.close();
    }
}
