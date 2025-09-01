package com.in28minutes.learn_spring_framework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan //Will perform in current package if none is specified
public class SimpleSpringLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(SimpleSpringLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
