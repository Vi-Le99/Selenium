package selenium;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		WebDriverWait timeWait = new WebDriverWait(driver, 5);
		// timeWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("qi")));
		// driver.findElement(By.name("q")).sendKeys("hello");

		//timeWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("qi")));
		//wait qua thoi gian ma van k tim dc thi no se bao loi trong console:
		//Caused by: org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='qi']"}
		 
		//driver.close();
		
		driver = new ChromeDriver();//cach mo them 1 browser

		driver.get("http://w3school.com");
		
		driver.quit();
		

	}

}
