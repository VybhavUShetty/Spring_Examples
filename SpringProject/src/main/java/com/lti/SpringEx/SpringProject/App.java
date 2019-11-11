package com.lti.SpringEx.SpringProject;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean=(HelloWorld) context.getBean("emp");
        bean.printMessage("this is vaibhav");
        
        bean.add(5, 10);
        bean.sub(15,20,25);
        
        bean.greater(2,3);
        context.close();
        
    }
}
