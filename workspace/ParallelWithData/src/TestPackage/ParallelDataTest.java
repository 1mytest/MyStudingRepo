package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelDataTest {

	@DataProvider(parallel=true)
	public Object[][] getData(){
		return new Object[][]{ 
			{"Test1"},
			{"Test2"},
			{"Test3"}
		};
		}
	@Test(dataProvider="getData")
	public void simpletest(String value) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(value);
		driver.close();
		
	}
}
