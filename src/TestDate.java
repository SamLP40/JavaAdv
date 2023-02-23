import java.util.Date;

public class TestDate {

	public static void main (String[] args) {
	Date[] tab = {new Date(), new Date(), null, new Date()};
	
	for (int i=0; i== tab.length; i++) {
		try {
		System.out.println(tab[i]);
		}
		catch (NullPointerException e){
			e =  new NullPointerException("Valeur inexistante");
		}
	}

}
}