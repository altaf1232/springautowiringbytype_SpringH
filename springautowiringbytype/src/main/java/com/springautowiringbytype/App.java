package com.springautowiringbytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       ApplicationContext context=new ClassPathXmlApplicationContext("bytype.xml");
             Emp_a emp=context.getBean("emp1",Emp_a.class);
             System.out.println(emp);
    }
}
