package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FactoryWebDriver {

	WebDriver create(String type){
		WebDriver driver;
		
		switch(type){
		
		case "FF":
			driver = new FirefoxDriver();
			break;
		case "CH":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\ParallelExecutionTestNG\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//lib//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		default:
			driver = new FirefoxDriver();
			break;
			
		}
		return driver;
	}
	
	
}
