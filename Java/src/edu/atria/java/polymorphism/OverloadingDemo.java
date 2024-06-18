package edu.atria.java.polymorphism;

public class OverloadingDemo {
	public static void main(String[] args) {
		
		System.out.println("addition of 2 integers"+MethodOverloading.addition(10,20));
		System.out.println("addition of 2 integers"+MethodOverloading.addition(10.5f,20.5f));
		System.out.println("addition of 2 integers"+MethodOverloading.addition(10,20.5f));
		System.out.println("addition of 2 integers"+MethodOverloading.addition(10.5f,20));
		System.out.println("addition of 2 integers"+MethodOverloading.addition("hi","rash"));
	}
}
