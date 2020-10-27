package lesson24;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.Base;

public class mixedAssert extends Base {

	@Test
	public void mixedAssertion() {
		SoftAssert softAssert = new SoftAssert();

		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		List<WebElement> cartSummary = driver.findElements(By.id("cart_title"));

		// not a main funtion
		softAssert.assertTrue(false, "First assert");

		// not a main funtion
		softAssert.assertTrue(false, "Second assert");

		// Main functionality
		Assert.assertTrue(cartSummary.size() > 0, "Cart summary page opens");

		// not a main funtion
		softAssert.assertTrue(false, "Third assert");
		
		softAssert.assertAll();
		}}
