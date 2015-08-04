package org.formation.fonctionnelle;

public class FonctProblemeAdresses {

	public static String[] tabFournisseur = new String[10];
	public static String[] tabNomsFournisseurs = new String[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tabAdresse = new String[10];
		int[] tabClients = new int[10];

		tabAdresse[0] = "bob@aol.com";
		tabAdresse[1] = "bernard@aol.com";
		tabAdresse[2] = "camomile@orange.fr";
		tabAdresse[3] = "brand@sfr.fr";
		tabAdresse[4] = "serge@orange.fr";
		tabAdresse[5] = "ryan@gmail.com";
		tabAdresse[6] = "jack@sfr.fr";
		tabAdresse[7] = "john@gmail.com";
		tabAdresse[8] = "laure@orange.com";
		tabAdresse[9] = "tyson@aol.com";

		//On récupère les fournisseurs
		for (int i = 0; i < tabAdresse.length; i++) {
			tabFournisseur[i] = tabAdresse[i].substring(tabAdresse[i].indexOf('@') + 1, tabAdresse[i].indexOf('.'));
		}

		//Gestions des doublons pour les fournisseurs
		int z = 0;
		for (int i = 0; i < tabFournisseur.length; i++) {
			if (rechercheFournisseur(tabFournisseur[i]) == -1) {
				tabNomsFournisseurs[z] = tabFournisseur[i];
				z++;
			}
		}

		//Récupération du nombre de clients
		for (int i = 0; i < tabFournisseur.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (tabNomsFournisseurs[i] == null) {
					break;
				}
				if (tabNomsFournisseurs[i].equals(tabFournisseur[j])) {
					tabClients[i]++;
				}
			}
		}

		//Affichage pour l'utilisateur
		for (int i = 0; i < tabNomsFournisseurs.length; i++) {
			if (tabNomsFournisseurs[i] == null) {
				break;
			}
			System.out.println(
					"La part de marché de " + tabNomsFournisseurs[i] + " est de " + (tabClients[i] * 10) + "%");
		}

	}

	//méthode de recherche pour gérer les doublons
	private static int rechercheFournisseur(String Fournisseur) {
		int ct = 0;

		for (int i = 0; i < tabNomsFournisseurs.length; i++) {
			if (tabNomsFournisseurs[i] == null) {
				ct = -1;
				continue;
			}
			if (tabNomsFournisseurs[i].equals(Fournisseur)) {
				ct = i;
				break;
			} else
				ct = -1;
		}
		return ct;
	}

}
