package parameterDataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class ParameterProvider_1Class {
	@DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Ami", "India" },
            { "ThuyVi", "UK" },
            { "Lily", "USA" }
        };

    }
	@Test(dataProvider="SearchProvider")
	  
	  public void testHaveParameter(String author, String searchKey) throws InterruptedException{
	     //neu trong file xml khong co value cua tham so author thi lay gia tri trong @optional("<gia tri tham so>")
		  //String author = "ThuyVi";
	      //String searchKey = "india";
		  
	      //truyen 2 tham so author va searchKey vao
	      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");//phai nam trong method        
	      WebDriver driver= new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.get("https://google.com");
	      WebElement searchElement = driver.findElement(By.name("q"));
	      
	      searchElement.sendKeys(searchKey);
	      
	      System.out.println("Welcome "+author+" .Your search key is->"+searchKey);
	      System.out.println("Sleep 3 s");
	      
	      Thread.sleep(3000);
	      System.out.println("Value in Google Search Box = "+searchElement.getAttribute("value") );
	      driver.close();
	  }
}
