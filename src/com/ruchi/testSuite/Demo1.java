package com.ruchi.testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void launch()
	{
		WebDriver ffdriver=new FirefoxDriver();
		ffdriver.get("http://www.google.com");
	}
	
}
