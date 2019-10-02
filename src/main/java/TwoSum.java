class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for(int index = 0; index < nums.length; index++) {
			for(int insideIndex = index + 1; insideIndex < nums.length; insideIndex++) {
				System.out.println("Array element is: "+nums[index]);
				System.out.println("Array insideIndex element is: "+nums[insideIndex]);
				if(nums[index] + nums[insideIndex] == target) {
					result[0] = index;
					result[1] = insideIndex;
					System.out.println(result[0]);
					System.out.println(result[1]);
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] array = {3,2,4};
		int target = 6;
		twoSum(array, target);
	}
}