package com.codersabode.learnspringframework.helloWorld;

import com.codersabode.learnspringframework.helloWorld.HelloWorldConfiguration;
import com.codersabode.learnspringframework.helloWorld.Person;
import com.codersabode.learnspringframework.helloWorld.PlaceOfWork;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // Launch a Spring Context
       var context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);


        // Configure the things that we want Spring to manage -
        // HelloWorldConfiguration - @Configuration class
        // @Bean

        // Retrieving Beans managed by Spring
        System.out.println(context.getBean("greet"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean(Person.class));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("addressII"));
        System.out.println("School ID: " + context.getBean("school_id"));//  System.out.println(context.getBean(Address.class));
        System.out.println("Place of Work: " + context.getBean("placeOfWork"));
        System.out.println("Place of Work: " + context.getBean(PlaceOfWork.class));


        // print all bean names
        Arrays.stream( context.getBeanDefinitionNames())
                .forEach(System.out::println);


    }
}
