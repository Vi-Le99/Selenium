package parameterDataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupParameter {
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;

	@BeforeTest(groups = {"A", "B"}) 
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}

	@Test(dataProvider = "SearchProvider", groups = "A")
	public void testMethodA(String author, String searchKey) throws InterruptedException {

		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);

		System.out.println("Welcome ->" + author + " . Your search key is->" + searchKey);
		Thread.sleep(3000);
		searchText.clear();

	}

	@Test(dataProvider = "SearchProvider", groups = "B")
	public void testMethodB(String searchKey) throws InterruptedException {
		{
			WebElement searchText = driver.findElement(By.name("q"));
			// Search text in search box
			searchText.sendKeys(searchKey);
			// Print only search string
			System.out.println("Hello, your search key is->" + searchKey);
			Thread.sleep(3000);
			searchText.clear();

		}
	}

	@DataProvider(name = "SearchProvider") // lay data truoc khi ta chay class
	// nen can keu group truoc khi chay class trong file xml
	public Object[][] getDataFromDataprovider(ITestContext c) {
		Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
			if (group.equalsIgnoreCase("A")) {
				groupArray = new Object[][] { { "Ami", "mua mua ha" }, { "Vivi", "hanh phuc o dau" },
						{ "Lyly", "Moi thu roi se troi qua" } };
				break;
			} else if (group.equalsIgnoreCase("B")) {
				groupArray = new Object[][] { { "hoc toan" }, { "ngu van" }, { "lich su" } };
			}
			break;
		}
		return groupArray;
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
