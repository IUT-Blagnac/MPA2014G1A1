import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Lecteur {
	public static ArrayList<String[]> lire(String nomFichier)
			throws IOException {
		ArrayList<String[]> alStr = new ArrayList<String[]>();
		BufferedReader br = null;
		String line = "";
		String separateur = ";";
		br = new BufferedReader(new FileReader(nomFichier));

		while ((line = br.readLine()) != null) {
			String[] laligne = line.split(separateur);
			alStr.add(laligne);
		}

		br.close();

		return alStr;
	}
}
