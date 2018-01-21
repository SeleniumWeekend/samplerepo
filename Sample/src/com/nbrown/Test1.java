package com.nbrown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.close();
		driver.quit();
		
	}

}
