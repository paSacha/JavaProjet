package domaine;

public class ManagerH extends Employe {

	@Override
	public String toString() {
		return "Manager : " + getId() + ", " + getPrenom() + ", " + getNom();
	}

	public ManagerH(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}

	// Surcharge de ManagerH
	public ManagerH(String nom, String prenom) {
		this(nom, prenom, 0);
	}

	public ManagerH(String nom) {
		this(nom, "Remi", 0);
	}

	public ManagerH() {
		this("Dupuis", "Remi", 0);
	}

	// Méthodes
	public void demanderFormation(String dateDebut, String dateFin) {
		super.demanderFormation(dateDebut, dateFin);
		System.out.println("Etant manager, il valide ses propres formations");
	}

	public void validerFormation() {
		System.out.println("Le manager valide la formation");
	}

}
