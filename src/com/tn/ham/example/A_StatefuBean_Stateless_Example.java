package com.tn.ham.example;


/**
*
* @author Hamza
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.tn.ham.example")
@Configuration
public class A_StatefuBean_Stateless_Example {

	 public static void main(String[] args) {
	       ApplicationContext context = new AnnotationConfigApplicationContext(A_StatefuBean_Stateless_Example.class);
	      
	       //********* stateless bean test *********
	       
	       A_stateless_Bean instance_1_stateless =context.getBean(A_stateless_Bean.class);
	       instance_1_stateless.setMsg("Bonjour mme !");
	       instance_1_stateless.getMsg();
	       
	       A_stateless_Bean instance_2_stateless =context.getBean(A_stateless_Bean.class);
	       instance_2_stateless.getMsg();  // --> display same message as the previous instance
	       
	       //********* stateful bean test *********
	       
	       A_stateful_Bean instance_1_statefull =context.getBean(A_stateful_Bean.class);
	       instance_1_statefull.setMsg("Bonjour mr !");
	       instance_1_statefull.getMsg();
	       
	       A_stateful_Bean instance_2_statefull =context.getBean(A_stateful_Bean.class);
	       instance_2_statefull.getMsg(); // --> display null message 
	       
	       
	    }
}
