package com.lpu.AnnotationsApproach.InjectionTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {

    Processor processor;

    @Autowired
    ConstructorInjection(Processor processor) {
        this.processor = processor;
    }

    public void show() {
        System.out.println("Constructor Injection: " + processor.getDetails());
    }
}
