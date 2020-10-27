package online_shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.HomePage;
import library.HomePageFactory;

@Test
public class SearchOfProductTest {

	String url = "http://automationpractice.com/index.php";
	WebDriver driver;

	@BeforeMethod // It will do set up after every test case
	public void setUpDriver() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void searchItem() throws InterruptedException {
		driver.get(url);
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");

		driver.findElement(By.name("submit_search")).click();

		driver.findElement(By.xpath("//a[@title='Contact Us']")).click();

		driver.findElement(By.className("login")).click();

	}

	@Test
	public void searchItemPageObject() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		driver.get(url);

		homePage.insertIntoSearchBox("shirt");

		homePage.clickSearchBtn();

		homePage.clickContactUs();

		homePage.clickSignIn();

	}

	@Test
	public void searchItemPageFactory() throws InterruptedException {

		HomePageFactory homePage = new HomePageFactory(driver);
		driver.get(url);

		homePage.insertIntoSearchBox("shirt");

		homePage.clickSearchBtn();

		homePage.clickContactUs();

		homePage.clickSignIn();
		
}
}
