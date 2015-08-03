package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partie2();
	}

	private static void partie2() {
		// TODO Calcul du volume d'un cylindre

		// final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		// Récupération du rayon
		System.out.println("Entrez le rayon du cylindre: ");
		double rayon = input.nextDouble();

		// Récupération de la longueur
		System.out.println("Entrez la longueur du cylindre: ");
		double longueur = input.nextDouble();

		// Calcul de l'aire
		double aire = rayon * rayon * Math.PI;
		// Calcul du volume
		double volume = aire * longueur;

		System.out.println("L'aire est de " + aire + " et le volume de " + volume);
		input.close();
	}

}
