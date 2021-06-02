package testng_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex_4 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;
	public String expected = null;
	public String actual = null;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test(priority = 0,groups = { "one", "two" })
	public void verifyHomepageTitle() {
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 1,groups = { "one"})
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		expected = "Register: Mercury Tours";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		expected = "Under Construction: Mercury Tours aaaa";
		actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
//giua non-priority va prioriy, thi thuc hien non-priority (theo bang chu cai) truoc
// sau do moi thuc hien cac method theo priority
	@Test(dependsOnMethods = {"register"})
	public void goBackToHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
