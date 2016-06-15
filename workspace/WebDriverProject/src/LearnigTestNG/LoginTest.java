package LearnigTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;



public class LoginTest {
	
	@Test
	public void loginToEmail(){
		System.out.println("loginToEmail");
		try{
		Assert.assertEquals("2", "1");
		}
		catch(Throwable t){
			System.out.println(t);
		}
		System.out.println("After Assert Condition");
	}
	@Test
	public void loginToFB(){
		System.out.println("loginToFB");
//		throw new SkipException("FB is not implemented");
	}
	@Test
	public void loginToTwitter(){
		System.out.println("loginToTwitter");
//		throw new SkipException("Twitter is not supported");
	}
}
