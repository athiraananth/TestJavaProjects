package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.FindMaxWater;

public class MaxAreaTest {
	
	@Test
	public void maxAreaTest_1() {
		
		int height[]=new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int expectedArea=49;
		FindMaxWater fmw=new FindMaxWater();
		Assert.assertEquals(fmw.findMaxArea(height), expectedArea);
	}
	
	@Test
	public void maxAreaTest_2() {
		/*
		int height[]=new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
		int expectedArea=49;
		FindMaxWater fmw=new FindMaxWater();
		Assert.assertEquals(fmw.findMaxArea(height), expectedArea);*/
	}

}
