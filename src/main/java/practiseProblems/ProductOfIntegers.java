package practiseProblems;

public class ProductOfIntegers {

	// array {1, 7, 3, 4}
	public static int[] getProductsOfAllIntsExceptAtIndex( int input[]) {
		int result[] =new int[input.length];
		if(input.length<2) {
			throw new IllegalArgumentException(" Minimum two integers required to find products !!");
		}
		int productofInts=1;
		for(int i=0;i<input.length;i++) {
			result[i]=productofInts;
			//1,1,7,21,84
			productofInts=productofInts*input[i];
		}
		productofInts=1;
		for(int i=input.length-1;i>=0;i--) {
			result[i]*=productofInts;
			productofInts=productofInts*input[i];
		}
		return result;
		
	}
}
