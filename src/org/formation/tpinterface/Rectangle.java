package org.formation.tpinterface;

public class Rectangle implements Surface {

	//Attributs
	private double width, height;

	public Rectangle(double width, double height) {
		super();
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * width;
	}
}
