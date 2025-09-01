package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    //Qualifier directly wires up a specific component
    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game){
        this.game = game;
    }

    public void Run() {
        System.out.println("Running Game: " + game);
        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }
}
