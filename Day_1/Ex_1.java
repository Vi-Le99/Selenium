package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// cach 1:driver.get("https://www.w3schools.com/");
		// cach2: driver.navigate().to("https://www.w3schools.com/");
		
		//------------------vd1--------------------
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome";
		String actualTitle = "";

		driver.get(baseUrl);

		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		// driver.close(); //dong trinh duyet
		//System.exit(0); //dong chuong trinh nhung trinh duyet van mo
		 
		 
		
	}

}
