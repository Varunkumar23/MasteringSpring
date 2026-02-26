package com.lpu.AnnotationsApproach.InjectionTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection
{
    @Autowired
    Processor processor;

    public void show(){
        System.out.println("Field Injection: "+processor.getDetails());
    }


}
