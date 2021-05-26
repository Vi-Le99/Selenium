package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserController {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		
		//maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//back & forward & refresh
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		//toa do xuat hien cua so
//		Point point=new Point(10, 200);
//		driver.manage().window().setPosition(point);
//		Thread.sleep(2000);		
		
		//set size
		Dimension dimension=new Dimension(80, 200);//(rong, dai)
		driver.manage().window().setSize(dimension);
		
		
		Thread.sleep(2000);	
		driver.close();

	}

}
