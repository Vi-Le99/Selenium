package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		String textString= driver.findElement(By.linkText("Tutorials")).getText();
		System.out.println(textString);
		
		textString=driver.findElement(By.partialLinkText("e")).getText();
		System.out.println(textString);
	}

}
