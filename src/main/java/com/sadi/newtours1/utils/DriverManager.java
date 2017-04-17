package com.sadi.newtours1.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
	static {
		System.setProperty("webdriver.gecko.driver", "D://Testing/geckodriver-v0.15.0-win64/geckodriver.exe");
	}
	public static WebDriver driver = new FirefoxDriver();
	private DriverManager(){
		
	}
	
}
