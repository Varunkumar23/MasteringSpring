package com.lpu.AnnotationsApproach.CircularDependency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    private final B b;


    public A(B b) {
        this.b = b;
    }

//    public void setB(B b){
//        this.b=b;
//    }
}
