import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadCode {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  
		      
		  //open upload window
		    driver.findElement(By.xpath("//span[normalize-space()='Select PDF file']")).click();

		     //put path to your image in a clipboard
		     StringSelection ss = new StringSelection("C:\\Users\\msingh\\Desktop\\Maninder Singh updated Resume.pdf");
		     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		     //imitate mouse events like ENTER, CTRL+C, CTRL+V
		     Robot robot = new Robot();
		     robot.delay(250);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.keyRelease(KeyEvent.VK_ENTER);
		     robot.keyPress(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_V);
		     robot.keyRelease(KeyEvent.VK_CONTROL);
		     robot.keyPress(KeyEvent.VK_ENTER);
		     robot.delay(90);
		     robot.keyRelease(KeyEvent.VK_ENTER);

		 
		}

	}


