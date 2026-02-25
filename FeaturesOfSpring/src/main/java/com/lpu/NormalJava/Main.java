package com.lpu.NormalJava;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1=new Mobile(new Airtel());
        Mobile mobile2=new Mobile(new Vi());

        mobile1.makeCall();
        System.out.println("----------------");
        mobile2.makeCall();
    }
}
