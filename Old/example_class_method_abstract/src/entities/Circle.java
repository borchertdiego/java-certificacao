package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private double radius;

	public Circle() {
	}
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

//	Uma subclasse deve sobrepor o método abstrato de uma superclasse
	@Override
	public double area() {
		return radius * radius * 3.14;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}