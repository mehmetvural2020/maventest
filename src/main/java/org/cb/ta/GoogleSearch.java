package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	private WebDriver driver;
	
	public GoogleSearch() {
		System.setProperty("webdriver.chromedriver", "webdriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	public WebElement getSearchText() {
		return driver.findElement(By.xpath("//input[@name='q']"));
	}

}
