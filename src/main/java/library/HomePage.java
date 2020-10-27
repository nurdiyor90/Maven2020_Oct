package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	//List of Element addresses
	
	By searchBox = By.id("search_query_top");
	
	By searchBtn = By.name("submit_search");
	
	By firstProduct = By.xpath("(//img[@title='Printed Summer Dress'])[1]");
	
	By contactUsBtn = By.xpath("//a[@title='Contact Us']");
	
	By SigninBtn = By.className("login");
	
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Actions on elements
	public void insertIntoSearchBox(String searchItem) {
		driver.findElement(searchBox).sendKeys(searchItem);
	}
	public void clickContactUs() {
		driver.findElement(contactUsBtn).click();
	}
	public void clickSignIn() {
		driver.findElement(SigninBtn).click();
	}

	public void clickOnImg() {
		driver.findElement(firstProduct).click();
	}
public void clickSearchBtn () {
	driver.findElement(searchBtn).click();
}

}
