package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ukr.net");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fuel']")).click();
		WebElement dropdown = driver.findElement(By.xpath("html/body/div[3]/div/aside/section[1]/div/div[3]/div[1]"));
		List<WebElement> option = dropdown.findElements(By.tagName("a"));
		System.out.println(option.size());
		String element;
		for(int i=0; i<option.size(); i++){
			element = option.get(i).getAttribute("id");
			if(element.equals("5")){
				driver.findElement(By.xpath("html/body/div[3]/div/aside/section[1]/div/div[3]/div[1]")).click();
				option.get(i).click();
			}
			
		}
		
	}

}

