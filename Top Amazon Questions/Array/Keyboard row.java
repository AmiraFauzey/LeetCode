class Solution {
    public String[] findWords(String[] words) {
        //1.Store first row characters in hash set 1
        //2.store second row characters in hash set 2
        //3.store third row character in hash set 3
        //4.create new arrays to extract characters from words
        //5.check if characters in new arrays exist in hash set
        //6.create a variable to increment everytime characters exist in hash set
        //7.create array list to store 
        //8.if length of variable equal to the length of words add words into arraylist
        //9.create new array to store characters from arraylist
        
        String row1 = "QWERTYUIOPqwertyuiop";
        String row2 = "ASDFGHJKLasdfghjkl";
        String row3 = "ZXCVBNMzxcvbnm";
        
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();
        HashSet<Character> set3 = new HashSet<Character>();
        
        for(int i = 0; i<row1.length(); i++){
            set1.add(row1.charAt(i));
        }
        for(int i = 0; i<row2.length(); i++){
            set2.add(row2.charAt(i));
        }
        for(int i = 0; i<row3.length(); i++){
            set3.add(row3.charAt(i));
        }
        
        int num1 = 0, num2 = 0, num3 = 0;
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i<words.length; i++){
            String m = words[i];
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            for(int j = 0; j<m.length(); j++){
                if(set1.contains(m.charAt(j))){
                    count1++;
                }else if(set2.contains(m.charAt(j))){
                    count2++;
                }else if(set3.contains(m.charAt(j))){
                    count3++;
                }
            }
            if(count1 == m.length() || count2 == m.length() || count3 == m.length()){
                result.add(m);
            }
        }
        
        String output[] = new String[result.size()];
        for(int i = 0; i<result.size(); i++){
            output[i] = result.get(i);
        }
        //System.out.println(set1);
        //System.out.println(set2);
        //System.out.println(set3);
        
        return output;
    }
}
