package practiceTests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import graphProblems.MeshMessage1;

public class MeshMessageTests {

	@Test
	public static void meshMessageTest_1() {
		HashMap<String, String[]> network=new HashMap<String, String[]>() {{
		    put("Min",     new String[] { "William", "Jayden", "Omar" });
		    put("Jayden",  new String[] { "Min", "Amelia", "Ren"});
		    put("Amelia",  new String[] { "Jayden", "Adam", "Miguel" });
		    put("Adam",    new String[] { "Amelia", "Miguel", "Sofia", "Lucas" });
		}};	
		String[] expectedRoute= {"Jayden", "Amelia", "Adam" };
		Assert.assertEquals(MeshMessage1.bfsGetPath(network, "Jayden", "Adam"),expectedRoute);
	}
	
	@Test
	public static void meshMessageTest_2() {
		HashMap<String, String[]> network=new HashMap<String, String[]>() {{
		    put("Min",     new String[] { "William", "Jayden", "Omar" });
		    put("William", new String[] { "Min", "Noam" });
		    put("Jayden",  new String[] { "Min", "Amelia", "Ren", "Noam" });
		    put("Ren",     new String[] { "Jayden", "Omar" });
		    put("Amelia",  new String[] { "Jayden", "Adam", "Miguel" });
		    put("Adam",    new String[] { "Amelia", "Miguel", "Sofia", "Lucas" });
		    put("Miguel",  new String[] { "Amelia", "Adam", "Liam", "Nathan" });
		    put("Noam",    new String[] { "Nathan", "Jayden", "William" });
		    put("Omar",    new String[] { "Ren", "Min", "Scott" });
		}};
		
		MeshMessage1 mm1=new MeshMessage1();
		
		String[] expectedRoute= {"Jayden", "Amelia", "Adam" };
		Assert.assertEquals(mm1.bfsGetPath(network, "Jayden", "Adam"),expectedRoute);
	}
}
