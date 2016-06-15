package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://brain.com.ua/category/Telefony_mobylnye-c1274/#tiles");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement checkBox = driver.findElement(By.xpath("//*[@id='v21515430000']"));
	System.out.println(checkBox.isSelected());
	System.out.println(checkBox.isDisplayed());
	checkBox.click();
	driver.findElement(By.tagName("Применить")).click();
	
	
}
}