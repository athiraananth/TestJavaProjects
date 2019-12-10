package practiceTests;

import org.testng.annotations.Test;

import practiseProblems.InPlaceShuffle;

public class InPlaceShuffleTests {
	
	@Test
	public void inPlaceShuffleTest() {
		int[] input= {3,2,5,11,15,20};
		InPlaceShuffle ps=new InPlaceShuffle();
		input=ps.shuffle(input);
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}

}
