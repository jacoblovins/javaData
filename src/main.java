
public class main {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		for(int i = 0; i < 10; ++i) {
			nums[i] = i;
		}

//		we know the index of the item we want to manipulate
		nums[0] = 100;   // O(1)
		
//		If we do not know the index of the item
//		Linear search O(n)
		for(int i = 0; i < 10; ++i) {
			if(nums[i] == 6) {
				System.out.println("We have found the item at index: " + i);
			}
		}
		
			
		for(int i = 0; i < 10; ++i) {
			System.out.println(nums[i]);
		}
		

	}

}
