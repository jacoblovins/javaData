
public class Arrays {

	public static void main(String[] args) {
		
//		int[] nums = new int[10];
//		
//		for(int i = 0; i < 10; ++i) {
//			nums[i] = i;
//		}
//
////		we know the index of the item we want to manipulate
//		nums[0] = 100;   // O(1)
//		
////		If we do not know the index of the item
////		Linear search O(n)
//		for(int i = 0; i < 10; ++i) {
//			if(nums[i] == 6) {
//				System.out.println("We have found the item at index: " + i);
//			}
//		}
//		
//			
//		for(int i = 0; i < 10; ++i) {
//			System.out.println(nums[i]);
//		}
		
		
//		Reversing arrays interview question
		int[] nums = {1, 2, 3, 4};
		
		ReversingArrays reverseArray = new ReversingArrays();
		
		int[] reversedArray = reverseArray.reverseArray(nums);
		
		for(int i = 0; i < reversedArray.length; i++) {
			System.out.println(reversedArray[i] + " ");
		}
		
		
		
//		Anagram interview question
		char[] s1 = {'r', 'e', 's', 't', 'f', 'u', 'l'};
		char[] s2 = {'f', 'l', 'u', 's', 't', 'e', 'r'};
		
		AnagramProblem anagramProblem = new AnagramProblem();
		System.out.println(anagramProblem.solve(s1, s2));
		
		
		
		
		

	}
	
	

}
