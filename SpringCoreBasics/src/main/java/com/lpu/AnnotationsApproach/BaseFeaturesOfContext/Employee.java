package com.lpu.AnnotationsApproach.BaseFeaturesOfContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")    // By default, every bean is singleton in spring but if we change scope to prototype it creates new object everytime we call getBean()
public class Employee {
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

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
