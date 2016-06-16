package SauceLabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearningLauceLabs {
	
	/*public static final String USERNAME = "YOUR_USERNAME";
	public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";*/
	
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, MalformedURLException{
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	capabilities.setCapability("platform", Platform.WIN8_1);
	capabilities.setCapability("version", "44.0");
	driver = new RemoteWebDriver(new URL("http://appautomator:581f76cf-114f-40a7-88dc-xxxxx-xxxxx@ondemand.saucelabs.com:80/wd/hub"), capabilities);
	Thread.sleep(10000);
	driver.get("http://www.rediff.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
	Thread.sleep(5000);
	driver.quit();
	}
}
