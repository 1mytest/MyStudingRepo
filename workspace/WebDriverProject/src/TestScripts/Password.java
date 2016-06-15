package TestScripts;

import java.util.Base64;

public class Password {

	public static void main(String[] args) {
		String password = "*************";
		String encodedPassword =new String( Base64.getEncoder().encode(password.getBytes()));
		System.out.println(encodedPassword);
	}

}
