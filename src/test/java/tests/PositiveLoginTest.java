package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class PositiveLoginTest extends BaseClass {
	
	@BeforeClass
	public void openValidApplication() {
		openApp();
	}
	
	@Test
	public void invalidEmail() {
		LoginPage lp = new LoginPage();
		lp.userName("kaziparvin97@yahoo.com");
		lp.password("parvin49");
		lp.login();
		
	}
	
	@AfterClass
	public void finish() {
		driver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
