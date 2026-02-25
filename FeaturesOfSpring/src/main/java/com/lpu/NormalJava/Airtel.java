package com.lpu.NormalJava;

public class Airtel implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling with airtel sim");

    }

    @Override
    public void data() {
        System.out.println("Using data of airtel");
    }
}
