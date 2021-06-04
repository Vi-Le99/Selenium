package pomPageFactory;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	public String baseUrl = "http://demo.guru99.com/V4/";
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;
	Login objLogin;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		objLogin=new Login(driver);
	}

	@Test(priority = 0)
	public void verifyHomepageTitle() {
		
		System.out.println(objLogin.getLoginTitle());
	}

	@Test(priority = 1)
	public void loginToPage() {
		objLogin.loginToGuru99("mgr123", "mgr!23");
	}

	
	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
