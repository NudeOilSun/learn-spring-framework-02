package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GamingConsole game;

    public GameRunner(GamingConsole game){
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
