package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://ukr.net");
//		driver.manage().window().maximize();
		
		driver.navigate().to("https://ukr.net");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='news_list']/section[1]/h2/a")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}

}
