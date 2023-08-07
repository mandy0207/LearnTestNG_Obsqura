import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test (groups= {"Sanity"})
	public void FirstMobileTest() {
		System.out.println("I am in First Mobile Test");
	}
	
	@BeforeClass
	public void InvokeBrowser() {
		System.out.println("I am inside before Class Mobile Testing");
	}
	
	
	
	
	@Test(groups= {"Smoke"})
	public void SecondMobileTest() {
		System.out.println("I am in Second Mobile Test");
	}
	
	
//    @BeforeSuite
//	public void ReadDataBase() {
//		System.out.println("I will run before suite or First to execute");
//	}
//    
//    @AfterSuite
//   	public void CloseDataBase() {
//   		System.out.println("I will run after whole suite or last to execute");
//   	}
}
