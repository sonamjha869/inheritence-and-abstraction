package com.oops.inheritence;
 class Animal {//when a class inherits another class known as single inheritence
	void eat()
	{
		System.out.println("eating");}
}
 class Dog extends  Animal{
	 void bark() {
		 System.out.println("barking");}
	 }
 class Testinheritence{
	 public static void main(String [] args) {
		 Dog d  = new Dog(); // create a d object
		 d.eat(); // call the eat() method on the d object
		 d.bark();
	 }
	 
	
	
	

}
