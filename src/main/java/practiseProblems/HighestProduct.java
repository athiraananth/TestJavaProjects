package practiseProblems;

import org.testng.Assert;

public class HighestProduct {
	
	//Array={5,10,2,4,6};
	public  int findHighestProduct( int arrayOfInts[]) {
			
		if(arrayOfInts.length<3) {
			throw new IllegalArgumentException(" Minimum three integers required to find the product!! ");
		}
		
		int currentIntProd=0;
		int highestProd=arrayOfInts[0]*arrayOfInts[1]*arrayOfInts[2];
		
		if(arrayOfInts.length ==3) {
			return highestProd;
		}
		else {
			for(int i=1;i<arrayOfInts.length-2;i++){
				currentIntProd=arrayOfInts[i]*arrayOfInts[i+1]*arrayOfInts[i+2];
				highestProd=Math.max(highestProd, currentIntProd);
			}
		}
		return highestProd;
		
	}
	
	/*
		public static void main(String[] args) {
			int inputArray[]=new int[] {20,10};
			HighestProduct hp=new HighestProduct();
			System.out.println(hp.findHighestProduct(inputArray));
	
	
		}
*/
}
