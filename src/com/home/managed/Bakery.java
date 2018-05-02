package com.home.managed;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.home.managed.annotations.Random;


@javax.enterprise.context.SessionScoped
public class Bakery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Random @Inject  int valueS;

	@Random @Inject  Instance<Integer> valueR;
	
	public Bakery() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	void initialize(){
		System.out.println("----------Bakery INIT------------------");
		System.out.println("Checking if the Values have Initialized");
		
		getBread();
		
	}
	
	public void getBread() {
		System.out.println("----- Making Bread ----");
		System.out.println("The Value Static Value is " + valueS);
		System.out.println("The Value Dynamic Value one time is " + valueR);
		//System.out.println("The Value Dynamic Value every time is " + valueR.get());
	}



	


}
