package practiseProblems;

import java.util.Random;

public class InPlaceShuffle {
	
	public static int generateRandomInt(int min, int max) {
		
		Random random=new Random();
		return random.nextInt((max-min)+1)+min;
		
	}

	public int[] shuffle(int[] arrayInput) {
		
		if(arrayInput.length<=1) {
			throw new IllegalArgumentException("Invalid Input!!");
		}
		
		for(int index=0;index<arrayInput.length-1;index++) {
			
			int secondIndex=generateRandomInt(index, arrayInput.length-1);
			
			if(secondIndex!=index) {
				int temp=arrayInput[index];
				arrayInput[index]=arrayInput[secondIndex];
				arrayInput[secondIndex]=temp;
			}
		}
		return arrayInput;
	}
}
