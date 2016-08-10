package com.designpattern.sample.observer2;
import java.util.Observable;
import java.util.Observer;

public class Person implements Observer{
	
	private String personName;
	
	public Person(String personName){
		this.personName = personName;
	}
	
	public String getPersonName(){
		return this.personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		 System.out.println("Hello "+personName+", Product is now "+arg+" on flipkart"); 
	}

}
