package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Homepage.HomePage;
import com.Keyword.Keyword;
import com.Locators.Locators;
import com.proputil.PropUtil;

public class TestCase {
	Keyword keyword = new Keyword();

	@Test
	public void verifyEmailAndPassRequriedOrNot() {
		String msg = "Please provide an email.";
		keyword.openBrowser();
		keyword.launchedAppUrl(Locators.APPSURL);
		// keyword.sendkeys(Locators.EMAIL, "aj5555@gmail.com");
		keyword.sendkeys(Locators.PASS, "Aj@123456");
		keyword.selectByIndex(Locators.PROFILEFOR, 3);
		keyword.selectByIndex(Locators.DAY, 25);
		keyword.selectByIndex(Locators.MONTH, 9);
		keyword.selectByIndex(Locators.YEAR, 2);
		keyword.selectByIndex(Locators.HEIGHT, 5);
		keyword.selectByText(Locators.STATUS, "Never Married");
		keyword.selectByText(Locators.LANGUAGE, "Marathi");
		keyword.click(Locators.RELEGION);
		keyword.sendkeys(Locators.HINDU, "Hindu");
		keyword.click(Locators.CITY);
		keyword.sendkeys(Locators.CITYNAME, "Akola");
		keyword.sendkeys(Locators.PHONENO, "7387231471");
		keyword.click(Locators.CASTE);
		keyword.sendkeys(Locators.CASTENAME, "Bahi");
		keyword.click(Locators.SUBMIT);

		String errormsg = keyword.getMsg(Locators.MSG);
		System.out.println(errormsg);
		Assert.assertEquals(msg, errormsg);

	}

	@Test
	public void verifyMaritalStatusRequriedOrNot() {
		String msg = "Please provide your marital status.";
		keyword.openBrowser();
		keyword.launchedAppUrl(Locators.APPSURL);
		PropUtil prop = new PropUtil();
		String dir = System.getProperty("user.dir");
		String filepath = dir + "\\src\\test\\resources\\Locator.Properties";
		keyword.sendkeys(prop.getLocatorValue(filepath, "EMAIL"), "raaj25@gmail.com");
		keyword.sendkeys(prop.getLocatorValue(filepath, "PASS"), "raaj@1233");
		keyword.selectByIndex(prop.getLocatorValue(filepath, "PROFILEFOR"), 3);
		keyword.selectByIndex(prop.getLocatorValue(filepath, "DAY"), 25);
		keyword.selectByIndex(prop.getLocatorValue(filepath, "MONTH"), 9);
		keyword.selectByIndex(prop.getLocatorValue(filepath, "YEAR"), 2);
		keyword.selectByIndex(prop.getLocatorValue(filepath, "HEIGHT"), 5);
		// keyword.selectByText(prop.getLocatorValue(filepath, "STATUS"), "Never
		// Married");
		keyword.selectByText(prop.getLocatorValue(filepath, "LANGUAGE"), "Marathi");
		keyword.click(prop.getLocatorValue(filepath, "RELEGION"));
		keyword.sendkeys(prop.getLocatorValue(filepath, "HINDU"), "Hindu");
		keyword.click(prop.getLocatorValue(filepath, "CITY"));
		keyword.sendkeys(prop.getLocatorValue(filepath, "CITYNAME"), "Akola");
		keyword.sendkeys(prop.getLocatorValue(filepath, "PHONENO"), "7387231471");
		keyword.click(prop.getLocatorValue(filepath, "CASTE"));
		keyword.sendkeys(prop.getLocatorValue(filepath, "CASTENAME"), "Bahi");
		keyword.click(prop.getLocatorValue(filepath, "SUBMIT"));
		;
		String errormsg = keyword.getMsg(prop.getLocatorValue(filepath, "MSGP"));
		Assert.assertEquals(msg, errormsg);

	}

	@Test
	public void verifyMobilenum() throws InterruptedException {
		String msg = " Provide a valid mobile number.";
		keyword.openBrowser();
		keyword.launchedAppUrl(Locators.APPSURL);
		HomePage home = PageFactory.initElements(keyword.driver, HomePage.class);
		home.sendMailId("raaj25@gmail.com");
		home.sendPassword("raaj@1233");
		home.sendProfileFor("Son");
		home.sendDay(5);
		home.sendMonth(5);
		home.sendYear(5);
		home.sendHeight(5);
		home.sendStatus("Never Married");
		home.sendLanguage("Marathi");
		home.sendRelegion();
		home.sendHindu("Hindu");
		home.sendCaste();
		home.sendCasteName("Bahi");
		home.sendCity();
		home.sendCityname("Akola");
		home.sendPhonenNunber("9999999999");
		home.sendSubmit();
		String errormsg = home.sendMsg();
		//Assert.assertEquals(errormsg, msg);
	}

	public void verifyCast() {

	}

	public void lastName() {
		System.out.println("jj");
	}
}
