public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        //store key ith element of list1 and value index of the ith element
        HashMap < String, Integer > map = new HashMap < String, Integer > ();
        //traverse over the whole list1
        for (int i = 0; i < list1.length; i++)
            //create an entry for each element of list1 in a hashmap
            map.put(list1[i], i);
        List < String > res = new ArrayList < > ();
        int min_sum = Integer.MAX_VALUE, sum;
        //traverse over the whole list2
        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            //for every element list2[j] of list2 encountered, check if the same element already exist as a key in the map.
            if (map.containsKey(list2[j])) {
                //get the current value of hashmap corresponding to the specified key and current j value
                //calculate the sum of value of hashmap with the j value(current indices of element that exist in the map)
                sum = j + map.get(list2[j]);
                //compare if current sum is less than the minimum sum, if so add the string to the arraylist and set mininum sum to the current sum
                if (sum < min_sum) {
                    res.clear();
                    res.add(list2[j]);
                    min_sum = sum;
                //if value of current sum equal to the value of mininum sum add the string to the arraylist
                } else if (sum == min_sum)
                    res.add(list2[j]);
            }
        }
        //return the string of array
        return res.toArray(new String[res.size()]);
    }
}
