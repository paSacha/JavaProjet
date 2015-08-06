package org.formation.tpinterface;

public class AreaCalculator {

	public AreaCalculator() {
		super();
	}
	
	double sumArea(double[] sumSurface){
		double sum = 0;
		for(int i = 0 ; i<sumSurface.length; i++)
			sum += sumSurface[i];
		return sum;
	}
	
	
}
