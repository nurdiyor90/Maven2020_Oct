package challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.AmazonSearchItem;
import library.HomePage;
import library.HomePageFactory;
import library.WalmartSearchItem;
import utilities.Base;
@Test
public class WalmartTestCases extends Base {
	
	@Test
	public void searchItemPageObject() throws InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WalmartSearchItem searchProduct = new WalmartSearchItem(driver);

		searchProduct.insertIntoSearchBox("soccer ball");
		searchProduct.clickingOnSearch();
		searchProduct.clickingOnItem();
		searchProduct.addingToCart();

		
		driver.close();

	}

}
