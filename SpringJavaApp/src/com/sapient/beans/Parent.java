package com.sapient.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.sapient.client.cui.MainApp;

@Component
public class Parent{
	private Child child;
	Logger log = Logger.getLogger(MainApp.class.getName());
	
	public Parent(Child child){
		this.child=child;
	}
	
	public Parent(){}
	
	public Parent(String str){
		
	}

	public Child getChild() {
		return child;
	}

	@Required
	public void setChild(Child child) {
		this.child = child;
	}
	
	@PostConstruct
	public void init(){
		log.info("Further Initialized");
	}
	
	@PreDestroy
	public void destroying(){
		log.info("Bean Destroyed");
	}
}
