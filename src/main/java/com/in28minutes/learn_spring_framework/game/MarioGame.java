package com.in28minutes.learn_spring_framework.game ;


public class MarioGame implements GamingConsole {
    public void Up(){
        System.out.println("jump");
    }

    public void Down(){
        System.out.println("into a hold");
    }

    public void Left(){
        System.out.println("go back");
    }

     public void Right(){
        System.out.println("Accelerate");
    }
}
