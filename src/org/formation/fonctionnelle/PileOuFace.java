package org.formation.fonctionnelle;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// D�finition du nombre al�atoire entre 0 et 1
		int number = (int) (Math.random() * 2);

		Scanner input = new Scanner(System.in);
		// R�cup�ration du choix
		System.out.println("Choisissez 0 ou 1: ");
		int choix = input.nextInt();

		if (choix == number) {
			System.out.println("Gagn� !");
		} else if (number == 0) {
			System.out.println("Perdu c'�tait Pile!");
		} else {
			System.out.println("Perdu c'�tait Face!");
		}
		input.close();
	}

}
