package com.in28minutes.learn_spring_framework.game;

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
