class Solution {
    public int missingNumber(int[] nums) {
    //Use Gauss Formula to find total number from [0,n]
    //(n(n + 1))/2
    int  n = nums.length;
		int total = 0;
		total = (n * (n + 1)) / 2;
		int sum = 0;
    //find total number from input array
		for(int num : nums) {
			sum += num;
		}
    //subtract total number from [0,n] with sum of number from input array
		return total - sum;
    }
}
//input array => [3,0,1]
//Example 
//Total = 0 + 1 + 2 + 3 = 6
//Sum = 0 + 1 + 3 = 4
//To find missing number => Total - Sum = missing number
//To find total number from 0 to n => (n(n + 1))/2 => Gauss formula
//To find sum of number in the input array => iterate an array added each element and store in variable sum
