package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NavigateToSite {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.close();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\WebDriverProject\\lib\\chromedriver.exe");
//		WebDriver chromeDriver = new ChromeDriver();
//		chromeDriver.get("http://ya.ru");
//		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//lib//IEDriverServer.exe");
//		WebDriver ieDriver = new InternetExplorerDriver();
//		ieDriver.get("https://ya.ru");
	}

}
