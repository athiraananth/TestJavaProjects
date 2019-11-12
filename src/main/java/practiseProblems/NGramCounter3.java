package practiseProblems;

import java.util.HashMap;

public class NGramCounter3 {
		
		private HashMap<String, Integer> oneGramMap = new HashMap<>();
		private HashMap<String, Integer> twoGramMap = new HashMap<>();
		private HashMap<String, Integer> threeGramMap = new HashMap<>();
		
		public void NGramCounter(String input, int n){
			
			int spaceCount=0,oneGramIndex=0, oneGramCount=0;
						
			if(n<1 || n>3) {
				System.out.println("NGram Counter accepts N between 1 and 3, Please enter a valid input N!!");
			}
			
			while(n>=1 && n<=3) {
			
				if(input.length() <=1) {
						
						System.out.println( "Invalid Input Sentence");
				}
				//To get the first word
				
				String oneGram="";
				for(int i=0;i<input.length();i++) {
			
					if(input.charAt(i)== ' ' && oneGramIndex ==0 ) {
						oneGram=input.substring(0, i);
						
						if(oneGramMap.containsKey(oneGram)) {
							oneGramMap.put(oneGram, oneGramMap.getOrDefault(oneGram, oneGramCount)+1);
						}
						else {
							oneGramCount=1;
							oneGramMap.put(oneGram,oneGramCount);
						}
					}
					spaceCount++;
					oneGramIndex=i+1;
					String twoGram=" ", threeGram="";
					int twoGramIndex=0, threeGramIndex=0 , twoGramCount=0, threeGramCount=0;
					if(input.charAt(i)== ' ' || i ==input.length()-1 ) {
						
						
						if(n ==3 && spaceCount>=3) {
							threeGram=input.substring(threeGramIndex,i);
							if(threeGramMap.containsKey(threeGram)) {
								threeGramMap.put(threeGram, threeGramMap.getOrDefault(threeGram, threeGramCount)+1);
							}
							else {
								threeGramCount=1;
								threeGramMap.put(twoGram,threeGramCount);
							}
							threeGramIndex=twoGramIndex;
						}
						else if(n==2 && spaceCount ==2) {
							twoGram=input.substring(twoGramIndex, i);
							if(twoGramMap.containsKey(twoGram)) {
								twoGramMap.put(twoGram, twoGramMap.getOrDefault(twoGram, twoGramCount)+1);
							}
							else {
								twoGramCount=1;
								twoGramMap.put(twoGram,twoGramCount);
							}
						}
						else if(n==1) {
							oneGram=input.substring(oneGramIndex,i);
							if(oneGramMap.containsKey(oneGram)) {
								oneGramMap.put(oneGram, oneGramMap.getOrDefault(oneGram, oneGramCount)+1);
							}
							else {
								oneGramCount=1;
								oneGramMap.put(oneGram,oneGramCount);
							}
							
					   }
						spaceCount++;
						twoGramIndex=oneGramIndex;
						oneGramIndex=i+1;
					}
			}
				n--;
		  }
			
		}
}
