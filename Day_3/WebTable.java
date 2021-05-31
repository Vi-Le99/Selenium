package selenium_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//------Bai 1
//		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
//		String text =driver.findElement(By.xpath("//table/tbody/tr[2]/td")).getText();
//		System.out.println(text);
//		Thread.sleep(2000);
		
		//------Bai 2
//		driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
//		String text =driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]")).getText();
//		System.out.println(text);
		
		//------Bai 3
		driver.get("http://demo.guru99.com/test/newtours/");
		String text =driver.findElement(By.xpath("//table[@width='270']/tbody/tr[5]/td")).getText();
		System.out.println(text);
		
		text =driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
				+"table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/"
				+"table/tbody/tr[4]/td/table/tbody/tr[1]/td/font")).getText();
		System.out.println(text);
		driver.close();
		
	}

}
