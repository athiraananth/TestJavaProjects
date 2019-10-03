package binarySearch;

public class binarySearchImplementation {

	public static int binarySearch(int[] A, int l, int r, int x) {
		
		
		if(l>=r) {
			return -1;
		}
		int mid= l+(r-l)/2;
		
		if(A[mid] == x) {
			
			return mid;
		}
		else if (A[mid]> x) {
			
			return binarySearch(A,l,mid-1,x);
		}
		else if(A[mid]< x) {
			return binarySearch(A,mid+1,r,x);
		}
		
		return -1;
	}
}
