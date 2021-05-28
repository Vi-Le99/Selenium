package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php ");
		Select select=new Select(driver.findElement(By.name("country")));
		if (select.isMultiple()) {//kiem tra xem duoc chon nhieu cai cung 1 luc khong
			System.out.println("Duoc phep chon nhieu cai");
		}else {
			System.out.println("Chi dc chon 1 cai");
		}
		
		select.selectByVisibleText("CHILE");
		Thread.sleep(1500);
		select.selectByValue("GUAM");
		Thread.sleep(1500);
		select.selectByIndex(0);
		Thread.sleep(1500);
		
		//---------------------------
		
		driver.get("http://jsbin.com/osebed/2");
		Select select1=new Select(driver.findElement(By.id("fruits")));
		if (select1.isMultiple()) {//kiem tra xem duoc chon nhieu cai cung 1 luc khong
			System.out.println("Duoc phep chon nhieu cai");
		}else {
			System.out.println("Chi dc chon 1 cai");
		}
		
		select1.selectByVisibleText("Apple");
		Thread.sleep(1500);
		select1.selectByValue("grape");
		Thread.sleep(1500);
		select1.selectByIndex(0);
		Thread.sleep(1500);
		select1.deselectAll();
		driver.close();

	}

}
