package selenium_3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.naukri.com");

		Thread.sleep(2000);

		String mainWindow = driver.getWindowHandle();
		// System.out.println("main" + mainWindow);

		// 1 tập hợp tên s1
		Set<String> s1 = driver.getWindowHandles();
		// hàm iterator dùng để duyệt phần tử trong 1 tập hợp
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {

			String childWindow = i1.next();
			// System.out.println("child: " + childWindow);
			if (!mainWindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);
				Thread.sleep(1500);
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);

		// -----------Alert

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("55555");
		driver.findElement(By.name("submit")).submit();

		
		Alert alert = driver.switchTo().alert();			
		System.out.println(alert.getText());
		Thread.sleep(2000);

		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
