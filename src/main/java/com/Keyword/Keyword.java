package com.Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Keyword {
	public RemoteWebDriver driver;

	public void openBrowser() {
		driver = new ChromeDriver();
	}

	public void launchedAppUrl(String path) {
		driver.get(path);

		driver.manage().window().maximize();
	}

	public void selectByIndex(String path, int index) {
		driver.findElement(By.cssSelector(path)).click();
		WebElement testDropDown = driver.findElement(By.cssSelector(path));
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(index);

	}

	public void selectByText(String path, String text) {
		driver.findElement(By.cssSelector(path)).click();
		WebElement testDropDown = driver.findElement(By.cssSelector(path));
		Select dropdown = new Select(testDropDown);

		dropdown.selectByVisibleText(text);

	}

	public void sendkeys(String path, String text) {
		driver.findElement(By.cssSelector(path)).sendKeys(text, Keys.ENTER);
	}

	public void click(String path) {
		driver.findElement(By.cssSelector(path)).click();
		;
	}
	public String getMsg(String path) {
	return	driver.findElement(By.cssSelector(path)).getText();

	}

	
}

