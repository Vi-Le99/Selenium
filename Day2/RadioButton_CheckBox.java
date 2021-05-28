package selenium_2;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-2"));
		
		radio1.click();
		radio2.click();
		checkbox1.click();
		checkbox2.click();
		
		if(radio1.isSelected()) {
			System.out.println("Radio button is selected");
		}else {
			System.out.println("Radio button is not selected");
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(i+1+". Checkbox1 is selected: "+checkbox1.isSelected());
			checkbox1.click();
		}
		
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		WebElement imageElement=driver.findElement(By.cssSelector("svg[class=\"eltiug27 a8c37x1j\""));
		imageElement.click();
		if(driver.getTitle().equals("Quên mật khẩu | Không thể đăng nhập | Facebook")) {
			System.out.println("Quên mật khẩu");
		}
		else {
			System.out.println(driver.getTitle());
		}

	}

}
