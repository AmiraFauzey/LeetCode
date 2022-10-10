class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
		String[] morseCode = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--.." };
		//hashSet to store unique morse code for each string
		HashSet<String> result = new HashSet<String>();
	    	//for every string in array of words, traverse through each of the character of the string
		for (String word : words) {
			//for every result of morse code, we concate it and store to m_Code
			String m_Code = "";
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				//get the index of each character by subtracting every ascii value of each character by - 'a'(ascii - 97)
				//for example ch = b(ascii value = 98)
				//morseCode[98-97] = morseCode[1]
				//from the morseCode array, morseCode[1] is equal to "-..." , add this to the m_code and continue with the next character of current word
				m_Code += morseCode[ch - 'a'];
			}
			//after we stored every morseCode of each character into string m_Code, we added it into a hashSet, by doing this we can avoid duplicate result
			result.add(m_Code);
		}
	    	//return the size of the HashSet
		return result.size();
	}
}
