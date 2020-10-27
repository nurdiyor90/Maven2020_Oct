package challenge;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import library.BarnesAndNobles;
import utilities.Base;

public class BarnesNobleTestCases extends Base {

	@Test
	public void searchBookUsingPageObject() {
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		
		BarnesAndNobles searchingForBook= new BarnesAndNobles(driver);
		
		
		searchingForBook.insertIntoSearchBox("Automation Tester");
		searchingForBook.clickingOnSearch();
		searchingForBook.addingToShoppingCart();
		searchingForBook.viewItemInCart();
	}

}
