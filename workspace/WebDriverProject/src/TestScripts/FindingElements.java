package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ukr.net");
		driver.manage().window().maximize();
//		driver.findElement(By.className("a1")).click();
//		driver.findElement(By.id("search-input")).sendKeys("pogoda");
//		driver.findElement(By.linkText("JOB")).click();
//		driver.findElement(By.name("q")).sendKeys("pogoda");
//		driver.findElement(By.partialLinkText("JO")).click();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i).getText());
		}
	}

}
