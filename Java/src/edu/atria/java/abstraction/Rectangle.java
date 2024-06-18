package edu.atria.java.abstraction;

public class Rectangle extends Shape{
	float len,bred;

	public Rectangle(float len, float bred) {
		super();
		this.len = len;
		this.bred = bred;
	}
	@Override
	public float calculateArea() {
	return area=len*bred;	
	}
	}
