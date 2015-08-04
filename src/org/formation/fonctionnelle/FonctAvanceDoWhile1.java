package org.formation.fonctionnelle;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		// TODO Recherche d'une suite de deux nombres pair et un impair puis
		// affichage du nombre de coups nécessaire
		double nb1, nb2, nb3;
		int compt = 0;

		do {
			nb1 = Math.random() * 1000;
			nb2 = Math.random() * 1000;
			nb3 = Math.random() * 1000;

			compt++;

		} while (!((nb1 % 2 < 1) && (nb2 % 2 < 1) && (nb3 % 2 >= 1)));

		System.out.println("Trouvé en " + compt + " essais");
	}

}
