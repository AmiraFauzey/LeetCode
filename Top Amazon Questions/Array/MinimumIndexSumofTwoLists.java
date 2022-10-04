class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // Store every place with it's index in list1
        HashMap<String, Integer> seen = new HashMap();
        
        // Store the places from list1 to seen
        for (int i = 0; i < list1.length; i++) {
            seen.put(list1[i], i);
        }
        
        // This will store places by it's sum index
        HashMap<Integer, ArrayList<String>> least_common_places = new HashMap();
        
        // We will keep track of smallest index sum here
        int least_index_sum = Integer.MAX_VALUE;
        
        // Loop over every place in list2
        for (int i = 0; i < list2.length; i++) {
            
            // If a place from list2 in seen(a hashmap for list1)
            if (seen.containsKey(list2[i])) {
                // Calculate the index sum
                int index_sum = seen.get(list2[i]) + i;
                
                // Keep track of smallest index sum
                if (index_sum < least_index_sum) {
                    least_index_sum = index_sum;
                }
                
                // If index_sum(the key) is in hashmap (least common places)
                if (least_common_places.containsKey(index_sum)) {
                    least_common_places.get(index_sum).add(list2[i]);;
                } else { // If index_sum(the key) not in hashmap (least common places)
                    least_common_places.put(index_sum, new ArrayList<String>());
                    least_common_places.get(index_sum).add(list2[i]);
                }
                
            }
        }
        // The the places from least_index_sum
        return least_common_places.get(least_index_sum).toArray(new String[0]);
    }
}
