package selenium_2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		driver.get("https://fonts.google.com/");
//		WebElement searchElement=driver.findElement(By.id("mat-input-0"));

		// cach 1
//		Actions actions=new Actions(driver);
//		Action mouseAction=actions
//				.sendKeys(searchElement, "nunito",Keys.ENTER)
//				.build();
//		mouseAction.perform();

		
		driver.get("http://demo.guru99.com/test/yahoo.html");
		//tim button download
		WebElement dowloadElement = driver.findElement(By.id("messenger-download"));
		//lay link download
		String sourceLinkString = dowloadElement.getAttribute("href");
		String wgetCommandString = "cmd /c C:\\Selenium\\wget\\wget.exe -P G: --no-check-certificate " + sourceLinkString;

		try {
			//dùng để chạy lệnh cmd wget
			Process exec = Runtime.getRuntime().exec(wgetCommandString);
			// waitFor() dùng để chờ đến khi download xong
			exec.waitFor();
			System.out.println("Download completed");
		} catch (InterruptedException | IOException e) {
			System.out.println(e.toString());
		}
		driver.close();

	}

}
