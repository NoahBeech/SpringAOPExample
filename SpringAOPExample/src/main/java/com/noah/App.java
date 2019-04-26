package com.noah;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Calculation calc = (Calculation) ctx.getBean("calculationProxy");
        calc.calc(200);
        calc.calc(2000);
        calc.calc(20000);
        calc.calc(200000);
    }
}
