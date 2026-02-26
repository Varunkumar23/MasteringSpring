package com.lpu.AnnotationsApproach.InjectionTypes;

import com.lpu.AnnotationsApproach.BeanScopeCheck.PrototypeEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    Processor processor;

    @Autowired
    public void setProcessor(Processor processor){
        this.processor=processor;
    }

    public void show(){
        System.out.println("Setter Injection: "+processor.getDetails());
    }
}
