package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.ProductOfIntegers;

public class ProductIntTests {

	@Test
	public static void productIntTest_1() {
		int input[]=new int[] {1,7,3,4};
		int expResult[]=new int[] {84,12,28,21};
		ProductOfIntegers pi=new ProductOfIntegers();
		Assert.assertEquals(pi.getProductsOfAllIntsExceptAtIndex(input), expResult, " Test Failed");
	}
}
