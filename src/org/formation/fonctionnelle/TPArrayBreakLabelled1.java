package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tab1 = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };

		boolean trouve = false;
		Scanner input = new Scanner(System.in);
		// Récupération du nombre
		System.out.print("Entrez un nombre: ");
		int nb = input.nextInt();

		label1: for (int i = 0; i < tab1.length; i++) {
			for (int j = 0; j < tab1[i].length; j++) {
				if (tab1[i][j] == nb) {
					trouve = true;
					System.out.println("Trouvé à l'indice " + i + "," + j);
					break label1;
				}
			}
		}
		if (!trouve)
			System.out.println("Cette valeur n'existe pas!");

		input.close();
	}

}
