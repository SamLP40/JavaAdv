import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestExcep {
	public static void main (String[] args) {
		try {
		String[] ListEleve = {"Guillaume Anselme", "Dylan de Albuquerque", "Camille Gaschet", 
				"Ludovic Dupre", "Samuel Le Porcher", "Nicolas Wache", "Francois Supervielle"}; //Liste des étudiants
			Arrays.sort(ListEleve);
			System.out.println(Arrays.toString(ListEleve));	 // Liste triée dans l'ordre croissant
			ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(ListEleve)); // Conversion du tableau string en collection
			Collections.reverse(list2); 
			System.out.println(list2);
			System.out.println(ListEleve[7]);
}	
catch (ArrayIndexOutOfBoundsException e){
	e = new ArrayIndexOutOfBoundsException("Vous avez dépassé les bornes !");
System.out.println(e); // gestion de l'exception out of bounds.
}
		finally {
			System.out.println("test"); // le programme continue à s'exécuter
			System.out.println(divParZero());
		}
		
	}
		public static int divParZero() throws ArithmeticException {
			// gestion exception arithmétique avec un throws qui va s'appliquer sur tout le bloc.
			Scanner scan = new Scanner(System.in);
			System.out.println("Saisir le numérateur : ");
			int ope = scan.nextInt();
			System.out.println("Saisir le dénominateur :");
			int ope2= scan.nextInt();
			if (ope2==0)
				throw new ArithmeticException("Impossible de diviser par 0 !"); 
			// Idem throws, mais s'applique localement.
			int div = ope / ope2;
			scan.close();
			return div;
		} // Gestion d'une exception
		

			//Throwable div = new Throwable("Vous ne pouvez pas diviser par 0 !"); // génère une nouvelle exception
//			Scanner scan = new Scanner(System.in);
//			ope3 = scan.nextInt();
//			
//			if (ope3 != 0) 
//				ope3 %= ope2;
		//	System.out.println(ope2);

}

