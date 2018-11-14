package com.amazonchallenge.symbility;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChallengeQ4 {
	
	private WebDriver driver;
	
	private void openPage() {
		String amazon = "https://amazon.ca";
		System.setProperty("webdriver.chrome.driver", "/Users/averion/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(amazon);
	}
	
	private void invalidSearch() {
		WebElement searching = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement clickgo = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
		String mystring = "[alpja]";
		searching.sendKeys(mystring);
		clickgo.click();
		
		//Asserts that there are no results from search
		WebElement noResults = driver.findElement(By.id("noResultsTitle"));
		String nrouter = noResults.getAttribute("outerHTML");
		assertTrue(nrouter.contains("Your search") && nrouter.contains(mystring) && nrouter.contains("did not match any products"));
	}
	
	@Test
	public void test() {
		openPage();
		invalidSearch();
		driver.close();
	}

}
