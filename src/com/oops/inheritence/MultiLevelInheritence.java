package com.oops.inheritence;

 class Animal2 { //  in multilevel inheritence when a class extends a class which extends another class
	 void eat() {
		 System.out.println("eating");}
	 
	 }
 class Dog1 extends Animal2{
	 void bark() {
		 System.out.println("barking");
	 }}
	 class BabyDog extends Dog{
		 void weep (){
			 System.out.println("weeping");}}
		 class Testinheritence2{
			 public static void main (String [] args) {
				 BabyDog d = new BabyDog();
				 d.weep();
				 d.bark();
				 d.eat();
				 
			 }
			 
		 }
	 
 
 
