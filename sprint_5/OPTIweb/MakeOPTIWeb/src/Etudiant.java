import java.io.IOException;
import java.util.ArrayList;


public class Etudiant {
	
	private String groupe;
	private String id;
	private String nom;
	private String prenom;
	
	public Etudiant() {
		this.groupe = "";
		this.id = "";
		this.nom = "";
		this.prenom = "";
	}
	
	public Etudiant(String pGroupe, String pId, String pNom, String pPrenom) {
		this.groupe = pGroupe;
		this.id = pId;
		this.nom = pNom;
		this.prenom = pPrenom;
	}
	
	public static ArrayList<Etudiant> faisPeterLesEtudiants() throws IOException {
		ArrayList<Etudiant> liste = new ArrayList<Etudiant>();
		ArrayList<String[]> retourLecture = new ArrayList<String[]>();
	
		retourLecture = Lecteur.lire("../test/etudiants2014_2015.csv");
	
		for (int i = 0; i < retourLecture.size(); i++) {
			String[] ligneRetour = retourLecture.get(i);
			liste.add(new Etudiant(ligneRetour[0], ligneRetour[1], ligneRetour[2], ligneRetour[3]));
		}
		return liste;
	}

	/**
	 * @return the groupe
	 */
	public String getGroupe() {
		return groupe;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	
}
