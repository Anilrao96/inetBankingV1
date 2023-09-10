package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		
		
		
		logger.info("URL is opened");
		LoginPage ip = new LoginPage(driver);
		
		ip.setUserName(username);
		logger.info("entered username");
		ip.setPassword(password);
		logger.info("entered password");
		
		
		ip.clickSubmit();
		logger.info("Logged in successfully");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login tests failed");
			
		}
		
	}

}
