package com.in28minutes.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
 private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependices are ready");
    }

    @PostConstruct //Spring auto wires dependencies so would call this
    public void Initialize(){
        someDependency.getReady();
    }

   @PreDestroy //makes sure this is run as the last task of initialization
    public void CleanUp(){
        System.out.println("Clean up");
    }
}

@Component
class SomeDependency{

    public void getReady() {
        System.out.println("Some Lgoic using SomeDependency");
    }
}

@Configuration
@ComponentScan //Will perform in current package if none is specified
public class PrePostContextLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class);){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
