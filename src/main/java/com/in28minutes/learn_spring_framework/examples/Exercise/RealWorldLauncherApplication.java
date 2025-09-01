package com.in28minutes.learn_spring_framework.examples.Exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(RealWorldLauncherApplication.class);){

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BussinessCaulculationService.class).FindMax());
        }
    }
}
