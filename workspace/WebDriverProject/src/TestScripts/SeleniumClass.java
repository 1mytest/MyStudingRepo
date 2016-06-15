package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://ukr.net");
//		driver.manage().window().maximize();
		
		driver.navigate().to("https://ukr.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='user-login-form']/div[6]/a")).click();
		
//		driver.close(); //closes currently focused browser
		
		driver.quit(); // close all and destroy the object "driver" 

	}

}
