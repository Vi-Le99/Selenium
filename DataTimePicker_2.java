package selectDate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class DataTimePicker_2 {
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
	}

	@Test
	public void chooseDateTime() throws InterruptedException {
		WebElement dateTimElement = driver.findElement(By.id("datetimepicker"));
		dateTimElement.sendKeys("06032021");
		dateTimElement.sendKeys(Keys.ARROW_RIGHT);
		dateTimElement.sendKeys("0959PM");
		Thread.sleep(3000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
