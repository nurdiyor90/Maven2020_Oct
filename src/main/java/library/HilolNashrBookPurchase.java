package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HilolNashrBookPurchase {
	WebDriver driver;

	By changeLang = By.xpath("//*[@id=\"form-language\"]/div/button");
	By selectLang = By.xpath("//*[@id=\"form-language\"]/div/ul/li[3]/button");
	By searching = By.id("search-block");
	By insertText = By.xpath("//*[@id=\"search\"]/input");
	By selectBook = By.xpath("//*[@id=\"content\"]/div[3]/div[5]/div/div[2]/div/div[1]/h4/a");
	By addQuantity = By.xpath("//*[@id=\"product\"]/div/div/input[3]");
	By addToCart = By.id("button-cart");
	By clickOnShoppingCart = By.xpath("//*[@id=\"cart\"]/a/span");
	By checkOut = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/div/a[2]");

	public HilolNashrBookPurchase(WebDriver driver) {
		this.driver = driver;
	}

	public void changingLanguage() {
		driver.findElement(changeLang).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void selectingLanguage() throws InterruptedException {
		driver.findElement(selectLang).click();
		Thread.sleep(6000);
	}

	public void searchBox() {
		driver.findElement(searching).click();
	}

	public void insertingText() {
		driver.findElement(insertText).sendKeys("Oltin Silsila");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();

	}

	public void selectingBook() {
		driver.findElement(selectBook).click();
	}

	public void addingQuantity() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			driver.findElement(addQuantity).click();
		}
	}

	public void addingToCart() {
		driver.findElement(addToCart).click();
	}

	public void clickingOnShoppingCart() {
		driver.findElement(clickOnShoppingCart).click();
	}

	public void checkingOut() {
		driver.findElement(checkOut).click();
	}
}
