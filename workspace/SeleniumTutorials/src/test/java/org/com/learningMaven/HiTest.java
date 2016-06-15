package org.com.learningMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiTest {


	@Test
	public void someShit(){
		System.out.println("Hi my first cmd maven test");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://brain.com.ua");
	}
}
