package practiceTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import practiseProblems.FindRotationPoint;
import practiseProblems.NgramCounter;
import practiseProblems.WordCloud;

public class TestRunner {


	public static void RotationPointTest() {
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
	
	@Test
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
}
