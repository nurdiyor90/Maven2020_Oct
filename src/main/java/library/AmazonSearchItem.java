package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchItem {
	
	  WebDriver driver;
	 
	
	//List of Element addresses
	
	By searchBox = By.id("twotabsearchtextbox");
	
	By clickOnSearchBtn = By.id("nav-search-submit-text");
	
	By selectProduct = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[6]/div/span/div/div/div/div/div[2]/h2/a/span");
	
	By addToCart = By.id("add-to-cart-button");
	
	
	
	//Constructor
	public AmazonSearchItem(WebDriver driver) {
		this.driver=driver;
	}
	
	//Actions on elements
	public void insertIntoSearchBox(String searchItem) {
		driver.findElement(searchBox).sendKeys("tea pot");
	}
	public void clickSearch() {
		driver.findElement(clickOnSearchBtn).click();
	}
	public void clickOnItem() {
		driver.findElement(selectProduct).click();
	}

	public void addingIntoCart() throws InterruptedException {
		driver.findElement(addToCart).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.close();

	}

	

}
