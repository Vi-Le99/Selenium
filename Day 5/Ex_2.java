package testng_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Ex_2 {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;
	 @AfterTest
	    public void terminateBrowser(){//dong browser
	        driver.close();
	    }
	@BeforeTest
    public void launchBrowser() {//khoi tao
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    @Test
    public void verifyHomepageTitle() {//kt title
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
   }
   
}
