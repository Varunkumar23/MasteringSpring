package com.lpu.SpringBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private Sim sim;

    @Autowired
    public Mobile( Sim sim){
        this.sim=sim;
    }

    public void makeCall(){
        sim.call();
    }
}
