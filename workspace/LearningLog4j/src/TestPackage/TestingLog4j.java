package TestPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestingLog4j {
	
	Logger logger;
	
	@Test
	public void testLogs(){
		logger = Logger.getLogger("devpinoyLogger");
		logger.debug("Starting Selenium tests");
		WebDriver driver =  new FirefoxDriver();
		logger.debug("FF opens");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https:\\ukr.net");
		logger.debug("Navigate to ukr.net");
	}

}
