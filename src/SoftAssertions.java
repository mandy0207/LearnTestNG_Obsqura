import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

	
	@Test
	public void LearnSoftAssertions() {
		
		SoftAssert softAssert = new SoftAssert();
		
	
		String expectedfirstName = "Ingrid";
		String expectedlastName= "Rodrigues";
		
		
		softAssert.assertEquals("mandy", expectedfirstName);
		System.out.println("I am first statement");
		
		
		
		softAssert.assertEquals("Taak", expectedlastName);
		System.out.println("I am second statement");

	    softAssert.assertAll();
		

		
		


	}
}
