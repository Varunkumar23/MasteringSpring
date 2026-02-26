package com.lpu.AnnotationsApproach.ModrenXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(){
        System.out.println(engine.start());
        System.out.println("Car is moving!");
    }

}
