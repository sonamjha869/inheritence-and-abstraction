package com.oops.inheritence;

 class Vehicle {
	 String brand = "ford";
	 void honk() {
		 System.out.println("tuut, tuut!");
	 }
	 }
 class Car extends Vehicle{
	 String modelName = "Mustang"; // car attribute
	 public static void mai(String [] args) {
		 Car myCar = new Car(); //create a mycar object
		 myCar.honk(); // calling the honk() method on the mycar object
		 System.out.println(myCar.brand + "" + myCar.modelName);
		 
	 }

}
