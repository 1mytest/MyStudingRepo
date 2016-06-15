package TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://profile.police.gov.ua/form/form.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> list = driver.findElements(By.xpath("//input[@name='drive_exist']"));
//		System.out.println(list.size());
		for (WebElement el: list){
//			System.out.println(el.getAttribute("value"));
//			System.out.println(el.isSelected());
			if(el.getAttribute("value").equals("1")){
				el.click();}
		}
		for (WebElement el: list){
			System.out.println(el.getAttribute("value"));
			System.out.println(el.isSelected());
			}
		
	}

}
