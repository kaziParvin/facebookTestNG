package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public  void userName(String userName) {
		driver.findElement(By.id("email")).sendKeys(userName);
	}
	
	public void password(String password) {
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	
	public void login() {
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[starts-with(@id,'u_0_h_')]")).click();
		//driver.findElement(By.xpath("//*[@name=\'login\']")).click();
		//driver.findElement(By.xpath("//*[@name='login' or @class= '_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		
	}
	
	

}
