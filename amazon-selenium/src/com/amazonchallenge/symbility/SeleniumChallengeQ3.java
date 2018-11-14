package com.amazonchallenge.symbility;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChallengeQ3 {
	
	private WebDriver driver;
	
	private void openPage() {
		String amazon = "https://amazon.ca";
		System.setProperty("webdriver.chrome.driver", "/Users/averion/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get(amazon);
	}
	
	private void memoryCardSearch() {
		WebElement searching = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement clickgo = driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input"));
		
		searching.sendKeys("memory card");
		clickgo.click();
	}
	
	@Test
	public void test() {
		openPage();
		memoryCardSearch();
		driver.close();
	}

}
