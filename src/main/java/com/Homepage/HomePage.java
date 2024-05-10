package com.Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.Keyword.Keyword;

public class HomePage {
	Keyword keyword = new Keyword();

	@FindBy(css = "select[name=\"reg[relationship]\"]")
	public WebElement Profilefor;
	@FindBy(css = "select[class=\"w57 fl\"]")
	public WebElement Day;
	@FindBy(css = "select[class=\"fl ml_10 w68\"]")
	public WebElement Month;
	@FindBy(css = "select[class=\"fl ml_10 w62\"]")
	public WebElement Year;
	@FindBy(css = "select[name=\"reg[height]\"]")
	public WebElement Height;
	@FindBy(css = "select[name=\"reg[mstatus]\"]")
	public WebElement Status;
	@FindBy(css = "select[name=\"reg[mtongue]\"]")
	public WebElement Language;
	@FindBy(css = "#reg_religion_chzn")
	public WebElement Relegion;
	@FindBy(css = "input[tabindex=\"12\"]")
	public WebElement Hindu;
	@FindBy(css = "#reg_city_res_chzn > a > span")
	public WebElement City;
	@FindBy(css = "input[tabindex=\"15\"]")
	public WebElement Cityname;
	@FindBy(css = "input[id=\"reg_phone_mob_mobile\"]")
	public WebElement Phonenumber;
	@FindBy(css = "a[class=\"chzn-single chzn-default\"]")
	public WebElement Cste;
	@FindBy(css = "input[tabindex=\"13\"]")
	public WebElement Castname;
	@FindBy(css = "input[id=\"submit_pg1\"]")
	public WebElement Submit;
	@FindBy(css = "input[name=\"reg[email]\"]")
	public WebElement Email;
	@FindBy(css = "input[type=\"password\"]")
	public WebElement Pass;
	@FindBy(css = "#phon_err > div.err_msg")
	public WebElement Msg;
	@FindBy(css = "#reg_relationship > option:nth-child(3)")
	public WebElement SonClick;

	public void sendMailId(String path) {
		Email.sendKeys(path);
	}

	public void sendPassword(String string) {

		Pass.sendKeys(string);
	}

	public void sendProfileFor(String text) {
		Profilefor.click();
		WebElement testDropDown = Profilefor;
		Select dropdown = new Select(testDropDown);

		dropdown.selectByVisibleText(text);

	}

	public void sendDay(int index) {
		Day.click();
		WebElement testDropDown = Day;
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(index);

	}

	public void sendMonth(int index) {
		Month.click();
		WebElement testDropDown = Month;
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(index);

	}

	public void sendYear(int index) {
		Year.click();
		WebElement testDropDown = Year;
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(index);

	}

	public void sendHeight(int index) {
		Height.click();
		WebElement testDropDown = Height;
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(index);

	}

	public void sendStatus(String string) {
		Status.click();
		WebElement testDropDown = Status;
		Select dropdown = new Select(testDropDown);

		dropdown.selectByVisibleText(string);

	}

	public void sendLanguage(String string) {
		Language.click();
		WebElement testDropDown = Language;
		Select dropdown = new Select(testDropDown);

		dropdown.selectByVisibleText(string);
	}

	public void sendRelegion() {
		Relegion.click();

	}

	public void sendHindu(String string) {
		Hindu.sendKeys(string,Keys.ENTER);

	}

	public void sendCity() {
		City.click();
	}

	public void sendCityname(String string) {
		Cityname.sendKeys(string,Keys.ENTER);
		
	}

	public void sendPhonenNunber(String string) {
		Phonenumber.sendKeys(string);
	}

	public void sendCaste() {
		Cste.click();
	}

	public void sendCasteName(String string) {
		Castname.sendKeys(string,Keys.ENTER);
	}

	public void sendSubmit() {
		
		Submit.click();
	}

	public String sendMsg() {
		return Msg.getText();
	}

}
