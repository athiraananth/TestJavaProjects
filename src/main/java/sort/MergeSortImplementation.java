package sort;

public class MergeSortImplementation {

	public static int[] mergeSort(int[] A) {
		int midPoint=A.length/2;
		int[] left=new int[midPoint];
		int[] right;
		if(A.length ==1) {
			return A;
		}
		else if(A.length%2==0) {
			right= new int[midPoint];
			
		}
		else {
			right=new int[midPoint+1];
		}
		
		for(int i=0;i<midPoint;i++) {
			left[i]=A[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=A[midPoint+j];
		}
		left=mergeSort(left);
		right=mergeSort(right);
		int result[] = merge(left,right);
		return result;
	}
	
	public static int[] merge(int[] left, int[] right) {
		int result[] =  new int[left.length+right.length];
		int leftPointer=0,rightPointer=0,resultPointer=0;
		if(left.length ==0) {
			return right;
		}
		else if(right.length == 0) {
			return left;
		}
		else {
			
			while(leftPointer<left.length||rightPointer<right.length) {
				if(leftPointer<left.length && rightPointer<right.length) {
					if(left[leftPointer]<right[rightPointer]) {
						result[resultPointer]=left[leftPointer];
						leftPointer++;
					}
					else {
						result[resultPointer]=right[rightPointer];
						rightPointer++;
					}
				}
				else if(leftPointer<left.length){
					result[resultPointer]=left[leftPointer];
					leftPointer++;
				}
				else if(rightPointer<right.length) {
					result[resultPointer]=right[rightPointer];
					rightPointer++;
				}
				resultPointer++;
			}
		}
		return result;
	}
	
 public static void printSoredList(int[] array) {
		
		if(array.length != 0) {
			System.out.println("\n");
			for(int element : array) {
				System.out.print(element + " , ");
			}
		}
	}
	

}
