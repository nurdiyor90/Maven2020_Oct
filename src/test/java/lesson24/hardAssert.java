package lesson24;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;

public class hardAssert extends Base {

	@Test
	public void hardAssertion() {
		driver.get(prop.getProperty("url"));

		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		List<WebElement> cartSummary = driver.findElements(By.id("cart_title"));
		cartSummary.size();

		Assert.assertTrue(false, "First assert");
		Assert.assertTrue(cartSummary.size() < 0, "Cart summary page opens");
		
		
        
		
		
		
	}

}