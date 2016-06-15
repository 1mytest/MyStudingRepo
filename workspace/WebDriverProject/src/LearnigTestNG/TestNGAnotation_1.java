package LearnigTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnotation_1 {
	@BeforeClass
	public void beforeClass(){
		System.out.println("works only once before class(initialize Selenium)");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Open browser");
	}
	
	@Test
	public void test1(){
		System.out.println("test1 code");
	}
	@Test
	public void test2(){
		System.out.println("test2 code");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("Close browser");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("works only once after class(destroy Selenium)");
	}
}
