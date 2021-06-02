package selenium_4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String url = "http://demo.guru99.com/test/newtours/";
//		String underConsTitle = "Under Construction: Mercury Tours";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.get(url);
		//list chua cac the a
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		
		// khoi tao 1 mang string ten linkTexts co kich thuoc mang la so phan tu co trong list
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;

		//loi ERROR
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			System.out.println(e.getText()+" : "+ e.getAttribute("href"));
			i++;
		}

		WebElement tempElement;
		for (String t : linkTexts) {
			
			tempElement=driver.findElement(By.linkText(t));
			if(tempElement.getText()!="") {
			tempElement.click();
			System.out.println(t+" have title: "+driver.getTitle());
		
			driver.navigate().back();}
		}
	driver.quit();

	}

}
