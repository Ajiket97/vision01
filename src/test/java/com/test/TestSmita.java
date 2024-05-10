package com.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSmita {
	@Test
	public void m2() {
		ChromeDriver d = new ChromeDriver();
		d.get("https://byjus.com/ias-questions/what-is-para-in-banking/");

	}

}
