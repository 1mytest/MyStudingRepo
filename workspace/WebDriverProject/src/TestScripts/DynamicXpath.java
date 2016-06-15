package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("sele");
//		Thread.sleep(5000);
//		List<WebElement> list = driver.findElements(By.xpath("//*[starts-with(@id, 'yui_3_18_0_4_1463')]/span/b"));
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'ui_3_18_0_4_146')]/span/b"));
//		System.out.println(list.size());
		list.get(5).click();
		
	}

}
