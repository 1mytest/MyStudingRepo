package LearnigTestNG;

import org.testng.annotations.Test;

public class GroupingTests {
	
	@Test(groups={"perfomance"})
	public void feature1(){
		System.out.println("Feature 1");
	}	
	@Test(groups={"regression"})
	public void feature2(){
		System.out.println("Feature 2");
	}		
	@Test(groups={"perfomance","regression"})
	public void feature3(){
		System.out.println("Feature 3");
	}
}
