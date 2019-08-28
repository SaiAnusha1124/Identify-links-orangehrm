package automationjar.session;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Orangehrm 
{
	static WebDriver driver;
	@Test
	public void launchDriver() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saianusha.podichervu\\eclipse-workspace\\Automation.jar\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
