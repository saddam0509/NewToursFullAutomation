package com.sadi.newtours1.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sadi.newtours1.dataprovider.LoginDataProvider;
import com.sadi.newtours1.dto.Login;
import com.sadi.newtours1.utils.DriverManager;
import com.sadi.newtours1.utils.UrlTextUtils;
import com.sadi.newtours1.utils.XpathUtils;

public class LoginTest {
	private WebDriver driver = null;
	
	@Test (priority =1)
	public void checkTitle () throws IOException {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		System.out.println("Checked Home Page Title Successfully");
	}
	@Test(priority=2,dataProvider="loginData",dataProviderClass=LoginDataProvider.class)
	public void checkLogin(List<Login>logins) throws InterruptedException{
		
		for(Login login: logins){	
			navigate("http://newtours.demoaut.com/");
		driver.findElement(By.xpath(XpathUtils.Login.INPUT_USER_NAME)).sendKeys(login.getUserName());
		driver.findElement(By.xpath(XpathUtils.Login.INPUT_PASSWORD)).sendKeys(login.getPassword());
		driver.findElement(By.xpath(XpathUtils.Login.BTN_SIGNIN)).submit();
		
		System.out.println("Logged in Successfully!!!");
	}
	}

	private void navigate(String url) {
		// TODO Auto-generated method stub
		driver.navigate().to(url);
		driver.navigate().refresh();
	}
}
