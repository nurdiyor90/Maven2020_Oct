package lesson24;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Base;

public class softAssert extends Base {

	@Test
	public void softAssertion() {
		SoftAssert softAssert = new SoftAssert();
		
		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		List<WebElement> cartSummary = driver.findElements(By.id("cart_title"));
		

		softAssert.assertTrue(false, "First assert");
		softAssert.assertTrue(cartSummary.size() < 0, "Cart summary page opens");
		
		softAssert.assertAll();
		
        
		
		
		
	}

}