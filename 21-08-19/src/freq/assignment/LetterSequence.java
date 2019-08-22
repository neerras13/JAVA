package freq.assignment;

import java.util.Set;
import java.util.TreeMap;

public class LetterSequence {
	private String sentence;
	
	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public TreeMap<Character,Integer> computeFrequency(){
		TreeMap<Character,Integer> tm = new TreeMap<Character, Integer>();
		//int freq[] = new int[sentence.length()];
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) != ' ')
			tm.put(sentence.charAt(i),0);
		}
		Set<Character> set = tm.keySet();
		for(int i=0;i<sentence.length();i++) {
			for(Character c:set)
			{
				if(sentence.charAt(i) == c && sentence.charAt(i) != ' ') {
					int a=tm.get(c);
					tm.put(c,++a);
				}
					
			}
		}
		this.displayLetterFrequency(tm);
		return null;
		
	}
	
	public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap) {
		
		Set<Character> set=frequencyMap.keySet();
	    for(Character s:set) {
	    	System.out.print(s+":");
	    	for(int k=frequencyMap.get(s);k>0;k--) {
	    		System.out.print("*");
	    	}
	    	System.out.println('\n');
	    }
	}

}
