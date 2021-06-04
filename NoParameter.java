package parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class NoParameter {

	@Test
	public void testNoParameter() throws InterruptedException {
		String author = "ThuyVi";
		String searchKey = "india";

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");// phai nam trong method
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://google.com");
		WebElement searchElement = driver.findElement(By.name("q"));

		searchElement.sendKeys(searchKey);

		System.out.println("Welcome " + author + " .Your search key is->" + searchKey);
		System.out.println("Sleep 3 s");

		Thread.sleep(3000);
		System.out.println("Value in Google Search Box = " + searchElement.getAttribute("value"));
		driver.close();

	}
}
