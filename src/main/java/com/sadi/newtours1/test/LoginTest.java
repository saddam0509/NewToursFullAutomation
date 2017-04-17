package com.sadi.newtours1.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sadi.newtours1.utils.DriverManager;
import com.sadi.newtours1.utils.UrlTextUtils;

public class LoginTest {
	private WebDriver driver = null;
	
	@Test (priority =1)
	public void checkTitle () throws IOException {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);
		System.out.println("Checked Home Page Title Successfully");
	}
	
}
