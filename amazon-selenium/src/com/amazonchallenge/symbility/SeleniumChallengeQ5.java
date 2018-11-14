package com.amazonchallenge.symbility;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumChallengeQ5 {
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
	
	private void linkGrab() {
	String requiredResult = "#result_4 > div > div.a-fixed-left-grid > div > div.a-fixed-left-grid-col.a-col-right > div.a-row.a-spacing-small > div.a-row.a-spacing-none.scx-truncate-medium.sx-line-clamp-2 > a > h2";
	WebElement getLink = driver.findElement(By.cssSelector(requiredResult));
	getLink.click();
	}
	
	private void addToCart() {
	String addToCartButton= "#add-to-cart-button";
	WebElement addToCart = driver.findElement(By.cssSelector(addToCartButton));
	
	addToCart.click();
	}
	
	private void checkout() {
	String proceedToCheckout = "#hlb-ptc-btn > span";
	WebElement checkOutButton = driver.findElement(By.cssSelector(proceedToCheckout));
	checkOutButton.click();
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
		memoryCardSearch();
		linkGrab();
		addToCart();
		checkout();
		signIn("symbilityhera123@gustr.com", "symbility123");
		driver.close();
	}
}
