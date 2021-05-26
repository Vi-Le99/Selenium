package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCLearSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Form Authentication")).click();

		WebElement userElement = driver.findElement(By.id("username"));
		WebElement passElement = driver.findElement(By.id("password"));
		WebElement logElement = driver.findElement(By.className("radius"));
		
		userElement.sendKeys("ami");
		passElement.sendKeys("123");
		Thread.sleep(2000);
		
		userElement.clear();
		passElement.clear();
		Thread.sleep(2000);
		
		userElement.sendKeys("tomsmith");
		passElement.sendKeys("SuperSecretPassword!");
		Thread.sleep(2000);
		//logElement.click();  cach 1
		//cach 2:
		logElement.submit();
		

	}

}
