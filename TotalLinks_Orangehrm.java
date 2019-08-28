package automationjar.session;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TotalLinks_Orangehrm extends Login_Orangehrm
{
	@Test
	public static void linksCount() throws Exception 
	{
		driver.get("http://www.orangehrm.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		for (WebElement e : links) 
		{
			System.out.println(e.getAttribute("href"));
		}
	}
}
