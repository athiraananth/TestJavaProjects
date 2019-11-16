package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.TopScores;

public class TopScoreTests {
	
	@Test
	public void topScoreTests_1() {
		int[] unSortedScores=new int[] {37,81,42,69,91,53};
		int[] expectedSortedScores= {91,81,69,53,42,37};
		TopScores ts=new TopScores();
		int[] sortedScores=ts.findTopScores(unSortedScores, 95);
		
		Assert.assertEquals(sortedScores, expectedSortedScores);
	}

	
	@Test
	public void topScoreTests_2() {
		int[] unSortedScores=new int[] {32,86,44,65,94,58};
		int[] expectedSortedScores= {94,86,65,58,44,32};
		TopScores ts=new TopScores();
		int[] sortedScores=ts.findTopScores(unSortedScores, 95);
		
		Assert.assertEquals(sortedScores, expectedSortedScores);
	}


	@Test(expectedExceptions= {IllegalArgumentException.class})
	public void topScoreTests_3() {
		int[] unSortedScores=new int[] {32};
		
		TopScores ts=new TopScores();
		int[] sortedScores=ts.findTopScores(unSortedScores, 95);
		
		
	}
	
	@Test(expectedExceptions= {IllegalArgumentException.class})
	public void topScoreTests_4() {
		int[] unSortedScores=new int[] {32,86,44,65};
		TopScores ts=new TopScores();
		int[] sortedScores=ts.findTopScores(unSortedScores, 104);
		
		
	}

}
