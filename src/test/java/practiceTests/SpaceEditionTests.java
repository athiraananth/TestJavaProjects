package practiceTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.SpaceEdition;

public class SpaceEditionTests {

	@Test
	public  void findDuplicate_Test1() {
		int input[]= {1,2,3,5,6,3,1};
		SpaceEdition sp=new SpaceEdition();
		Assert.assertTrue(sp.findDuplicates(input));
	}
	
	@Test
	public  void findDuplicate_Test2() {
		int input[]= {1,2,3,5,6,4,1};
		SpaceEdition sp=new SpaceEdition();
		Assert.assertTrue(sp.findDuplicates(input));
	}
	
	@Test
	public  void findDuplicate_Test3() {
		int input[]= {1,2,3,5,6,4,3};
		SpaceEdition sp=new SpaceEdition();
		Assert.assertTrue(sp.findDuplicates(input));
	}
	
	@Test(expectedExceptions= {IllegalArgumentException.class})
	public  void findDuplicate_Test4() {
		int input[]= {1,2,3,5,6,4,7};
		SpaceEdition sp=new SpaceEdition();
		sp.findDuplicates(input);
	}
}
