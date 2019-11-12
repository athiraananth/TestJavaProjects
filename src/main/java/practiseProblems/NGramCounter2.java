package practiseProblems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class NGramCounter2 {
	
		public static void NGram(String input, int n) {
			
			HashMap<String, Integer> oneGramMap=new HashMap<String, Integer>();
			HashMap<String, Integer> twoGramMap=new HashMap<String, Integer>();
			HashMap<String, Integer> threeGramMap=new HashMap<String,Integer>();
			
			if(n <1 || n>3) {
				System.out.println("Invalid N");
			}
			else {
				
				int oneGramIndex =0,twoGramIndex=0,threeGramIndex=0;
				String oneGram="", twoGram="",threeGram="";
				int oneGramCount=0, twoGramCount=0,threeGramCount=0;
				int spaceCount=0;
				
				for(int i=0;i<input.length();i++) {
					
					//To get the First word
					 if(input.charAt(i)== ' ' && oneGramIndex==0) {
						
						oneGram=input.substring(0,i);
						
						if(oneGramMap.containsKey(oneGram)) {
							
							oneGramMap.put(oneGram, oneGramMap.getOrDefault(oneGram, oneGramCount)+1);
						}
						else {
							oneGramCount=1;
							oneGramMap.put(oneGram, oneGramCount);
						}
						
						spaceCount++;
						oneGramIndex=i+1;
					}
					else if(input.charAt(i)==' ' || i==input.length()-1) {
						oneGram=input.substring(oneGramIndex, i);
						twoGram=input.substring(twoGramIndex,i);
						spaceCount++;
						
						if(oneGramMap.containsKey(oneGram)) {
							oneGramMap.put(oneGram, oneGramMap.getOrDefault(oneGram, oneGramCount)+1);
						}
						else {
							oneGramCount=1;
							oneGramMap.put(oneGram, oneGramCount);
						}
						
						if(twoGramMap.containsKey(twoGram)) {
							twoGramMap.put(twoGram, twoGramMap.getOrDefault(twoGram, twoGramCount)+1);
						}
						else {
							 twoGramCount=1;
							 twoGramMap.put(twoGram, twoGramCount);
						}
						
						if(spaceCount>=3) {
							threeGram=input.substring(threeGramIndex,i);
							threeGramIndex=twoGramIndex;
							
							if(threeGramMap.containsKey(threeGram)) {
								threeGramMap.put(threeGram, threeGramMap.getOrDefault(threeGram, threeGramCount)+1);
							}
							else {
								 threeGramCount=1;
								 threeGramMap.put(threeGram, threeGramCount);
							}
						}
						twoGramIndex=oneGramIndex;
						oneGramIndex=i+1;
					}
				}
				
			}
			while(n>=1 && n<=3) {
				
				if(n==3) {
					printNGrams(threeGramMap, n);
				}
				else if(n==2) {
					printNGrams(twoGramMap, n);
				}
				else if(n ==1) {
					printNGrams(oneGramMap, n);
				}
				
				n--;
			}
			
		}
		
		//Print the N Gram in sorted Order
		public static void printNGrams(HashMap<String, Integer> nGrams, int n) {
			//nGrams=sortByCount(nGrams);
			System.out.println("=== "+n+"-grams ===");
			for(Map.Entry<String, Integer> nGram : nGrams.entrySet()){
				System.out.println(nGram.getValue() + " " + nGram.getKey());
			}	
		}
		
		
		public static void main(String[] args) {
			
			
				String sentence= "To see the full stack trace see the stack and see the stack trace";
				NGramCounter2.NGram(sentence, 3);
				NGramCounter2.NGram(sentence, 4);
				NGramCounter2.NGram(sentence, 2);

		}


}
