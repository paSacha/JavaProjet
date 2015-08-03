package org.formation.fonctionnelle;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// Récupération de la note
		System.out.print("Indiquez votre note sur 100: ");
		int note = input.nextInt();

		if (note > 100) {
			System.out.println("TRICHEUR !");
		} else if (note > 89) {
			System.out.println("Vous avez A ! Félicitation !!");
		} else if (note > 79) {
			System.out.println("Vous avez B ! Continuez comme ça");
		} else if (note > 63) {
			System.out.println("Vous avez C ! Vous pouvez mieux faire");
		} else {
			System.out.println("Vous avez F ! Fait tes valises...");
		}

		input.close();
	}

}
