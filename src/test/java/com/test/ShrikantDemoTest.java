package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ShrikantDemoTest {
	@Test
	public void test1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		String title = driver.getTitle();
		boolean result = title.contains("Myntra");
		if (result) {
			System.out.println("Test Case is Passed");
		} else {
			System.out.println("Test Case is Failed");
		}
		driver.close();

	}

}
