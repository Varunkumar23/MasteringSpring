package com.lpu;


import com.lpu.NormalJava.Airtel;
import com.lpu.NormalJava.Sim;

public class App
{
    public static void main( String[] args )
    {
        Airtel airtel=new Airtel();
        airtel.calling();
        airtel.data();

        Sim sim1=new Airtel();
        sim1.calling();
        sim1.data();

    }
}
