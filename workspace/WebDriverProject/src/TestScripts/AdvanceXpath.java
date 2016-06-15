package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvanceXpath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ukr.net");
//		driver.get("https://google.com");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//*[@id='user-login-form']//a[text()='Забули пароль?']")).click();
//		driver.findElement(By.xpath("//*[@id='gb_70']")).click();
//		driver.findElement(By.xpath("//*[starts-with(@id,'gb_7')]")).click();
//		driver.findElement(By.xpath("//*[contains(@id,'b_7')]")).click();
//		driver.findElement(By.xpath("//*[starts-with(text(),'Забули пароль?')]")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'Забули паро')]")).click();
//		driver.findElement(By.xpath("//*[@id='hot-notlogged']/div[1]/a[5]")).click();
//		driver.findElement(By.xpath("(//*[@id='hot-notlogged']/div[1]/a)[last()-1]")).click();
		driver.findElement(By.xpath("(//*[@id='hot-notlogged']/div[1]/a)[position()='5']")).click();
		
	}

}
