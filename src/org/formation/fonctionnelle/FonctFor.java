package org.formation.fonctionnelle;

public class FonctFor {

	public static final String ville = "Nantes";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Déclaration des variables
		String[] tabVilles = { "Paris", "Metz", "Bordeaux", "Nantes" };
		int[] tab = { 7, 8, 9, 4, 5 };

		System.out.println("Etape 1:");
		for (int i = 0; i < 13; i++)
			System.out.println(i);

		System.out.println("Etape 2: for simple");
		for (int i = 0; i < tab.length; i++)
			System.out.println(tab[i]);

		System.out.println("Etape 2: for each");
		for (int elem : tab)
			System.out.println(elem);

		System.out.println("Etape 3: liste de villes");
		for (String elem : tabVilles) {
			if (elem.equals(ville))
				System.out.println("c'est ma ville préférée");
			else
				System.out.println("...");
		}
	}

}
