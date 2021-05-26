package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();

		///
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of elements:" + elements.size());
		for (int i = 0; i < elements.size(); i++) {
			// in ra thu tu cua element trong list va gia tri cua thuoc tinh value
			System.out.println("value of element: " + "[" + i + "]" + elements.get(i).getAttribute("value"));
			System.out.println("type of element: " + "[" + i + "]" + elements.get(i).getAttribute("type"));

		}

	}

}
