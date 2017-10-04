
/*

Two Sum

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are NOT zero-based

*/

public int[] twoSum(int [] nums, int target){

	int []res = new int[2];
	HashMap<Integer, Integer> m = HashMap<>();

	for(int i = 0; i < nums.length; i++){
		m.put(nums[i], i);
	}

	for(int i = 0; i < nums.length; i++){
		int tmp = target - nums[i]; 
		if(m.containsKey(tmp) && m.get(tmp) != i){
			res[0] = i + 1;
			res[1] = m.get(tmp) + 1;
			break;
		}
	}
	return res;
}