import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class MakeOPTIweb {
	static Writer ecrivain = null;
	
	public static void main(String[] args) {
		System.setProperty( "file.encoding", "UTF-8" );
		fabriqueToutSimone();
	}

	private static void fabriqueToutSimone() {
		try {
			ecrivain = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("OPTIweb.html"), "UTF-8"));
			fabriqueEntete();
			
			fabriqueAccueil();

			fabriqueCredits();
			
			fabriqueProjets();
			
			fabriqueSujets();
			
			fabriqueEtudiants();
			
			fabriqueIntervenants();
			
			fabriqueFin();
		} catch (IOException e) { System.out.println(e); }
		finally {
			try {ecrivain.close();} catch (Exception e) {}
		}	
	}

	private static void fabriqueEntete() throws IOException {
		ecrivain.write(
			"<!DOCTYPE html> \n" +
			"<html> \n" +
			"<head> \n" +
			"<meta http-equiv=\"Content-Type\" content=\"text/html, charset=utf-8\" /> \n" +
			"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n" +
			"<meta name=\"generator\" content=\"OPTIweb VOPTIweb\" /> \n" +
			"<title>0.1 - V0.1</title> \n" +
			"<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" /> \n" +
			"<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css\" /> \n" +
			"<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script> \n" +
			"<script src=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js\"></script> \n" +
			"<style type=\'text/css\'>  \n" +
			"@media all and (orientation:portrait) { .landscape {display: none;} } \n" +
			"@media all and (orientation:landscape) { .landscape {display: inline;} } \n" +
			"</style> \n" +
			"</head><body> \n\n"
		);
		
	}
	
	private static void fabriqueAccueil() throws IOException {
		ecrivain.write(
			"<!-- DEBUT page accueil --> \n" +
			"<div data-role=\"page\" id=\"accueil\" data-title=\"OPTIweb - V0.1\">\n" +
			"<div data-role=\"header\" data-add-back-btn=\"true\">\n" +
			"<h1>P<span class=\"landscape\">rojets </span>tut<span class=\"landscape\">orés</span> 2014-2015<br/>Département INFO<span class=\"landscape\">RMATIQUE</span><br/>IUT de Blagnac</h1>\n" +
			"<a href=\"#credits\" data-theme=\"b\" class=\"ui-btn-right\">Crédits</a>\n" +
			"</div>\n" +
			"<div data-role=\"content\">\n" +
			"<ul data-role=\"listview\" data-inset=\"true\" id=\"listeSources\">\n" +
			"<li><a href=\"#projets\"><i class=\"fa fa-tasks\"></i> Projets</a></li>\n" +
			"<li><a href=\"#sujets\"><i class=\"fa fa-copy\"></i> Sujets</a></li>\n" +
			"<li><a href=\"#etudiants\"><i class=\"fa fa-group\"></i> Etudiants</a></li>\n" +
			"<li><a href=\"#intervenants\"><i class=\"fa fa-group\"></i> Intervenants</a></li>\n" +
			"</ul>\n" +
			"</div>\n" +
			"<div data-role=\"footer\">\n " +
			"<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>\n " +
			"</div>\n" +
			"</div>\n" +
			"<!-- FIN page accueil -->\n\n" 
		);
	}

	private static void fabriqueCredits() throws IOException {
		ecrivain.write(
			"<!-- DEBUT page credits -->\n" +
			"<div data-role=\"page\" id=\"credits\" data-title=\"OPTIweb - V0.1 - Crédits\"> \n"+
			"<div data-role=\"header\" data-add-back-btn=\"true\">\n"+
			"<h1>Crédits</h1>\n"+
			"</div>\n"+
			"<div data-role=\"content\">\n"+
			"    <p>Cette application a été réalisée dans le cadre du module M3301/MPA du DUT Informatique à  l'IUT de Blagnac.</p>\n"+
			"<ul data-role=\"listview\" data-inset=\"true\" id=\"contacts\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
			"    <li data-role=\"list-divider\">Product Owner</li>\n"+
			"    <li>André PENINOU</li>\n"+
			"    <li>Université Toulouse 2 - IUT de Blagnac\n"+
			"    <br/>Département INFORMATIQUE</li>\n"+
			"</ul>\n"+
			"<ul data-role=\"listview\" data-inset=\"true\" id=\"listecredits\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
			"    <li data-role=\"list-divider\">Membres de l'équipe enseignante</li>\n"+
			"<li>Jean-Michel BRUEL</li><li>Jean-Michel INGLEBERT</li><li>André PENINOU</li><li>Olivier ROQUES</li>\n"+
			"</ul>\n"+
			"<ul data-role=\"listview\" data-inset=\"true\" id=\"listecredits\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
			"    <li data-role=\"list-divider\">Membres de l'équipe de développement</li>\n"+
			"<li>Adrien AVILES</li><li>Aurélien BERNIER LEVALOIS</li><li>Xavier GODON</li><li>Alexandre MAGISSON</li><li>Tiphaine MARTINEZ</li><li>Allan PERRIN</li><li>Anaïs RIGAL</li>\n"+
			"</ul>\n"+
			"<ul data-role=\"listview\" data-inset=\"true\" id=\"listepowered\" data-theme=\"a\" data-divider-theme=\"b\">\n"+
			"    <li data-role=\"list-divider\">Propulsé par</li>\n"+
			"    <li><a href=\"http://jquerymobile.com/\" target=\"autrePage\">http://jquerymobile.com/</a></li>\n"+
			"    <li><a href=\"http://fortawesome.github.io/Font-Awesome/\" target=\"autrePage\">http://fortawesome.github.io/Font-Awesome/</a></li>\n"+
			"</ul>\n"+
			"</div>\n"+
			"<div data-role=\"footer\">\n"+
			" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4> \n"+
			"</div>\n"+
			"</div>\n"+
			"<!-- FIN page credits -->\n\n"
			
			
		);
	}

	private static void fabriqueProjets() throws IOException {
		ArrayList<Projet> listeProjets = Projet.faisPeterLesProjets();
		//Entete
		ecrivain.write(
				"<!-- DEBUT page projets -->\n" +
				"<div data-role=\"page\" id=\"projets\" data-title=\"OPTIweb - V0.1\">\n" +
				"<div data-role=\"header\" data-add-back-btn=\"true\">\n"+
				"<h1>Projets 2014-2015</h1>\n"+
				"</div>\n"
		);
				
		//Pre-Generation
		ecrivain.write(
				"<div data-role=\"content\">\n" +
				"<form class=\"ui-filterable\">\n" +
				"<input id=\"autocomplete-input-projet\" name=\"projet\" data-type=\"search\" placeholder=\"Vous cherchez ?...\">\n" +
				"</form>\n" +
				"<ol id=\"listeprojets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-projet\">\n\n"	
		);
		
		//Generation
		for (int i=1; i<listeProjets.size(); i++) {
		ecrivain.write(
				"<li>\n" +
				"<p>\n" +
				"<b>\n" +
				"[" + getNomSujet(listeProjets.get(i).getSujet()) + "]\n" +
				"</b>\n" +
				getTitreSujet(listeProjets.get(i).getSujet()) + "\n" +
				"</p>\n" +
				"<p>\n" +
				"<b>\n" +
				"Client :\n" +
				"</b>\n" +
				getClient(listeProjets.get(i).getClient()) + "\n" + 
				"</p>\n" +
				"<p>\n" +
				"<b>\n" +
				"Superviseur :\n" +
				"</b>" + 
				getSuperviseur(listeProjets.get(i).getSuperviseur()) + "\n" +
				"</p>" +
				"<p>" +
				"<b>" +
				"Groupe " + listeProjets.get(i).getGroupe() + " : " + 
				"</b>" + 
				getLesEtudiantsDuGroupe(listeProjets.get(i).getGroupe()) + "\n" +
				"</p>" +
				"</li>"			
		);
		}
				
		//Fin
		ecrivain.write(		
				"</ol>" + 
				"</div>" + 
				"<div data-role=\"footer\">"+ 
				 "<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-tasks fa-2x\"></i></h4>"+ 
				"</div>"+
				"</div>"+
				"<!-- FIN page projets -->"		
		);
		
	}

	private static void fabriqueSujets() throws IOException {
		ArrayList<Sujet> listeSuj = Sujet.faisPeterLesSujets();
		
		//ça c'est l'entete
		ecrivain.write(
			"<!-- DEBUT page sujets -->\n" +	
			"<div data-role=\"page\" id=\"sujets\" data-title=\"OPTIweb - V0.1\">\n"+
				"<div data-role=\"header\" data-add-back-btn=\"true\">\n"+
					"<h1>Sujets 2014-2015</h1>\n"+
				"</div>\n"+
				"<div data-role=\"content\">\n"
				);
		
		//ça c'est le truc pas généré
		ecrivain.write(
			"<form class=\"ui-filterable\"> \n" +
				"<input id=\"autocomplete-input-sujet\" name=\"sujet\" data-type=\"search\" placeholder=\"Vous cherchez ?\">\n" +
			"</form>\n" +
			"<ol id=\"listesujets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-sujet\" data-divider-theme=\"b\" data-count-theme=\"a\">\n" +
					"<li data-role=\"list-divider\">Sujet\n" +
						"<span class=\"ui-li-count\" title=\"Groupe\" style=\"right: 40px !important;\">Groupe\n" +
						"</span>\n" +
					"</li>\n\n");
		
		//Et ça, c'est généré
		for (int i = 1; i<listeSuj.size(); i++) {
			String id = listeSuj.get(i).getId();
			String nom = listeSuj.get(i).getNom();
			String titre = listeSuj.get(i).getTitre();
			ecrivain.write(
					"<li data-find = \"["+ nom +"]\">\n" +
						"<a href=\"#projets\">["+ nom +"]\n" +
							"<br/>\n" +
							"<div style=\"white-space:normal;\">\n" +
								"<span>\n" +
									"<b>" + titre + "</b>\n" +
								"</span>\n" +
								"<span class=\"ui-li-count\">" + getSesGroupes(id) +
								"</span>\n" +
							"</div>\n" +
						"</a>\n" +
					"</li>\n\n" 									
					);
		}	
		
		//C'est déjà fini ? :(
		ecrivain.write(
				"</ol>\n"+
				"</div>\n"+
				"<div data-role=\"footer\">\n"+
				"<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-copy fa-2x\"></i></h4>\n" +
				"</div>\n"+
				"</div>\n"+
				"<!-- FIN page sujets -->\n\n"
				
				);
	}

	private static void fabriqueEtudiants() throws IOException {
		ArrayList<Etudiant> listeEtud = Etudiant.faisPeterLesEtudiants();
		//Partie du header
		ecrivain.write(
				"<!-- DEBUT page etudiants -->\n" +
				"<div data-role=\"page\" id=\"etudiants\" data-title=\"OPTIweb - V0.1\" >\n" +
				"<div data-role=\"header\" data-add-back-btn=\"true\"> \n" +
				"<h1>Etudiants 2014-2015</h1>\n"+
				"</div>\n"+
				"<div data-role=\"content\">\n\n");
		//Partie avant la génération
		ecrivain.write(
				"<form class=\"ui-filterable\">" +
						"<input id=\"autocomplete-input-etudiant\" name=\"etudiant\" data-type=\"search\" placeholder=\"Etudiant ou Groupe X\">" +
				"</form>" +
				"<ol id=\"listeetudiants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-etudiant\" data-divider-theme=\"b\">" +
					"<li data-role=\"list-divider\">Etudiant" +
						"<span class=\"ui-li-count\" title=\"Groupe\" style=\"right: 40px !important;\">Groupe" +
						"</span>" +
					"</li>"
				);
		
		//Partie générée
		for (int i = 1;i<listeEtud.size();i++) {
			String groupe = listeEtud.get(i).getGroupe();
			String nom = listeEtud.get(i).getNom();
			String prenom = listeEtud.get(i).getPrenom();
			
			ecrivain.write(
				"<li data-find=\"" + prenom + " " + nom + "\">\n" +
					"<a href=\"#projets\">" + nom + " " + prenom + "\n" +
						"<span class=\"ui-li-count\" title=\"Groupe\"> Groupe " + groupe + "\n" +
						"</span>\n" +
					"</a>\n" + 
				"</li>\n"				
				);
		}
		
		//Partie de fermeture
		ecrivain.write(
				"</div>\n" +
				"<div data-role=\"footer\">\n" +
				"<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4>\n" +
				"</div>\n" +
				"</div>\n" +
				"<!-- FIN page etudiants -->\n\n"
				);
		
	}

	private static void fabriqueIntervenants() throws IOException {
		ArrayList<Intervenant> listInter = Intervenant.faisPeterLesIntervenants();
		// ça c'est l'entete OUI OUI C'EST VRAI
		ecrivain.write(
				"<div data-role=\"page\" id=\"intervenants\" data-title=\"OPTIweb - V0.1\">"+
				"<div data-role=\"header\" data-add-back-btn=\"true\">"+
				"<h1>Intervenants 2014-2015</h1>"+
				"</div>"+
				"<div data-role=\"content\">"
					);
		
		//ça c'est la barre de recherche tmtc koman l é trop bel
		ecrivain.write(
				"<form class=\"ui-filterable\">"+
						"<input id=\"autocomplete-input-intervenant\" name=\"intervenant\" data-type=\"search\" placeholder=\"Intervenant\">"+
				"</form>"+
				"<ul id=\"listeintervenants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-intervenant\" data-divider-theme=\"b\">"+
					"<li data-role=\"list-divider\">Intervenant" +
						"<span class=\"ui-li-count\" style=\"right: 110px !important;\" title=\"Client\">Client" +
						"</span>" +
						"<span class=\"ui-li-count\" title=\"Superviseur\">Superviseur"+
						"</span>"+
					"</li>"
				);
		//ça c'est généré :o
		for (int i=1; i< listInter.size();i++) {
			String id = listInter.get(i).getId();
			String nom = listInter.get(i).getNom();
			String prenom = listInter.get(i).getPrenom();
			
			ecrivain.write(
				"<li data-find=\"" + nom + " " + prenom + "\">\n" +
					"<a href=\"#projets\">" + nom + " " + prenom + "\n" +
						"<span class=\"ui-li-count\" style=\"right: 120px !important;\" title=\"Client\">" + getSesClients(id) + "\n" + 
						"</span>\n" +
						"<span class=\"ui-li-count\" title=\"Superviseur\">" + getSesSuper(id) + "\n" +
						"</span>\n" +
					"</a>\n" +
				"</li>\n\n"	
			);
			
		// ça c'est la fin ouuuuuh
		}
		ecrivain.write(
				"</ul>" + 
				"</div>"+
				"<div data-role=\"footer\"> "+
				"<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4>" +
				"</div>"+
				"</div>" +
				"<!-- FIN page intervenants -->\n\n"
		);
	}

	private static void fabriqueFin() throws IOException {
		ecrivain.write(
			"<script>\n" +
			"// li click handler which fills the projects search bar\n" +
			"// with the value of the current data-find attribute\n" +
			"$( 'li[data-find]' ).on( 'click',function(event){\n" +
				"$(\"#autocomplete-input-projet\").val($(this).attr('data-find')).trigger('change');\n" +
			"});\n" +
			"</script>\n" +
			"</body>\n" +
			"</html>"
		);
		
		
	}
	
	private static String getSesGroupes(String idSujet) throws IOException {
		ArrayList<Projet> listProj = Projet.faisPeterLesProjets();
		Projet actuel = null;
		String leTrucARenvoyer = "";
		for (int i = 0; i<listProj.size();i++) {
			actuel = listProj.get(i);
			if (actuel.getSujet().equals(idSujet)) {
				if (leTrucARenvoyer.equals("")) {
					leTrucARenvoyer = actuel.getGroupe();
				}
				else {
					leTrucARenvoyer = leTrucARenvoyer + " " + actuel.getGroupe();
				}
					
			}
		}
		
		return leTrucARenvoyer;
	}

	private static String getSesClients(String idInter) throws IOException {
		ArrayList<Projet> listProj = Projet.faisPeterLesProjets();
		Projet actuel = null;
		int moiCombienClient = 0;
		for (int i = 0; i<listProj.size();i++) {
			actuel = listProj.get(i);
			if (actuel.getClient().equals(idInter)) {
				moiCombienClient++;
			}
		}
		return String.valueOf(moiCombienClient);
	}
	
	private static String getSesSuper(String idInter) throws IOException {
		ArrayList<Projet> listProj = Projet.faisPeterLesProjets();
		Projet actuel = null;
		int moiCombienClient = 0;
		for (int i = 0; i<listProj.size();i++) {
			actuel = listProj.get(i);
			if (actuel.getSuperviseur().equals(idInter)) {
				moiCombienClient++;
			}
		}
		return String.valueOf(moiCombienClient);
	}
	
	private static String getNomSujet(String leSujet) throws IOException {
		ArrayList<Sujet> listSujet = Sujet.faisPeterLesSujets();
		Sujet actuel = null;
		String leTrucRenvoye = "";
		for (int i = 0; i<listSujet.size();i++) {
			actuel = listSujet.get(i);
			if (actuel.getId().equals(leSujet)) {
				leTrucRenvoye = actuel.getNom();
				break;
			}
		}
		return leTrucRenvoye;
	}
	
	private static String getTitreSujet(String leSujet) throws IOException {
		ArrayList<Sujet> listSujet = Sujet.faisPeterLesSujets();
		Sujet actuel = null;
		String leTrucRenvoye = "";
		for (int i = 0; i<listSujet.size();i++) {
			actuel = listSujet.get(i);
			if (actuel.getId().equals(leSujet)) {
				leTrucRenvoye = actuel.getTitre();
				break;
			}
		}
		return leTrucRenvoye;
	}
	
	private static String getClient(String leClient) throws IOException {
		ArrayList<Intervenant> listInter = Intervenant.faisPeterLesIntervenants();
		Intervenant actuel = null;
		String leTrucRenvoye = "";
		for (int i = 0; i<listInter.size();i++) {
			actuel = listInter.get(i);
			if (actuel.getId().equals(leClient)) {
				leTrucRenvoye = actuel.getNom();
				leTrucRenvoye = leTrucRenvoye + " " + actuel.getPrenom();
				break;
			}
		}
		return leTrucRenvoye;
	}
	
	private static String getSuperviseur(String leSuper) throws IOException {
		ArrayList<Intervenant> listInter = Intervenant.faisPeterLesIntervenants();
		Intervenant actuel = null;
		String leTrucRenvoye = "";
		for (int i = 0; i<listInter.size();i++) {
			actuel = listInter.get(i);
			if (actuel.getId().equals(leSuper)) {
				leTrucRenvoye = actuel.getNom();
				leTrucRenvoye = leTrucRenvoye + " " + actuel.getPrenom();
				break;
			}
		}
		return leTrucRenvoye;
	}
	
	private static String getLesEtudiantsDuGroupe(String leGroupe) throws IOException {
		ArrayList<Etudiant> listEtud = Etudiant.faisPeterLesEtudiants();
		Etudiant actuel = null;
		String leTrucRenvoye = "";
		boolean isFirstTime = true;
		for (int i=0; i<listEtud.size();i++) {
			actuel = listEtud.get(i);
			if (actuel.getGroupe().equals(leGroupe)) {
				if (!isFirstTime) leTrucRenvoye = leTrucRenvoye +  " - ";
				leTrucRenvoye = leTrucRenvoye + actuel.getPrenom() + " " + actuel.getNom();
				isFirstTime = false;
			}
		}
		return leTrucRenvoye;
	}

}
