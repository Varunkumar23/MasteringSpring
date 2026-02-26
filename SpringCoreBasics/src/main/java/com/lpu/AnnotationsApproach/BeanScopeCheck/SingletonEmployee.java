package com.lpu.AnnotationsApproach.BeanScopeCheck;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SingletonEmployee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Value("1")
    public void setId(int id) {
        this.id = id;
    }

    @Value("Varun")
    public void setName(String name) {
        this.name = name;
    }

}
