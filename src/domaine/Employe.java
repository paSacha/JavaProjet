package domaine;

import java.util.Collection;

public class Employe implements Ipersonnel {

	@Override
	public String toString() {
		return "Employe : " + id + ", " + prenom + ", " + nom;
	}

	// Attibuts/Membres
	private String nom;
	private String prenom;
	private int id;

	// Constructeur
	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	// Surcharge de Employe
	public Employe(String nom, String prenom) {
		this(nom, prenom, 0);
	}

	public Employe(String nom) {
		this(nom, "John", 0);
	}

	public Employe() {
		this("Dupont", "John", 0);
	}

	// Getters et Setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Méthodes
	public void demanderFormation(String dateDebut, String dateFin) {
		System.out.println("Monsieur " + getPrenom() + " " + getNom() 
		+ " pose une formation du " + dateDebut + " au " + dateFin);
	}
	
	public void demanderFormation(DemandeFormation formation){
		System.out.println("Monsieur " + getPrenom() + " " + getNom() 
		+ " pose une formation sur " + formation.getTheme() + " le " + formation.getDateDemande());
	}

	@Override
	public Collection<DemandeFormation> consulterFormations() {
		System.out.println("Consulation des formations de " + prenom + " " + nom);
		// TODO Auto-generated method stub
		return null;
	}
}
