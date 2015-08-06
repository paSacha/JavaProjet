package lanceur;

import domaine.DemandeFormation;
import domaine.Employe;
import domaine.Manager;
import domaine.ManagerH;
import domaine.ServicePaie;

/**
 * @author Sacha Pagotto
 * @version 0.1
 */
public class LanceurGestionFormations {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		// TODO 1) Déclaration
		Employe employe1;
		ManagerH man1, man2, man3;
		DemandeFormation demande1;
		ServicePaie paie = new ServicePaie();
		// TODO 2) Instantation
		employe1 = new Employe("Dupont", "Jean", 1);
		demande1 = new DemandeFormation("Spring", "04/11/89", "En cours de traitement");
		man1 = new ManagerH("Dupont", "Bob", 3);
		man2 = new ManagerH();
		man3 = new ManagerH("Paul", "Richard");
		
		DemandeFormation dg1 = new DemandeFormation("Java", "06/06/2015");
		DemandeFormation dg2 = new DemandeFormation("Management", "21/08/2014");
		
		employe1.demanderFormation(dg1);
		man1.demanderFormation(dg2);
		// TODO 3) Utilisation
		/*employe1.demanderFormation("04/09/98", "20/09/98");

		man1.demanderFormation("11/07/99", "15/10/99");

		System.out.println(employe1);
		System.out.println(man2);
		System.out.println(man1);*/
		
		//Utilisation du service paie
		paie.listerFormationPersonnel(employe1);
		paie.listerFormationPersonnel(man1);
		
	}

}
