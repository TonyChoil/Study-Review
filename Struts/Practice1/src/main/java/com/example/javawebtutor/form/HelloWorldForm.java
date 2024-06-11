package com.example.javawebtutor.form;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm{
	
	private String hello = null;

	public HelloWorldForm() {
		super();
		hello = "Hello World";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
}
