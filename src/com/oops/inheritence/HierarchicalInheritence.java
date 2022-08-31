package com.oops.inheritence;

 class Animal1{ // in hierarichical inheritence when two or more class inherits a single class is known as hierarichical
	 void eat() {
		 System.out.println("eating");}
	 }
 class Cat extends Animal {
	 void meow() {
		 System.out.println("meowing");}
	 }
 class Testinheritence3{
	 public static void main(String[] args) {
		 Cat  C = new Cat();
		 C.meow();
		 C.eat();
		 
	 }
	

}
