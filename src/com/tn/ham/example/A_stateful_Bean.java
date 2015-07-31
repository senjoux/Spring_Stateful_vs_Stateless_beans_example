package com.tn.ham.example;


/**
*
* @author Hamza
*/

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class A_stateful_Bean {

	public String msg;

	public void getMsg() {
		System.out.println(msg);
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}
