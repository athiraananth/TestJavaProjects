package practiseProblems;

import java.util.HashMap;
import java.util.Map;

public class WordCloud {

	public static void wordCloud(String sentence){
		
		String words[]=sentence.split(" ");
		
		if(words.length<=1) {
			System.out.println(" Invalid Input !!");
		}
		int wordCount=0;
		HashMap<String, Integer> wordMap= new HashMap<String, Integer>();
		for(int i=0;i<words.length;i++) {
			
			words[i]=words[i].toLowerCase();
			if(wordMap.containsKey(words[i])) {
				wordMap.put(words[i], wordMap.getOrDefault(words[i], wordCount)+1);
			}
			else {
				 wordCount=1;
				 wordMap.put(words[i], wordCount);	
			}
				
			}
		
			printWordCloud(wordMap);
	}
	
	public static void printWordCloud(HashMap<String, Integer> map) {
		
		for(Map.Entry<String, Integer> word : map.entrySet()) {
			
			System.out.println(word.getKey()+ " : " + word.getValue());
		}
	}
}
