package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Le but du jeu est que le joueur doit trouver le nombre choissit
		// par l'ordinateur
		Scanner input = new Scanner(System.in);
		int limit;
		boolean trouve = false, rejoue;
		int compt = 0;

		System.out.print("Choissez la limite haute du jeu :");
		limit = input.nextInt();

		int nb = (int) (Math.random() * limit);
		do {
			do {

				System.out.print("Choissez un nombre entre 0 et " + limit + " :");
				int nbChoix = input.nextInt();

				if (nbChoix == nb)
					trouve = true;
				else if (nbChoix < nb)
					System.out.println("C'est plus");
				else
					System.out.println("C'est moins");
				compt++;

			} while (!trouve);

			System.out.println("Bravo vous avez trouvé en " + compt + " essai(s) !");
			
			System.out.print("Souhaitez vous rejouer ? 1 pour Oui et 0 pour Non");
			int rej = input.nextInt();
			if (rej == 0)
				rejoue = true;
			else
				rejoue = false;
			
			compt = 0;
		} while (!rejoue);
		System.out.println("Fin de la partie");
		input.close();
	}

}
