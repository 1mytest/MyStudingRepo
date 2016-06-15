package com.org.MavenJenkinsProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {

	@Test
	
	public void loginTest() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ukr.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='user-login-form']/div[7]/a")).click();
		Thread.sleep(5000);
		driver.quit();
	}
		
}