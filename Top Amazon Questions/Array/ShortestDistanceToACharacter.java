class Solution {
    public int[] shortestToChar(String s, char c) {
        //store index of char c that occurs in String s
        ArrayList<Integer> c_index = new ArrayList<Integer>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == c){
                c_index.add(i);
            }
            //if current char not equal to c continue to next iteration
            continue;
        }
        int result[] = new int[s.length()];
        //left and right is to update index of c_index Arraylist
        int right = 0;
        int left = 0;
        for(int i = 0; i<s.length();i++){
            //if current index bigger than current c position, meaning current index pass through the c_index.get(right), 
            //we need to update left position to right position
            if(i > c_index.get(right)){
                left = right;
                //check if right is smaller than size of arraylist,because we dont want to get index out of bound, 
                //only update right position when this condition is true
                if(right < c_index.size()-1){
                    right = right + 1;
                }
            }
            //check the minimum possible distance of c_index[position] from current index, compare the right c_index[right] and the left c_index[left]
            //set the min value into result array
            result[i] = Math.min((Math.abs(i - c_index.get(right))),(Math.abs(i - c_index.get(left))));
        }
        return result;
    }
}
