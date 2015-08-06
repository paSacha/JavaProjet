package org.formation.tpinterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;


public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(4);
		Square sq1 = new Square(2);
		Rectangle rec1 = new Rectangle(2, 4);
		
		ArrayList<Surface> listSurface = new ArrayList<>();
		listSurface.add(sq1);
		listSurface.add(c1);
		
		/* Interdit de modifier la list dans une boucle
		for(Surface surface: listSurface){
			System.out.println("Avant supression : " +  listSurface.size());
			if (surface.getArea()>10.0)
				listSurface.remove(surface);
			System.out.println("Après supression : " +  listSurface.size());
		}*/
		
		/*for (Iterator<Surface> iterator = listSurface.iterator(); iterator.hasNext();){
			Surface surface = iterator.next();
			System.out.println("Avant supression : " +  listSurface.size());
			if (surface.getArea()>10.0)
				iterator.remove();
			System.out.println("Après supression : " +  listSurface.size());
		}
		
		Surface[] sufaces = {c1,sq1};
		//Convertir un tableau en list
		List<Surface> listFromArray = new ArrayList<>(Arrays.asList(sufaces)); 
		
		// Déclaration d'une map
		HashMap<String, Surface> map = new HashMap();
		
		double[] tabSum = {rec1.getArea(),c1.getArea(),sq1.getArea()};
		AreaCalculator sum1 = new AreaCalculator();
		
		c1.printMe("cercle");
		System.out.println("La somme des surfaces est " + sum1.sumArea(tabSum));*/
		
		Paire p = new Paire("abc", "zhe");
		String x = (String) p.getPremier();
		double y = (double) p.getSecond();
		
		PaireG<String> p2 = new PaireG("abc", "zhe");
		String x2 = (String) p2.getPremier();
		//double y2 = (double) p2.getSecond(); affiche une erreur
		
		
	}

}
