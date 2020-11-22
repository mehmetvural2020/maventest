package org.cb.ta;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class GoogleSearchTest {
	
	@Test
	public void gotoGoogleAndEnterSearchText() throws InterruptedException {
		GoogleSearch googleSearch = new GoogleSearch();
		WebElement searchTextField = googleSearch.getSearchText();
		searchTextField.sendKeys("codingbook");
		Thread.sleep(2000);
		searchTextField.submit();
		//test
		//search if the file has text -> codingbook
	}

}
