package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext c=new ClassPathXmlApplicationContext("com/aop/config.xml");
    	PaymentService paymentobject=c.getBean("payment",PaymentService.class);
    	paymentobject.makePayment();
    }
}
