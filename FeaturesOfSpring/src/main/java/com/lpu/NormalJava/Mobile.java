package com.lpu.NormalJava;

public class Mobile {
    private Sim sim;
    public Mobile(Sim sim){
        this.sim=sim;
    }

    public void makeCall(){
        sim.calling();
        sim.data();
    }
}
