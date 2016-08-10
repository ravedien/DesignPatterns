package com.designpattern.sample.observer2;

public class Client {
	public static void main(String[] args) {
		Person hp = new Person("hp");  
        Person mikko = new Person("mikko");  
          
        Product samsungMobile=new Product("Samsung", "Mobile", "Not available");  
          
        samsungMobile.registerObserver(hp);  
        samsungMobile.registerObserver(mikko);  
          
        //Now product is available  
        samsungMobile.setAvailability("Available");  

	}
}
