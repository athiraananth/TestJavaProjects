package practiseProblems;

import java.util.HashMap;

public class SpaceEdition {
	//1,2,3,2,4,5
	public boolean findDuplicates(int input[]){
		
		
		for(int i=0;i<input.length;i++) {
			
			int index=input[i];
			index=Math.abs(index);
			if(index>=input.length ) {
				throw new IllegalArgumentException(" Invalid Integer in the Array, Should be greater than 1 and less than" +input.length+"!!");
			}
			if(input[index]>0) {
				input[index]=-1*input[index];
			}
			else if(input[index]<0) {
				return true;
			}
		}
		
		return false;
	}

}
