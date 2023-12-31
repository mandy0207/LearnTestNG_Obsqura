import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	
	@Test
	public void LearnSoftAssertions() {
		
		SoftAssert softAssert = new SoftAssert();
		/**
		 * Soft Assert will record all the assertion failures and will fail at the end of program or test case
		 * We have to use softAssert.assertAll() in order to report all assertions
		 */
	
		String expectedfirstName = "Ingrid";
		String expectedlastName= "Rodrigues";
		
		
		softAssert.assertEquals("mandy", expectedfirstName);
		System.out.println("I am first statement");
		
		
		
		softAssert.assertEquals("Taak", expectedlastName);
		System.out.println("I am second statement");

	    softAssert.assertAll();
	

	}
}
