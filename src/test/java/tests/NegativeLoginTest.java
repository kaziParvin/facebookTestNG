package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class NegativeLoginTest extends BaseClass{
	
	@BeforeClass
	public void openInvalidApplication() {
		openApp();
		
	}
	
	@Test(priority =1)
	public void invalidEmail() {
		LoginPage lp = new LoginPage();
		lp.userName("miaAkter1");
		lp.password("12345");
		lp.login();
		
		
	}
	
	@Test(priority =0)
	public void invalidPass() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.userName("kaziparvi");
		lp.password("samia0171");
		lp.login();
		Thread.sleep(2000);
		
	}

	
	@AfterClass
	public void finish() {
		driver.quit();
	}

}
