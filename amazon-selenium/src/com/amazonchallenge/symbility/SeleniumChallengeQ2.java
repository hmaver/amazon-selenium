package com.amazonchallenge.symbility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChallengeQ2 {
	
	private WebDriver driver;
	
	private void openPage() {
		String amazon = "https://amazon.ca";
		System.setProperty("webdriver.chrome.driver", "/Users/averion/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(amazon);
	}
	
	private void clickSignIn() {
		WebElement myel = driver.findElement(By.cssSelector("#nav-link-yourAccount > span.nav-line-1"));
		String signin = myel.getAttribute("outerHTML");
		assertTrue(signin.contains("Sign"));
		//sign in to amazon
		myel.click();
	}
	
	private void signIn(String UserId, String pwd) {
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement signinclick = driver.findElement(By.id("signInSubmit"));
		
		email.sendKeys(UserId);
		pass.sendKeys(pwd);
		signinclick.click();
	}
	
	@Test
	public void test() {
		openPage();
		clickSignIn();
		signIn("symbilityhera123@gustr.com", "symbility123");
		driver.close();
	}

}
