package LearnigTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTests {

	@Test
	public void feature1(){
		System.out.println("Feature 1");
	}	
	@Test
	public void feature2(){
		System.out.println("Feature 2");
	}		
	@Test
	public void feature3(){
		Assert.assertEquals("2", "1");;
	}
}
