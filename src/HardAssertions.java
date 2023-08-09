import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public void LearnHardAssertions() {
		/**
		 * Hard Assertion : Program or test case will not move ahead or will stop at the point where assertion fails
		 */
	
//		Assert.assertTrue(true);
//		Assert.assertFalse(false);
		
		String expectedfirstName = "Ingrid";
		String expectedlastName= "Rodrigues";
		
		
		Assert.assertEquals("Ingrid", expectedfirstName);
		System.out.println("I am first statement");
		
		Assert.assertEquals("Rodrigues", expectedlastName);
		System.out.println("I am second statement");
		
	
		
	    Assert.assertTrue(true);
        System.out.println("I am  third statement");
		

		
	}
}
