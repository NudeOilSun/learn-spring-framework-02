package com.in28minutes.learn_spring_framework.examples.e1.a0;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //make sure a new instance of this bean is created every time
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan //Will perform in current package if none is specified
public class BeanScopeLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class);){
            System.out.println(context.getBean(NormalClass.class)); //will print the same reference i.e. NormalClass@8f4ea7c
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class)); //each one of these has a different reference
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }

    }
}
