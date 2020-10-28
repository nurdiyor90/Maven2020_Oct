package test_cases;

import org.testng.annotations.Test;

public class ClassATest {
	
	@Test
	public void testCaseA () {
		System.out.println("testCaseA");
	}
	
	@Test
	public void testCaseC () {
		System.out.println("testCaseC");
		System.out.println("Another line");
	}
	@Test
	public void testCase () {
		System.out.println("Just for fun");
	}
	
}
