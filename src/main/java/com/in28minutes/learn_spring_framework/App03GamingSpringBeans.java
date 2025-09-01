package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GamingConfiguration  {

    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }

    @Bean
    public GameRunner runner(GamingConsole game){
        var runner = new GameRunner(game);
        return runner;
    }

}

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);){
            context.getBean(GamingConsole.class).Up();
            context.getBean(GameRunner.class).Run();
        }

    }
}
