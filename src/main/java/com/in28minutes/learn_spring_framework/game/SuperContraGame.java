package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
//Qualifier - specific bean should be auto-wired
public class SuperContraGame implements GamingConsole {
    public void Up(){
        System.out.println("up");
    }

    public void Down(){
        System.out.println("sit down");
    }

    public void Left(){
        System.out.println("go back");
    }

    public void Right(){
        System.out.println("shoot a bullet");
    }
}
