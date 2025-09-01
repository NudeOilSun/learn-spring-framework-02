package com.in28minutes.learn_spring_framework.examples.Exercise;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class BussinessCaulculationService {
    private  DataService dataService;

    public BussinessCaulculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int FindMax(){
        return Arrays.stream(dataService.RetrieveData()).max().orElse(0);
    }
}
