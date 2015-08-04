package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
		boolean trouve = false;
		Scanner input = new Scanner(System.in);
		// Récupération du nombre
		System.out.print("Entrez un nombre: ");
		int nb = input.nextInt();

		label: for (int elem : tab)
			if (elem == nb) {
				trouve = true;
				break label;
			}

		if (trouve)
			System.out.println("Trouvé !");
		else
			System.out.println("Cette valeur n'existe pas!");

		input.close();
	}

}
