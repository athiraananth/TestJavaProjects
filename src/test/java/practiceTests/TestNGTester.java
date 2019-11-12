package practiceTests;

import org.testng.annotations.Test;

public class TestNGTester {

	
	@Test
	public static void tester1() {
		System.out.println(" Test case priority 1");
	}
	
	@Test
	public static void tester2() {
		System.out.println(" Test case  priority 4");
	}
	
	@Test
	public static void tester3() {
		System.out.println(" Test case 3");
	}
	
	@Test
	public static void tester4() {
		System.out.println(" Test case priority 2");
	}
	
	@Test
	public static void Atester5() {
		System.out.println(" Test case No priority");
	}
	
}
