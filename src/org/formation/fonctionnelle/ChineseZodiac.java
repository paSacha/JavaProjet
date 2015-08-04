package org.formation.fonctionnelle;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// Récupération de l'année de naissance
		System.out.print("Indiquez votre année de naissance: ");
		int an = input.nextInt();

		int res = an % 12;

		// Gestion du signe par rapport à l'année de naissance
		switch (res) {
		case 0:
			System.out.print("Votre signe est le singe");
			break;
		case 1:
			System.out.print("Votre signe est le coq");
			break;
		case 2:
			System.out.print("Votre signe est le chien");
			break;
		case 3:
			System.out.print("Votre signe est le cochon");
			break;
		case 4:
			System.out.print("Votre signe est le rat");
			break;
		case 5:
			System.out.print("Votre signe est le boeuf");
			break;
		case 6:
			System.out.print("Votre signe est le tigre");
			break;
		case 7:
			System.out.print("Votre signe est le lapin");
			break;
		case 8:
			System.out.print("Votre signe est le dragon");
			break;
		case 9:
			System.out.print("Votre signe est le serpent");
			break;
		case 10:
			System.out.print("Votre signe est le cheval");
			break;
		case 11:
			System.out.print("Votre signe est le mouton");
			break;
		}

		input.close();
	}

}
