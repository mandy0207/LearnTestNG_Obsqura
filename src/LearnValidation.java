import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnValidation {

	@Test
	public void UnderstandValidation() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://selenium.obsqurazone.com/ajax-form-submit.php");

		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("Car wash");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Please eash my car");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String expected = "Looks good!";
		String subjectText = driver.findElement(By.xpath("//div[@class='form-group']//div[2]")).getText();
		System.out.println(subjectText);
		Assert.assertEquals(subjectText, expected);

		By locator = By.xpath("//div[@id='message-one']");
		String expectedSubmissionMsg="Form has been submitted successfully!";
		
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5) );
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedSubmissionMsg));
		String submissionText = driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		System.out.println(submissionText);
		
		Assert.assertEquals(submissionText, expectedSubmissionMsg);

	}
}
