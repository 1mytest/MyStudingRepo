package LearnigTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnotation_2 {
	@BeforeSuite
	public void beforeSuit(){
		System.out.println("Start testng");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("Start test execution");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("initialize Selenium for class 2");
	}
	@Test
	public void test3(){
		System.out.println("test3 code");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("destroy Selenium for class 2");
	}
	@AfterSuite
	public void afterSuit(){
		System.out.println("Close testng");
	}
}
