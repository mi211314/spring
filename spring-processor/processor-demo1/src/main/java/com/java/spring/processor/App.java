package com.java.spring.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        BeanTest beanTest = context.getBean(BeanTest.class);
        beanTest.show();
    }

}
