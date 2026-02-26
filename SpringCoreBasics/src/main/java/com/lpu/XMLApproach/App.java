package com.lpu.XMLApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //This is done by using config.xml approach which is a very old way of managing and creating beans
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Employee employee=(Employee) context.getBean("emp");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
