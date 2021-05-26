package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		
		// ----------single window & multiple tabs
		/*
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Trợ giúp")).click();//giup mo ra 1 tab moi
		Thread.sleep(3000);
		//driver.close(); chi dong 1 tab cu da mo
		driver.quit();//dong tat ca tab da mo (dong trinh duyet)
		*/
		
		
		
		//-----------multiple window
		/*
		driver.get("http://www.naukri.com"); //se mo ra nhieu window
		Thread.sleep(3000);		
		Thread.sleep(3000);
		//driver.close(); chi dong 1 window cu (window mo ra dau tien)
		driver.quit();//dong tat ca window da mo
		*/
		
		/*
		 * Trong truong hop dung nhieu dong new ChromeDriver de tao nhieu window, thi quit() chi dong dc window moi mo
		 * nen moi lan new xong ta phai quit() no 
		 */
		
		//------------multiple window with new ChromeDriver()
		driver.quit();
		driver=new ChromeDriver();
		driver.quit();
		
		
	}

}
