class Solution {
    public int majorityElement(int[] nums) {
        //create hashmap that store element and occurences of the element
        //create variable to store current counter initialize as Integer.Min_value
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int curr_max_element = Integer.MIN_VALUE;
        int majority_element = 0;
        
        for(int i = 0; i<nums.length; i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]) > curr_max_element){
                    curr_max_element = map.get(nums[i]);
                    majority_element = nums[i];
                }
            }
        }
        return majority_element;
    }
}
