import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {

	/**
	 * 1) The order of execution of tests depends on the alphabetical order(Name of test case)
	 * 2) Defining priority, we can change the execution order of tests. Pririty =0 will execute first and so on
	 *    order would be 0, 1, 2......
	 * 3) If any of the test is not having priority set, order of execution alphabetical order will take precedence
	 * 4) BeforeTest will execute at first in a particular class
	 * 5) AfterTest will execute at last in a particular class
	 * 6) BeforeTest and AfterTest will not be considered as testcases
	 * 7) BeforeMethod will execute before every testcase present in class
	 * 8) AfterMethod will execute after every testcase present in a class
	 * 9) If we have to execute particular testcases that belongs to smoke, sanity etc or any group we use the concept of grouping
	 */

	@Test(groups= {"Smoke"})
	public void FirstWebTest() {
		System.out.println("I am in First Web Test");
	}
	
	
	
	@Test(priority=1)
	public void SecondWebTest() {
		System.out.println("I am in Second Second Web Test");
	}
	
	@Test(priority=2)
	public void ThirdWebTest() {
		System.out.println("I am in Third Web Test");
	}
	
//	@BeforeTest
//	public void BeforeWebTest() {
//		System.out.println("I am in Before Test");
//	}
//	
//	
	@AfterTest
	public void AfterWebTest() {
		System.out.println("I am in After Test");
	}
	
	@BeforeClass
	public void InvokeBrowser() {
		System.out.println("I am inside before Class webtesting");
	}
	
	@AfterClass
	public void  CloseBrowser() {
		System.out.println("I am inside After ClASS webtesting");
	}

//	@BeforeMethod
//	public void MyFirstName() {
//		System.out.println("My First name is Mandy");
//	}
//	
//	
//	@AfterMethod
//	public void MyLastNAME() {
//		System.out.println("My last name is Sandhu");
//	}
	
	
}
