import java.io.IOException;
import java.util.ArrayList;


public class Intervenant {
	private String id;
	private String nom;
	private String prenom;
	
	public Intervenant() {
		this.id="";
		this.nom="";
		this.prenom="";
	}
	
	public Intervenant(String pId, String pNom, String pPrenom) {
		this.id=pId;
		this.nom=pNom;
		this.prenom=pPrenom;
	}
	
	public static ArrayList<Intervenant> faisPeterLesIntervenants() throws IOException {
		ArrayList<Intervenant> liste = new ArrayList<Intervenant>();
		ArrayList<String[]> retourLecture = new ArrayList<String[]>();

		retourLecture = Lecteur.lire("../test/intervenants2014_2015.csv");

		for (int i = 0; i < retourLecture.size(); i++) {
			String[] ligneRetour = retourLecture.get(i);
			liste.add(new Intervenant(ligneRetour[0], ligneRetour[2],ligneRetour[1]));

		}

		return liste;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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


}
