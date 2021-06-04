package parameterDataprovider;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MethodParameter {
	String driverPath = "C:\\Selenium\\driver\\chromedriver.exe";
	public WebDriver driver;
	 @BeforeTest
	    public void openBrowser(){
	    	System.setProperty("webdriver.chrome.driver", driverPath);
	    	driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://google.com");
	    }

	    @Test(dataProvider="SearchProvider")
	    public void testMethodA(String author,String searchKey) throws InterruptedException{
	        
	    	WebElement searchText = driver.findElement(By.name("q"));
	    	        searchText.sendKeys(searchKey);
	      
	        System.out.println("Welcome ->"+author+" . Your search key is->"+searchKey);
	        Thread.sleep(3000);	        
	        searchText.clear();
	        
	    }
	      
	    @Test(dataProvider="SearchProvider")
	    public void testMethodB(String searchKey) throws InterruptedException{
	        {
	        	WebElement searchText = driver.findElement(By.name("q"));
	            //Search text in search box
	            searchText.sendKeys(searchKey);
	            //Print only search string
	            System.out.println("Hello, your search key is->"+searchKey);
	            Thread.sleep(3000);	            
	            searchText.clear();
	            
	        }
	    }    
	    
	    @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(Method m){
	        if(m.getName().equalsIgnoreCase("testMethodA")){
	        return new Object[][] {
	                { "AAA", "India" },
	                { "KKK", "UK" },
	                { "BBBB", "USA" }
	            };}
	        else{
	        return new Object[][] {
	                { "Canada" },
	                { "Russia" },
	                { "Japan" }
	            };}       
	    }
	    @AfterTest
		public void closeBrowser() {
			driver.close();
		}
}
