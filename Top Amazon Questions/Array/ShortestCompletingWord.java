class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
    //store each character of letter as a key and count of each character as value
		HashMap<Character,Integer> licensePlateCount = new HashMap<Character,Integer>();
		String lp = licensePlate.toLowerCase();
		for(char ch : lp.toCharArray()) {
			if(Character.isLetter(ch)) {
				licensePlateCount.put(ch, licensePlateCount.getOrDefault(ch, 0)+1);
			}
		}
		
		String result = "";
		for(String word : words) {
      //store each character of letter for every word in words array as key and count of each character as value
			HashMap<Character,Integer> wordCount = new HashMap<Character,Integer>();
			boolean check = true;
			for(char ch : word.toCharArray()) {
				wordCount.put(ch, wordCount.getOrDefault(ch, 0)+1);
			}
      //compare if value of each character in wordCount is less than value of character in licensePlateCount  
			for(Map.Entry<Character, Integer> entry: licensePlateCount.entrySet()) {
				char letter = entry.getKey();
				if(wordCount.containsKey(letter)) {
					if(wordCount.get(letter) < entry.getValue()) {
						check = false;
						break;
					}
				}else {
					check = false;
					break;
				}
			}
      //if true check if size of current word is smallaer than previous completing word
			if(check) {
				if(result.equals("") || word.length()<result.length()) {
					result = word;
				}
			}
		}
		return result;
	}
}
