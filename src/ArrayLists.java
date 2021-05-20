import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
//		ArrayLists use standard arrays under the hood
//		We have to import ArrayList and List
//		The default capacity is 10. We do not have to write it in
//		If we add more than 10 items, Java will resize it automatically
		List <String> names = new ArrayList<>();
		
		names.add("Kevin");
		names.add("Daniel");
		names.add("Adam");
		names.add("Ana");
		
//		System.out.println(names.get(2));
		
//		O(n)
//		System.out.println(names.remove(0));
		
		
//		System.out.println(names.get(2));
		
		System.out.println(names.size());
		
		for(String name: names) {
			System.out.println(name);
		}

	}

}
