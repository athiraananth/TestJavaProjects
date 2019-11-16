package practiseProblems;

public class TopScores {
	
	public int[] findTopScores(int[] unsortedScores, int highestScore) {
		
		if(highestScore<0 || highestScore>100) {
			
			throw new IllegalArgumentException(" Highest Possible Score should be 100 !!");
		}
		if(unsortedScores.length <2) {
			throw new IllegalArgumentException(" UnSorted Scores should have minimum 2 scores to Sort !!");
		}
	    int[] scoreCount=new int[highestScore+1];
	    
	    for(int score : unsortedScores) {
	    	scoreCount[score]++;
	    }
		
		int sortedScores[]=new int[unsortedScores.length];
		int currentSortedIndex=0;
		
		for(int score=highestScore;score>=0;score--) {
			
			int count=scoreCount[score];
			
			for(int occurence=0;occurence<count;occurence++) {
				sortedScores[currentSortedIndex]=score;
				currentSortedIndex++;
			}
			
		}
		return sortedScores;
		
	}

}
