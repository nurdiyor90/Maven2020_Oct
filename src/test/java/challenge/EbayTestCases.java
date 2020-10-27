package challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.AmazonSearchItem;
import library.EbayHomePage;
import library.HomePage;
import library.HomePageFactory;
import utilities.Base;

@Test
public class EbayTestCases extends Base {

	@Test
	public void searchItemPageObject() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		EbayHomePage itemSearch = new EbayHomePage(driver);

		itemSearch.insertInSearchBox("teapot");

		itemSearch.clickingOnSearch();

		itemSearch.clickingOnItem();

		itemSearch.choosingLength();

		itemSearch.choosingColor();

		itemSearch.addingToCart();

		itemSearch.respondToPopUp();

		Thread.sleep(3000);
		driver.close();

	}

}
