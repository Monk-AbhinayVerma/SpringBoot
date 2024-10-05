package com.abhinay.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	@Autowired //This is example of Field Injection
	@Qualifier("laptop")
	Computer comp;
	
//	This is constructor injection we don't need Autowired annotation in this
//	public Dev(Laptop laptop) {
//		this.laptop = laptop;
//	}
	
//	This is setter injection
//	@Autowired
//	public void setLaptop(Computer comp) {
//		this.comp = comp;
//	}
//	
	public void build(){
		
		comp.compile();
		
		System.out.println("Learning Spring Boot");
	}
	
	

}
