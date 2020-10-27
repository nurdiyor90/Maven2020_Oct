package challenge;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import library.HilolNashrBookPurchase;
import utilities.Base;

public class HilolNashrTestCases extends Base {
	
	@Test
	public void BookPurchasing() throws InterruptedException {
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		HilolNashrBookPurchase buyingBook = new HilolNashrBookPurchase(driver);
		
		buyingBook.changingLanguage();
		buyingBook.selectingLanguage();
		buyingBook.searchBox();
		buyingBook.insertingText();
		buyingBook.selectingBook();
		buyingBook.addingQuantity();
		buyingBook.addingToCart();
		buyingBook.clickingOnShoppingCart();
		buyingBook.checkingOut();
	}

}
