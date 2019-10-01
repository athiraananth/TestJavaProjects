package sort;

public class InsertionSort {
	
	public static int[] insertionSort(int A[]) {
		for(int i=1; i<=A.length-1;i++) 
		{
				int key=A[i];
				int j=i-1;
				while(j>=0 && A[j]>key) {
					A[j+1]=A[j];
					A[j]=key;
					j--;
				}
			}
		return A;
		}
	

}
