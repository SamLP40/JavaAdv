
import java.util.Date;

public class FoundException {

	public static void main (String[] args) {
		Date date = null; // Date non spécifiée qui va générer une exception.
		Date today = new Date();
		try {
			System.out.println(date.getClass().getName());
			System.out.println(today.getClass().getName());
		}
		catch (NullPointerException e){ 
			System.out.println("Veuillez saisir une date.");
			System.out.println(e);

		}
	}
}

// 1.1 La méthode getClass() provient de la classe mère Object se trouvant dans la librairie de Java.
// En exécutant le programme, on génère une exception de type "NullPointer", signifiant que le programme pointe un
// objet date vide (non indiquée).
