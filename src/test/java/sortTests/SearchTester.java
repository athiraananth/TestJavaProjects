package sortTests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import binarySearch.BinarySearchTreeImplementation;
import binarySearch.binarySearchImplementation;

public class SearchTester {
	
	@Test
	public static void binarySearchTester() {
		binarySearchImplementation bs=new binarySearchImplementation();
		int array[]= {2,5,8,12,16,22,26,31};
		int result=bs.binarySearch(array, 0, array.length-1, 22);
		int expectedResult=5;
		Assert.assertEquals(result, expectedResult,"Index of the element is not matching!");
		int array1[]= {5,9,11,15,18,23,27,35,38};
		int result1=bs.binarySearch(array1, 0, array1.length-1, 22);
		Assert.assertEquals(result1, -1);
	}
	
	@Test
	public static void btSearchTester() {
		BinarySearchTreeImplementation bst=new BinarySearchTreeImplementation();
		bst.insert(40);
		bst.insert(20);
		bst.insert(10);
		bst.insert(15);
		bst.insert(55);
		bst.insert(45);
		bst.insert(60);
		bst.traverseBT();
		boolean isFound=bst.search(15);
		Assert.assertEquals(isFound, true);
		isFound=bst.search(35);
		Assert.assertEquals(isFound, false);
	}

}
