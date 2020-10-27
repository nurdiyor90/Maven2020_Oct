package challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.AmazonSearchItem;
import library.HomePage;
import library.HomePageFactory;
import utilities.Base;

@Test
public class AmazonTestCases extends Base {

	@Test
	public void addTeaPotIntoCart() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		AmazonSearchItem itemSearch = new AmazonSearchItem(driver);

		itemSearch.insertIntoSearchBox("tea pot");
		itemSearch.clickSearch();
		itemSearch.clickOnItem();
		itemSearch.addingIntoCart();

		
	}

}
