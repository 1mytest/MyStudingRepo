package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ukr.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='user-login-form']/div[2]/input")).sendKeys("***********");
		driver.findElement(By.xpath("//*[@id='user-login-form']/div[3]/input")).sendKeys("*********");
		driver.findElement(By.xpath("//*[@id='user-login-form']/div[5]/button")).click();
		

	}

}
