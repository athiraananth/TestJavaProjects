package sortTests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSortImplementation;
import sort.quickSortImplementation;

public class SortTester {

	@Test
	public static void testMergeSort() {
		int testArray1[]= {1,4,7,12,5,9,15};
		int expectedOutput1[]= {1 , 4 , 5 , 7 , 9 , 12 , 15};
		int testArray2[]= {8,5,3,9,4,1,6};
		int expectedOutput2[]= {1,3,4,5,6,8,9};
		MergeSortImplementation ms= new MergeSortImplementation();
		int[] actualOutput1=ms.mergeSort(testArray1);
		//ms.printSoredList(actualOutput1);
		Assert.assertEquals(actualOutput1,expectedOutput1," Merge Sort Output not Matching");
		int[] actualOutput2=ms.mergeSort(testArray2);
		//Assert.assertTrue(actualOutput2.equals(expectedOutput1)," Merge Sort Output not Matching");
		Assert.assertEquals(actualOutput2,expectedOutput2," Merge Sort Output not Matching");
	}
	
	@Test
	public static void testQuickSort() {
		int testArray1[]= {5,7,2,9,1,4,3,6,8};
		int expectedOutput1[]= {1,2,3,4,5,6,7,8,9};
		int r=testArray1.length-1;
		int testArray2[]= {10,6,8,4,3,5,1};
		int expectedOutput2[]= {1,3,4,5,6,8,10};
		quickSortImplementation qs= new quickSortImplementation();
		int[] actualOutput1=qs.quickSort(testArray1,0,r);
		//ms.printSoredList(actualOutput1);
		Assert.assertEquals(actualOutput1,expectedOutput1," Quick Sort Output not Matching");
		//int[] actualOutput2=qs.quickSort(testArray2,0,testArray2.length);
		//Assert.assertTrue(actualOutput2.equals(expectedOutput1)," Merge Sort Output not Matching");
	//	Assert.assertEquals(actualOutput2,expectedOutput2," Quick Sort Output not Matching");
	}
	
	@Test
	public static void testBubbleSort() {
		int testArray1[]= {15,8,5,2,4,9,3};
		int expectedOutput1[]= {2,3,4,5,8,9,15};
		int testArray2[]= {10,6,8,4,3,5,1};
		int expectedOutput2[]= {1,3,4,5,6,8,10};
		BubbleSort bs= new BubbleSort();
		int[] actualOutput1=bs.bubbleSort(testArray1);
		Assert.assertEquals(actualOutput1,expectedOutput1," Bubble Sort Output not Matching");
		int[] actualOutput2=bs.bubbleSort(testArray2);
		Assert.assertEquals(actualOutput2,expectedOutput2," Bubble Sort Output not Matching");
	}
	
	@Test
	public static void testInsertionSort() {
		int testArray1[]= {15,8,5,2,4,9,3};
		int expectedOutput1[]= {2,3,4,5,8,9,15};
		int testArray2[]= {10,6,8,4,3,5,1};
		int expectedOutput2[]= {1,3,4,5,6,8,10};
		InsertionSort is= new InsertionSort();
		int[] actualOutput1=is.insertionSort(testArray1);
		Assert.assertEquals(actualOutput1,expectedOutput1," Insertion  Sort Output not Matching");
		int[] actualOutput2=is.insertionSort(testArray2);
		Assert.assertEquals(actualOutput2,expectedOutput2," Insertion Sort Output not Matching");
	}
}
