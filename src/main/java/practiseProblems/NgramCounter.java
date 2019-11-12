package practiseProblems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class NgramCounter {
	
	private HashMap<String, Integer> threeGramMap = new HashMap<>();
	private HashMap<String, Integer> twoGramMap = new HashMap<>();
	private HashMap<String, Integer> oneGramMap = new HashMap<>();
	
	public HashMap<String, Integer> getThreeGramMap() {
		return threeGramMap;
	}

	public HashMap<String, Integer> getTwoGramMap() {
		return twoGramMap;
	}

	public HashMap<String, Integer> getOneGramMap() {
		return oneGramMap;
	}

	// N Gram Counter Implementation
	public void countNGrams(String sentense, int n) {
		
		String[] words=sentense.split(" ");	
		if(n<1 || n>3) {
			
			System.out.println(" Invalid Entry for number of tokens n, please enter n between 1 and 3 !!");
		}
		else if(words.length <=1) {
			System.out.println(" Invalid sentence for N Grams, Please verify the file");
		}
		else {
			
			int threeGramCount=0;
			int twoGramCount=0;
			int oneGramCount=0;	
				while((n>=1) && (n<=3)) {
								
					if(n ==3 && words.length >=n) {
						for(int i=0;i<=words.length-n;i++) {
							String threeGram= words[i]+" "+ words[i+1]+ " " + words[i+2];
							if(threeGramMap.containsKey(threeGram)) {
								
								threeGramMap.put(threeGram, threeGramMap.getOrDefault(threeGram, threeGramCount)+1);
							}
							else {
								threeGramCount=1;
								threeGramMap.put(threeGram, threeGramCount);
							}
						}
						printNGrams(threeGramMap,n);
					}
					else if(n == 2 &&  words.length >=n) {
						for(int i=0;i<=words.length-n;i++) {
							
							String twoGram= words[i]+" "+ words[i+1];
							if(twoGramMap.containsKey(twoGram)) {
								twoGramCount=+1;
								twoGramMap.put(twoGram, twoGramMap.getOrDefault(twoGram, twoGramCount)+1);
							}
							else {
								twoGramCount=1;
								twoGramMap.put(twoGram, twoGramCount);
							}
						}
						printNGrams(twoGramMap,n);
					}
					else if(n == 1 && words.length >n) {
						for(int i=0;i<words.length;i++) {
							if(oneGramMap.containsKey(words[i])) {
								oneGramCount=+1;
								oneGramMap.put(words[i], oneGramMap.getOrDefault(words[i], oneGramCount)+1);
							}
							else {
								oneGramCount=1;
								oneGramMap.put(words[i], oneGramCount);
							}
						}
						printNGrams(oneGramMap,n);
					}
					n--;
				}	
		}
	}

	//Print the N Gram in sorted Order
	public void printNGrams(HashMap<String, Integer> nGrams, int n) {
		nGrams=sortByCount(nGrams);
		System.out.println("=== "+n+"-grams ===");
		for(Map.Entry<String, Integer> nGram : nGrams.entrySet()){
			System.out.println(nGram.getValue() + " " + nGram.getKey());
		}	
	}
	
	//Sort the NGram counter 
	public HashMap<String, Integer> sortByCount(HashMap<String, Integer> nGrams) {
		
		List<Map.Entry<String, Integer>> list= new LinkedList<Map.Entry<String, Integer>>(nGrams.entrySet());
		//sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1 , Map.Entry<String, Integer> o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		} );
		
		HashMap<String, Integer> temp= new LinkedHashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry1 : list) {
			temp.put(entry1.getKey(), entry1.getValue());
		}
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		try {
			String sentence= new String(Files.readAllBytes(Paths.get("F:\\Athira\\SDL\\nGramInput.txt")));
			NgramCounter ngm= new NgramCounter();
			ngm.countNGrams(sentence, 3);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
