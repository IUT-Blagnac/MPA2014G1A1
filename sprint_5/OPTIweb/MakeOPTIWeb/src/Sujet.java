import java.io.IOException;
import java.util.ArrayList;


public class Sujet {
	
	private String id;
	private String nom;
	private String titre;
	
	public Sujet() {
		this.id = "";
		this.nom = "";
		this.titre = "";
	}
	
	public Sujet(String pId, String pNom, String pTitre) {
		this.id = pId;
		this.nom = pNom;
		this.titre = pTitre;
	}
	
	public static ArrayList<Sujet> faisPeterLesSujets() throws IOException {
		ArrayList<Sujet> liste = new ArrayList<Sujet>();
		ArrayList<String[]> retourLecture = new ArrayList<String[]>();

		retourLecture = Lecteur.lire("../test/sujets2014_2015.csv");

		for (int i = 0; i < retourLecture.size(); i++) {
			String[] ligneRetour = retourLecture.get(i);
			liste.add(new Sujet(ligneRetour[0], ligneRetour[1],
					ligneRetour[2]));

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

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
}
