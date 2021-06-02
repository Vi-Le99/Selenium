package testng_4;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void verifyHomepageTitle() {
	       
	      System.out.println("launching chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String title = driver.getTitle();
	      Assert.assertEquals(title, expectedTitle);
	      driver.close();
	  }
}
