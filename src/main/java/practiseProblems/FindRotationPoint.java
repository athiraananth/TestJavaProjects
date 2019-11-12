package practiseProblems;

public class FindRotationPoint {
	
	public static int findRotationIndex(String [] words, int lIndex, int rIndex) {
		
		String firstWord=words[lIndex];
		int midPoint=lIndex+rIndex-lIndex/2;
		if(lIndex<rIndex) {
			
			if(words[midPoint].compareTo(firstWord)== 0){
				return midPoint;
			}
			else if (words[midPoint].compareTo(firstWord)>=1) {
				findRotationIndex(words,midPoint+1,rIndex);
				
			}
			else if(words[midPoint].compareTo(firstWord)<0) {
				findRotationIndex(words,midPoint+1,rIndex);
			}
		}
		
		
		return -1;
		
		
	}

}
