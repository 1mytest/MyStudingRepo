package TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFile {



	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.2shared.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='upField']")).sendKeys("C:\\Users\\Admin\\Desktop\\New.txt");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='upField']")));
		
		driver.findElement(By.xpath("//*[@id='upField']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\AutoItScript.exe");	
		
		
		
		
	}

}
