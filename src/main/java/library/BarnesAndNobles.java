package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BarnesAndNobles {

	WebDriver driver;

	By searchBox = By.id("searchBarBN");
	By clickOnSearch = By.xpath("//*[@id=\"searchForm\"]/div[2]");
	By addToCart = By.id("btnAddTextbook");
	By viewAddedItem = By.id("viewShoppingBag");

	public BarnesAndNobles(WebDriver driver) {
		this.driver = driver;
	}

	public void insertIntoSearchBox(String inputText) {
		driver.findElement(searchBox).sendKeys("Automation Tester");
	}

	public void clickingOnSearch() {
		driver.findElement(clickOnSearch).click();
	}

	public void addingToShoppingCart() {
		driver.findElement(addToCart).click();
	}

	public void viewItemInCart() {
		driver.findElement(viewAddedItem).click();
	}

}
