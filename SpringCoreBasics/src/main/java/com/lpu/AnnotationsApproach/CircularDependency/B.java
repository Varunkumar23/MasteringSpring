package com.lpu.AnnotationsApproach.CircularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class B {
    private final A a;


    public B(A a) {
        this.a = a;
    }

//    public void setA(A a) {
//        this.a = a;
//    }
}
