package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.HighestProduct;

public class HighestProductTest {

	@Test
	public static void HighestProductTest_1() {
		int inputArray[]=new int[] {20,5,10,50,15,25};
		HighestProduct hp=new HighestProduct();
		Assert.assertEquals(18750,hp.findHighestProduct(inputArray));
		
	}
	
	@Test
	public static void HighestProductTest_2() {
		int inputArray[]=new int[] {20,10};
		HighestProduct hp=new HighestProduct();
		Assert.assertEquals("IllegalArgument",hp.findHighestProduct(inputArray));
	}
	
	@Test
	public static void HighestProductTest_3() {
		int inputArray[]=new int[] {10,15,20};
		HighestProduct hp=new HighestProduct();
		Assert.assertEquals(3000,hp.findHighestProduct(inputArray));
	}
}
