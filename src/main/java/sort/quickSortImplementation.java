package sort;

public class quickSortImplementation {

	public static int[] quickSort(int A[],int p,int r) {
		if(p<r) {
			int q=partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
		return A;
	}
	
	public static int partition(int A[], int p, int q) {
		int pivot=A[q];
		int pIndex=p-1;
		for(int i=p;i<q;i++) {
		 if(A[i]<pivot) {
			 pIndex++;
			 int temp=A[pIndex];
			 A[pIndex]=A[i];
			 A[i]=temp;
			 
		 }
		}
		int temp= A[pIndex+1];
		A[pIndex+1]=pivot;
		A[q]=temp;
		
		return pIndex+1;
	}
}
