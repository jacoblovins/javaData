
public class LinkedApp {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.insert("Adam");
		names.insert("Daniel");
		names.insert("Ana");
		
		names.traverse();
		names.remove("Daniel");
		names.traverse();

	}

}
