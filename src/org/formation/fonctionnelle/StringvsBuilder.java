package org.formation.fonctionnelle;

public class StringvsBuilder {

	public static void main(String[] args) {
		// TODO Comparaison entre la méthode de String et StringBuilder pour la
		// gestion de concaténation
		String lievre;
		String tortue = "";

		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			tortue = tortue + " " + i;
		}
		System.out.println(System.currentTimeMillis() - t1);

		StringBuilder sb = new StringBuilder();

		long t2 = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			sb.append(i);
			sb.append(" ");
		}
		lievre = sb.toString();
		System.out.println(System.currentTimeMillis() - t2);
	}

}
