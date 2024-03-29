//Student Name: Ashtyn Roberts 
// Student ID: 893085066
import java.util.ArrayList;
import java.util.Collections;
public class BookStore {

	public static void main(String[] args) {
		ArrayList<Publication> myBookStore = new ArrayList<>();
		
		myBookStore.add(new Book ("Patricia Churchland", "Consciousness", "Neurophilosophy"));
		myBookStore.add(new Magazine("Springer Nature", "Nature", "Science and Technology"));
		myBookStore.add(new Publication("Mastering the game of Go", "Science and Technology"));
		myBookStore.add(new Book("LazyTown", "On the Nature of Baking Cakes", "Cakehop Philosophy"));
		myBookStore.add(new Book("Eric Carle", "The Very Hungry Caterpillar", "Children's Book"));
		myBookStore.add(new Magazine ("Conde Nast", "Vogue", "Fashion"));
		
		Collections.sort(myBookStore);
		
		for (Publication p: myBookStore)
				System.out.println(p.getInfo());
		
	}

}
