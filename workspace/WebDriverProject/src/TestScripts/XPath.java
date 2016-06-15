package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ukr.net");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//*[@id='user-login-form']/div[6]/a")).click();
	//	driver.findElement(By.xpath("//*[@id='hot-notlogged']/div[1]/a[2]/preceding-sibling::a")).click();//up 1 level
	//	driver.findElement(By.xpath("//*[@id='hot-notlogged']/div[1]/a[2]/following-sibling::a[2]")).click();//down 2 levels
		driver.findElement(By.xpath("//*[@id='hot-notlogged']/div[1]/a[text()='Sinoptik']/parent::div/parent::div/div[2]/a[2]")).click();// go to parent if we don't have unic ID
	}

}
