package com.in28minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
@Lazy //This class will only be initialised when something makes use of it
class ClassB{
    private ClassA classa;

    public ClassB(ClassA classa) {
        System.out.println("Some initialization");
        this.classa = classa;
    }

    public void doSomething(){
        System.out.println("Do something");
    }
}



@Configuration
@ComponentScan
public class LazyInitiliserLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(LazyInitiliserLauncherApplication.class);){
            System.out.println("Initialisation of context completed");
            context.getBean(ClassB.class).doSomething(); //this will trigger ClassB to get initialised
        }

    }
}
