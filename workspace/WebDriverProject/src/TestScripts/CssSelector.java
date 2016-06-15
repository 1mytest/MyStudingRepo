package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ukr.net");
//		driver.get("https://google.com");
		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("input[type='text'][name='Login']")).sendKeys("my login");
//		driver.findElement(By.cssSelector("form[id='user-login-form'] div[class='login'] input[type='text'][name='Login']")).sendKeys("my login");
//		driver.findElement(By.cssSelector("form#user-login-form div.login input[name='Login']")).sendKeys("my login");
//		driver.findElement(By.cssSelector("input[name^='Logi']")).sendKeys("my login");
		driver.findElement(By.cssSelector("input[name$='ogin']")).sendKeys("my login");
	
	
	}

}
