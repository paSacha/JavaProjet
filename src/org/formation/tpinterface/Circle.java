package org.formation.tpinterface;

import javafx.scene.shape.Shape;

public class Circle implements IFXDrawable, IPrintable, Surface {

	private double rayon;
	
	
	
	public Circle(double rayon) {
		super();
		this.rayon = rayon;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printMe(String text) {
		// TODO Auto-generated method stub
		System.out.println("Ici un " + text);
	}

	@Override
	public javafx.scene.shape.Shape getShape() {
		// TODO Auto-generated method stub
		return new javafx.scene.shape.Circle(125, 125, rayon);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return rayon*Math.PI*2;
	}

}
