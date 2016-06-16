package MyPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void beforstart(){
		WebDriver driver = new FactoryWebDriver().create("CH");
		setWebDriver(driver);
		
		getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		getWebDriver().manage().window().maximize();
		}
	public void setWebDriver(WebDriver driver){
		dr.set(driver);
	}
	public WebDriver getWebDriver(){
		return dr.get();
	}
	
	
	@AfterMethod
	public void afterfinish(){
		getWebDriver().quit();
		dr.set(null);
		
	}
	
	@Test
	public void firsttest(){
		getWebDriver().get("https:\\ukr.net");
	}
	@Test
	public void secondttest(){
		getWebDriver().get("https:\\ukr.net");
	}
	
}