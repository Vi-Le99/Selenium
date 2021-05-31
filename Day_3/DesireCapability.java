package selenium_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapability {

	public static void main(String[] args) {
//		WebDriver driver = new InternetExplorerDriver();
//		 driver.manage().window().maximize();
//		 driver.get("http://gmail.com");
//		  
//		 driver.quit();
		//=> gây ra lỗi
		
		DesiredCapabilities capabilities= DesiredCapabilities.chrome();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		System.out.println(capabilities.getBrowserName());
		System.out.println(capabilities.getVersion());
		System.out.println(capabilities.getPlatform());
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chromeAmi");
		System.out.println("new: " +capabilities.getBrowserName());
		driver.close();
	}

}
