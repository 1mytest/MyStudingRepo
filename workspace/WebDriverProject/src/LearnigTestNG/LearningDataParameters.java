package LearnigTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataParameters {
	
	@Test(dataProvider="testData")
	public void registeruser(String name,
							String lastname,
							String email,
							String pass){
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] testData(){
		Object[][] obj = new Object[3][4];
		obj[0][0] = "vit1";
		obj[0][1] = "alik1";
		obj[0][2] = "test1@gmail.com";
		obj[0][3] = "12345";
		
		obj[1][0] = "vit2";
		obj[1][1] = "alik2";
		obj[1][2] = "test2@gmail.com";
		obj[1][3] = "12345";
		
		obj[2][0] = "vit3";
		obj[2][1] = "alik3";
		obj[2][2] = "test3@gmail.com";
		obj[2][3] = "12345";
		return obj;
		
	}

}
