package MyPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParallelTest extends BaseClass{
	@Test
	public void simpletest() throws InterruptedException{
		
		getWebDriver().get("https://google.com");
		getWebDriver().manage().window().maximize();
		Thread.sleep(10000);
		getWebDriver().findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("test");
		getWebDriver().close();
		
	}
}

