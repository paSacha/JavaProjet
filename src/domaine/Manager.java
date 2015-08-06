package domaine;

public class Manager {
	// Attibuts/Membres
	private String nom;
	private String prenom;
	private int id;

	// Constructeur
	public Manager(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
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
	public void demanderFormation(String theme) {
		System.out.println("Le manager " + prenom + " " + nom + " demande une formation sur " + theme);
	}
	
	public void validerFormation(){
		System.out.println("Le manager valide la formation");
	}
}
