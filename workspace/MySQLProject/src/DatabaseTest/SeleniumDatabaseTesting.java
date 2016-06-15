package DatabaseTest;

import java.sql.*;

public class SeleniumDatabaseTesting {

	public static void main(String[] args) {
		
		//Testdata
		String email = "vivek@rediffmail.com";
		String zipcode = "222222";
		String firstname= "Lucky";
		String lastname = "Singh";
		/* //Input testdata using Selenium
		WebDriver driver = new FirefoxDriver();
		driver.get("http://mailing.dollartree.com/user/signup.jsp");
		driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id='subscribeForm']/div[2]/input[4]")).click();
		 driver.findElement(By.xpath("//*[@id='subscribeForm']/div[3]/input[2]")).click();
		*/
		//Connecting to database
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String databaseName = "mydatabase";
		String username = "root";
		String password = "root";
		try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url+databaseName, username,
		password);
		//String sqlQuerry = "Select * from signupdetails";
		String sqlQuerry = "Select * from signupdetails ORDER BY signupid DESC LIMIT 1";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sqlQuerry);
		result.next();
		System.out.println(result.getString("emailaddress"));
		System.out.println(result.getString("zipcode"));
		System.out.println(result.getString("firstname"));
		System.out.println(result.getString("lastname"));
		//Database Testing
		if(!result.getString("emailaddress").equals(email))
		System.out.println("email ID is stored wrong");
		if(!result.getString("zipcode").equals(zipcode))
		System.out.println("zipcode is stored wrong");
		if(!result.getString("firstname").equals(firstname))
		System.out.println("firstname is stored wrong");
		if(!result.getString("lastname").equals(lastname))
		System.out.println("lastname is stored wrong");
		}
		catch(Exception e){
		System.out.println(e);
		}
		finally{
		if(conn!=null){
		conn=null;
		}
		}

	

	}

}
