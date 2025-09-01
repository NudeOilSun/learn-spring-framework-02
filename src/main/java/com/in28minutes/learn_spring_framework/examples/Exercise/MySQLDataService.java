package com.in28minutes.learn_spring_framework.examples.Exercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

    @Override
    public int[] RetrieveData() {
        return new int[] {1,2,3,4,5};
    }
}
