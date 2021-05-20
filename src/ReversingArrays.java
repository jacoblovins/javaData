
public class ReversingArrays {

//	time complexity is O(n)
	public int[] reverseArray(int[] nums) {
		
//		Pointer for the first item in the array
		int startIndex = 0;
		
//		Pointer for the second item
		int endIndex = nums.length - 1;
		
//		we swap 2 items in 1 iteration: so we just have to make n/2 iterations
		while(endIndex > startIndex) {
			
//			swap the two items
			swap(nums, startIndex, endIndex);
			
//			increment and decrement the indexes
			startIndex++;
			endIndex--;
		}
		return nums;
	}
	
	private void swap(int[] nums, int index1, int index2) {
		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}
}
