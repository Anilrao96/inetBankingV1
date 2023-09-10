package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust =new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details");
		
		addcust.custName("Ram");
		addcust.custGender("male");
		addcust.custdob("03","03","1996");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("TS");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890090");
		
		String email = randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("jhbds");
		addcust.custsubmit();
		Thread.sleep(3000);
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("test case passed...");
		}
		else {
			logger.info("testcase failed");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	


}
