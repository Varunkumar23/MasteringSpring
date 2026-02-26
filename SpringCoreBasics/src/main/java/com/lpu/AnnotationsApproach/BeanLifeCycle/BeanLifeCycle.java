package com.lpu.AnnotationsApproach.BeanLifeCycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycle {
    public BeanLifeCycle(){
        System.out.println("Constructor Called!");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean created!");
    }

    @PreDestroy // with the help of these annotations bean lifecycle is managed both creation and destroy
    public void destroy(){
        System.out.println("Bean destroyed!");
    }
}
