package com.amazonchallenge.symbility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChallengeQ1 {
	
	private WebDriver driver;
	
	private void openPage() {
		String amazon = "https://amazon.ca";
		System.setProperty("webdriver.chrome.driver", "/Users/averion/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(amazon);
	}
	
	private void viewSignIn() {
		WebElement finder = driver.findElement(By.cssSelector("#nav-link-yourAccount > span.nav-line-1"));
		String signin = finder.getAttribute("outerHTML");
		assertTrue(signin.contains("Sign"));
	}
	
	@Test
	public void test() {
		openPage();
		viewSignIn();
		driver.close();
	}

}
