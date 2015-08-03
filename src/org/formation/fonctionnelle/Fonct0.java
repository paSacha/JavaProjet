package org.formation.fonctionnelle;

import java.util.Scanner;

/**
 * @author Sacha Pagotto
 *
 */
public class Fonct0 {

	/**
	 * Fonction principale du programme
	 * 
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Appel des fonctions composant le programme
		operations();
		sommeDigit();
	}

	/**
	 * 
	 */
	private static void operations() {
		// TODO Opérations sur des nombres entiers et doubles
		int x, y;
		double v, w;
		x = 10;
		y = 3;
		v = 2.3;
		w = 5.7;

		// Différentes opérations arithmétiques sur des entiers
		System.out.println("Additon d'entier : " + (x + y));
		System.out.println("Soustraction d'entier : " + (x - y));
		System.out.println("Multiplication d'entier : " + (x * y));
		System.out.println("Division d'entier : " + (x / y));
		System.out.println("Modulo d'entier : " + (x % y));

		// Différentes opérations arithmétiques sur des doubles
		System.out.println("Additon de double : " + (v + w));
		System.out.println("Soustraction de double : " + (v - w));
		System.out.println("Multiplication de double : " + (v * w));
		System.out.println("Division de double : " + (v / w));
		System.out.println("Modulo de double : " + (v % w));
	}

	/**
	 * 
	 */
	private static void sommeDigit() {
		// TODO Récupération d'un nombre entre 0 et 1000 puis fait la somme des
		// chiffres
		System.out.println("Entrez un nombre entre 0 et 1000: ");
		Scanner input = new Scanner(System.in);
		int SD = input.nextInt();

		int lastDigit = SD % 10;
		int newNumber = SD / 10;
		int secondLastDigit = newNumber % 10;
		newNumber = SD / 10;
		int thirdLastDigit = newNumber % 10;

		newNumber = lastDigit + secondLastDigit + thirdLastDigit;

		System.out.println("La somme des digits du nombre " + SD + " est : " + newNumber);
		input.close();
	}

}
