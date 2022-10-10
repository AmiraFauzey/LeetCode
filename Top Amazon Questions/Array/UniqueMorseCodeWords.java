class Solution {
    public static int uniqueMorseRepresentations(String[] words) {
		String[] morseCode = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--.." };

		HashSet<String> result = new HashSet<String>();
		for (String word : words) {
			String m_Code = "";
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				m_Code += morseCode[ch - 'a'];
			}
			result.add(m_Code);
		}
		return result.size();
	}
}
