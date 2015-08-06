package domaine;

public class DemandeFormation {

	// Attributs/Membres
	private String theme;
	private String dateDemande;
	private String etatValidation;

	public final static String REFUS = "refus";
	public final static String ACCORDE = "valide";
	public final static String ATTENTE = "en attente";

	// Constructeur
	public DemandeFormation(String theme, String dateDemande, String etatValidation) {
		super();
		this.theme = theme;
		this.dateDemande = dateDemande;
		this.etatValidation = etatValidation;
	}

	public DemandeFormation(String theme, String dateDemande) {
		this(theme, dateDemande, DemandeFormation.ATTENTE);
	}

	// Getters et Setters
	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	// Méthodes
	

}
