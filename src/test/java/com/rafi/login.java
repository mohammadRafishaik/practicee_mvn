package com.rafi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
	
	@Test
	public static void login_gmail(){
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		
	}

}
