package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://demo.guru99.com/test/upload/");
//        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//
//        
//        uploadElement.sendKeys("C:\\Users\\PC\\Pictures\\1607591595_198751.jfif");       
//        driver.findElement(By.id("terms")).click();
//        driver.findElement(By.name("send")).click();
		
		// ------------để sau:
		driver.get("https://www.virustotal.com/gui/");
      WebElement uploadElement = driver.findElement(By.id("infoIcon"));

      
      uploadElement.sendKeys("C:\\Users\\PC\\Pictures\\1607591595_198751.jfif");       
      driver.findElement(By.xpath("//*[@id=\"confirmUpload\"]")).click();
      //driver.findElement(By.name("send")).click();
		
		
        Thread.sleep(3000);
        driver.close();
        
        
        
	}

}
