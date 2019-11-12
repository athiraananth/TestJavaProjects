package practiceTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.AppleStock;
import practiseProblems.FindRotationPoint;
import practiseProblems.InflightEntertainment;
import practiseProblems.NgramCounter;
import practiseProblems.PalindromePermutation;
import practiseProblems.WordCloud;

public class TestRunner {


	/*public static void RotationPointTest() {
		FindRotationPoint rp =new FindRotationPoint();
		String[] words = new String[]{
			    "ptolemaic",
			    "retrograde",
			    "supplant",
			    "undulate",
			    "xenoepist",
			    "asymptote",  // <-- rotates here!
			    "babka",
			    "banoffee",
			    "engender",
			    "karpatka",
			    "othellolagkage",
			};
		System.out.println("Rotation Index :" + words.length);
		int rIndex=words.length-1;
		int rotationIndex=rp.findRotationIndex(words, 0, rIndex);
		System.out.println("Rotation Index :" + rotationIndex);
		Assert.assertEquals(rotationIndex, 5);
	}
	
	
	public static void nGramTest() {
		
		try {
			String sentence=new String(Files.readAllBytes(Paths.get("F:\\Athira\\SDL\\nGramInput.txt")));
			NgramCounter ngm= new NgramCounter();
			//n =3
			ngm.countNGrams(sentence, 3);
			//n=-1
			ngm.countNGrams(sentence, -1);
			//n=2
			ngm.countNGrams(sentence, 2);
			//n=4
			ngm.countNGrams(sentence, 4);
			//n=0
			ngm.countNGrams(sentence, 0);
			// File that doesnt exists
			sentence=new String(Files.readAllBytes(Paths.get("F:\\Athira\\SDL\\input.txt")));
			// File  with mutliple lines
			sentence=new String(Files.readAllBytes(Paths.get("F:\\Athira\\SDL\\nGramInput1.txt")));
			//n =2
			ngm.countNGrams(sentence, 2);
			//n=-1
			ngm.countNGrams(sentence, -1);
		} 
		catch (FileNotFoundException e1) {
			System.out.println(" File specified not exists !!");
			e1.printStackTrace();
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test
	public static void wordCloudTest() {
		
		String sentense="After beating eggs, Dana started beating butter after that dana added sugar and beated sugar and butter ";
		WordCloud wc= new WordCloud();
		wc.wordCloud(sentense);
		sentense="After beating eggs";
		wc.wordCloud(sentense);
		sentense="Eggs EGGS eggs";
		wc.wordCloud(sentense);
		sentense="";
		wc.wordCloud(sentense);
	}
	
	
	@Test
	public static void inflightTest() {
		
		InflightEntertainment ie= new InflightEntertainment();
		int fLen=180;
		int mLen[]= {60,90,120,180,240,70};
		boolean movieStatus=ie.flightEntertaintment(fLen, mLen);
		Assert.assertTrue(movieStatus);
		int mLen1[]= {60,45,60,80,50,70};
		movieStatus=ie.flightEntertaintment(fLen, mLen1);
		Assert.assertFalse(movieStatus);
		fLen=60;
		movieStatus=ie.flightEntertaintment(fLen, mLen);
		Assert.assertFalse(movieStatus);
	}
	
	@Test
	public static void NGramCounter_PositiveTest() {
		NgramCounter ngm= new NgramCounter();
		ngm.countNGrams("do you know that I know you know that I know that ?", 3);
		Integer expectedCount = new Integer(2); 
		Assert.assertEquals(expectedCount,ngm.getThreeGramMap().get("you know that"));
		
		Assert.assertEquals(expectedCount,ngm.getTwoGramMap().get("you know"));
		expectedCount=new Integer(4);
		Assert.assertEquals(expectedCount,ngm.getOneGramMap().get("know"));
		
	}
	
	@Test
	public static void NGramCounter_NegativeTest() {
		NgramCounter ngm= new NgramCounter();
		ngm.countNGrams("betty beats butter better butter better", 2);
		Integer expectedCount = new Integer(2); 
		Assert.assertTrue(ngm.getThreeGramMap().isEmpty());
		Assert.assertFalse(ngm.getTwoGramMap().containsKey("butter bitter"));
		Assert.assertFalse(ngm.getOneGramMap().containsKey("bitter"));
		
		
	}*/
	
	@Test
	public static void permutationPalindromePositive_Test1() {
		PalindromePermutation pp=new PalindromePermutation();
		String input="civic";
		Assert.assertTrue(pp.IsPalindrome(input));
		
	}

	@Test
	public static void permutationPalindromePositive_Test2() {
		PalindromePermutation pp=new PalindromePermutation();
		String input="unuunul";
		Assert.assertTrue(pp.IsPalindrome(input));
		
	}
	
	@Test
	public static void permutationPalindromeNegative_Test1() {
		PalindromePermutation pp=new PalindromePermutation();
		String input="india";
		Assert.assertFalse(pp.IsPalindrome(input));
		
	}
	
	@Test
	public static void appleStockPriceTest_1() {
		int stockPrice[]= new int[]{10,7,5,8,9,11};
		AppleStock as=new AppleStock();
		Assert.assertEquals(6, as.getMaxProfit(stockPrice));
		
	}
	
	@Test
	public static void appleStockPriceTest_2() {
		int stockPrice[]= new int[]{20,50,15,10,5,40};
		AppleStock as=new AppleStock();
		Assert.assertEquals(35, as.getMaxProfit(stockPrice));
		
	}
		
}
