class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1; int width = 0;
        //traverse each characters of String s
        for(char c : s.toCharArray()){
            //retrieve every element from array of widths by getting the index of each element by subtracting character ascii value with ascii value of 'a' = 97
            int w = widths[c - 'a'];
            //assign total number of widths for each line
            width += w;
            //check if current width is greater than 100
            //if it does greater than 100, we go to the next line
            //then we assign width with the value of last line width
            //if current width less than 100, we just return current total last line width
            if(width > 100){
                lines++;
                width = w;
            }
        }
        //return new array with 2 elements
        return new int[] {lines,width};
    }
}

//result[0] is the total number of lines.
//result[1] is the width of the last line in pixels.
