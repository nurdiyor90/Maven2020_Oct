package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalmartSearchItem {
	
	 private WebDriver driver;
	
	//List of Element addresses
	
	By searchBtn = By.id("global-search-input");
	
	By clickSearchBtn = By.xpath("//*[@id=\"global-search-submit\"]/span/img");
	
	By chooseProduct = By.cssSelector("#searchProductResult > ul > li:nth-child(2) > div > div.search-result-gridview-item.clearfix.arrange-fill > div:nth-child(5) > div > a > span");
	
	By addToCart = By.xpath("//*[@id=\"add-on-atc-container\"]/div[1]/section/div[1]/div[3]/button");
	
	
	
		//Constructor
		public WalmartSearchItem(WebDriver driver) {
			this.driver=driver;
		}
	
	//Actions on elements
	public void insertIntoSearchBox(String searchItem) {
		driver.findElement(searchBtn).sendKeys("soccer ball");
	}
	public void clickingOnSearch() {
		driver.findElement(clickSearchBtn).click();
	}
	public void clickingOnItem() {
		driver.findElement(chooseProduct).click();
	}
	public void addingToCart() {
		driver.findElement(addToCart).click();
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.close();

	}

	

}
