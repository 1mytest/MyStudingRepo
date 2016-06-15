package LearnigTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningTestNGPriority {

/*	@Test(priority=1)
	public void login(){
		System.out.println("Log IN");
	}
	
	@Test(priority=3)
	public void navigate(){
		System.out.println("navigate");
	}
	
	@Test(priority=2)
	public void logout(){
		System.out.println("Log Out");
	}*/
	
	@Test()
	public void login(){
		System.out.println("Log IN");
		Assert.assertEquals("2", "1");
	}
	
	@Test()
	public void navigate(){
		System.out.println("navigate");
	}
	
	@Test(priority=1,dependsOnMethods={"login", "navigate"})
	public void logout(){
		System.out.println("Log Out");
	}
	
}
