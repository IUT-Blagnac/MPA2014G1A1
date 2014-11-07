import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;


public class MakeOPTIwebTest {
	public static void main(String[] args) throws IOException {
		
		if(isOPTIhtmlPresent()) {
			cheminEtCapture("casperAccueil.js");
			cheminEtCapture("casperCredits.js");
			cheminEtCapture("casperEtudiants.js");
			cheminEtCapture("casperIntervenants.js");
			cheminEtCapture("casperProjets.js");
			cheminEtCapture("casperSujets.js");
		}
		else
			System.out.println("Erreur : fichier \"OPTIweb.html\" manquant.");
		
	}
	
	public static boolean isOPTIhtmlPresent() {
		File f = new File("../test/");
		String[] cont = f.list();
		boolean res = false;
		
		for(int i = 0 ; i < cont.length ; i++) {
			if(cont[i].equals("OPTIweb.html")) {
				res = true;
			}
		}
		
		return res;
	}
	
	public static void cheminEtCapture(String nomFichier) throws IOException {
		FileReader fichier = new FileReader("../test/" + nomFichier);
		BufferedReader br = new BufferedReader(fichier);
		String ligne = br.readLine();
		ArrayList<String> contenu = new ArrayList<String>();
		Writer ecrivain;
		
		while(ligne != null) {
			if(ligne.contains("var CAPTURE =")) {
				contenu.add("var CAPTURE = true;");
			}
			else if(ligne.contains("var APP_URL =")) {
				contenu.add("var APP_URL = 'file:///" + System.getProperty("user.dir").replaceFirst("MakeOPTIWeb", "test") + "';");
			}
			else {
				contenu.add(ligne);
			}
			contenu.add("\n");
			
			ligne = br.readLine();
		}
		ecrivain = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("../test/" + nomFichier, false), "UTF-8"));
		
		for(int i = 0 ; i < contenu.size() ; i++) {
			ecrivain.write(contenu.get(i));
			ecrivain.flush();
		}
	}
	
	
}
