import java.io.IOException;
import java.util.ArrayList;



public class Projet {
	
	private String id;
	private String groupe;
	private String sujet;
	private String client;
	private String superviseur;
	
	public Projet() {
		this.id="";
		this.groupe="";
		this.sujet="";
		this.client="";
		this.superviseur="";
	}
	
	public Projet(String pId, String pGroupe, String pSujet, String pClient, String pSuperviseur) {
		this.id= pId;
		this.groupe= pGroupe;
		this.sujet= pSujet;
		this.client=pClient;
		this.superviseur=pSuperviseur;
	}
	
	public static ArrayList<Projet> faisPeterLesProjets()throws IOException{
		ArrayList<Projet> liste = new ArrayList<Projet>();
		ArrayList<String[]> retourLecture = new ArrayList<String[]>();

		retourLecture = Lecteur.lire("../test/projets2014_2015.csv");

		for (int i = 0; i < retourLecture.size(); i++) {
			String[] ligneRetour = retourLecture.get(i);
			liste.add(new Projet(ligneRetour[0], ligneRetour[1],ligneRetour[2], ligneRetour[3], ligneRetour[4]));

		}

		return liste;
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the groupe
	 */
	public String getGroupe() {
		return groupe;
	}

	/**
	 * @return the sujet
	 */
	public String getSujet() {
		return sujet;
	}

	/**
	 * @return the client
	 */
	public String getClient() {
		return client;
	}

	/**
	 * @return the superviseur
	 */
	public String getSuperviseur() {
		return superviseur;
	}

}
