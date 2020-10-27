package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage {

	private WebDriver driver;

	// List of Element addresses

	By searchBtn = By.cssSelector("#gh-ac");

	By clickSearchBtn = By.id("gh-btn");

	By chooseProduct = By.xpath("//*[@id=\"srp-river-results\"]/ul/li[7]/div/div[1]/div/a/div/img");

	By selectLength = By.id("msku-sel-1");

	By selectColor = By.id("msku-sel-2");

	By addToCart = By.id("isCartBtn_btn");

	By cancelWarrantyBtn = By.cssSelector("#ADDON_0 > div > div.adndesc.addon-overlay-body > div > div.adnactions > div > button.addonbtn.addonnothx.addon-overlay-close-button");

	// Constructor
	public EbayHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions on elements
	public void insertInSearchBox(String searchItem) {
		driver.findElement(searchBtn).sendKeys("charger type c");
	}

	public void clickingOnSearch() {
		driver.findElement(clickSearchBtn).click();
	}

	public void clickingOnItem() {
		driver.findElement(chooseProduct).click();
	}

	public void choosingLength() {
	Select chooseFromDropdown = new Select(driver.findElement(By.id("msku-sel-1")));
	chooseFromDropdown.selectByIndex(3);
	}

	public void choosingColor() {
	Select chooseColor = new Select(driver.findElement(By.id("msku-sel-2")));
	chooseColor.selectByIndex(2);
	}

	public void addingToCart() {
		driver.findElement(addToCart).click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	public void respondToPopUp() throws InterruptedException {
		driver.switchTo().frame(0);
				driver.findElement(cancelWarrantyBtn);
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}

}
