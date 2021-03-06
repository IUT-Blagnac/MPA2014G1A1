import java.io.IOException;
import java.util.ArrayList;


public class Mapage {
	
	private static void fabriqueProjets() throws IOException {
		ArrayList<Projet> listeProjets = Projet.faisPeterLesProjets();
		ecrivain.write(
				"<!-- DEBUT page projets -->" +
				"<div data-role=\"page\" id=\"projets\" data-title=\"OPTIweb - V0.1\">" +
				"	<div data-role=\"header\" data-add-back-btn=\"true\">"+
				"	<h1>Projets 2014-2015</h1>"+
				"</div>"+
				
				// Le truc � g�n�rer
//				"<div data-role=\"content\">"+
//				"<form class=\"ui-filterable\"><input id=\"autocomplete-input-projet\" name=\"projet\" data-type=\"search\" placeholder=\"Vous cherchez ?...\"></form><ol id=\"listeprojets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-projet\"><li><p><b>[Archeologie]</b> Groupe de recherche Chass�en M�ridional</p><p><b>Client :</b> TISSIER Evelyne</p><p><b>Superviseur :</b> CANUT Marie-Fran�oise</p><p><b>Groupe A :</b> Etienne LARROUY - Victor PINQUIER - Antoine RIVALIER - Jean-Sebastien TRILLE - </p></li><li><p><b>[SWAML]</b> Site web association \"Marie Louise\"</p><p><b>Client :</b> LAFON Isabelle</p><p><b>Superviseur :</b> DEMAY Laurent</p><p><b>Groupe B :</b> Julie BADETS - Nicolas GAUTHIER - Theophane GIRARD - Simon PREVIDENTE - </p></li><li><p><b>[ReconfMI]</b> D�veloppement interface graphique</p><p><b>Client :</b> STOLF Patricia</p><p><b>Superviseur :</b> CANUT Marie-Fran�oise</p><p><b>Groupe C :</b> Julien CORDEAU-GONORD - Florian GARIBAL - Serge MOLINA - Romain NOTO - </p></li><li><p><b>[GESDEP]</b> Finalisation et d�ploiement de l'application de gestion des d�placements des personnels</p><p><b>Client :</b> DARAN Xavier</p><p><b>Superviseur :</b> REDON Laurence</p><p><b>Groupe D :</b> Tim DAZAYOUS - Alexandre ERB - Gabriel GODARD - Corentin HERMET - Nathan LOPEZ - </p></li><li><p><b>[SimulMI]</b> D�veloppement de simulateur</p><p><b>Client :</b> STOLF Patricia</p><p><b>Superviseur :</b> DE MICHIEL Marianne</p><p><b>Groupe E :</b> Adrien AVILES - Aurelien BERNIER LEVALOIS - Allan PERRIN - Theo PIBOUBES - </p></li><li><p><b>[BDM NoSQL]</b> D�veloppement d�un logiciel de conception d�une base de donn�es multidimensionnelles</p><p><b>Client :</b> TESTE Olivier</p><p><b>Superviseur :</b> ROQUES Olivier</p><p><b>Groupe F :</b> Arnauld ALEX - Nicolas AUBERT - Tiphaine MARTINEZ - Kristen VIGUIER - </p></li><li><p><b>[E-ICGD]</b> Environnement d'int�gration continue de g�n�ration de documentation</p><p><b>Client :</b> BRUEL Jean-Michel</p><p><b>Superviseur :</b> ROQUES Olivier</p><p><b>Groupe G :</b> Pierre JEANJEAN - Quentin LACOSTE - Florian OUDDANE - Anselme REVUZ - </p></li><li><p><b>[PrestaShop]</b> Application et tutoriel sur Prestashop (logiciel e-commerce gratuit )</p><p><b>Client :</b> NONNE Laurent</p><p><b>Superviseur :</b> CHANCOGNE Laurent</p><p><b>Groupe H :</b> Adrien ANDUZE - Alexandre MAGISSON - Anais RIGAL - </p></li><li><p><b>[ApexEComm]</b> Application et tutoriel Oracle Apex pour un site d'e-commerce</p><p><b>Client :</b> NONNE Laurent</p><p><b>Superviseur :</b> TESTE Olivier</p><p><b>Groupe I :</b> Camille ALRAM - Yassine CHAHID KSABI - Remi HANNE - Edwin MARTIN - </p></li><li><p><b>[SoftVolley]</b> SoftVolley : explication de strat�gies de jeu au Volley-ball</p><p><b>Client :</b> MOULIN Cyril</p><p><b>Superviseur :</b> P�NINOU Andr�</p><p><b>Groupe J :</b> Tristan BAVEREZ - Clement BOUSQUET - Alexane DUROZIER - </p></li><li><p><b>[Prodif]</b> Refactoring de l'application Java PRODIF</p><p><b>Client :</b> BRUEL Jean-Michel</p><p><b>Superviseur :</b> OBER Iulian</p><p><b>Groupe K :</b> Lucas GAMEZ - Alexis LIEU - Mathieu POUX - Mehdi SLAMNIA - </p></li><li><p><b>[RegExp]</b> Application p�dagogique d'apprentissage des expressions r�guli�res par l'exp�rience</p><p><b>Client :</b> SOTIN Pascal</p><p><b>Superviseur :</b> BOULLE R�mi</p><p><b>Groupe L :</b> Benjamin COLLIGNON - Jean-Philippe PERE - Nathan SANTACANA - Vimel VERON - </p></li><li><p><b>[Refactor]</b> Refactoring de site web statique en site web dynamique</p><p><b>Client :</b> BRUEL Jean-Michel</p><p><b>Superviseur :</b> OBER Iulian</p><p><b>Groupe M :</b> Nicolas BOCHU - Jean-Brice CANIHAC - Allan DIAZ - Vincent EYCHENNE - Sylvain MAILLOT - </p></li><li><p><b>[Architekt]</b> Architekt</p><p><b>Client :</b> CHANCOGNE Laurent</p><p><b>Superviseur :</b> INGLEBERT Jean-Michel</p><p><b>Groupe N :</b> Alexandre BONNET - Timothee FICAT - Killian TESSIER - Thomas VINCENOT - </p></li><li><p><b>[Architekt]</b> Architekt</p><p><b>Client :</b> CHANCOGNE Laurent</p><p><b>Superviseur :</b> SOTIN Pascal</p><p><b>Groupe O :</b> Mael AUBERT - Bilal EL YASSEM - Guillaume FOURNET - Aurelien SCUOTTO - Damien WOJTOWICZ - </p></li><li><p><b>[Carsat]</b> Questionnaire client sur page web et traitement des donn�es</p><p><b>Client :</b> HARDY Laurent</p><p><b>Superviseur :</b> DEMAY Laurent</p><p><b>Groupe P :</b> Jeremy ALVES NETO - Anais CHAUMEIL - Lea FOISSAC - Leo JOSEPH - Marine SUTARIK - </p></li><li><p><b>[PrestaShop]</b> Application et tutoriel sur Prestashop (logiciel e-commerce gratuit )</p><p><b>Client :</b> NONNE Laurent</p><p><b>Superviseur :</b> VERDIER Mich�le</p><p><b>Groupe Q :</b> Quentin CESPEDES - Alex JACQUOT-FERNANDEZ - Hanae RHAYOUR - Abdellah ZARIOH - </p></li></ol>"+
//				"</div>"+

				"<div data-role=\"footer\">"+ 
				 "<h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-tasks fa-2x\"></i></h4>"+ 
				"</div>"+
				"</div>"+
				"<!-- FIN page projets -->"		
		);
		
	}

}
