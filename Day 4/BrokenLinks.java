package selenium_4;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String urlHomePageString="http://demo.guru99.com/test/tooltip.html";
		driver.get(urlHomePageString);
		
		String urlString; //de luu url can kiem tra
		HttpURLConnection httpURLConnection; //dung de tao ket noi url
		int responseCode;
		
		//1. tim tat ca the a
		List<WebElement> linksElements=driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator=linksElements.iterator();
		
		while (iterator.hasNext()) {
			// 2. lay link trong the a
			urlString = iterator.next().getAttribute("href");//lay gt thuoc tinh href trong the a
			if (urlString==null || urlString.isEmpty()) {
				System.out.println(" the a k co duong link");
				continue;
			}
			if(!urlString.startsWith(urlHomePageString)) {
				System.out.println("link domain khac, bo qua! ");
				continue;
			}
			
			//gui request den link can kiem tra
			try {
				//mo ket noi
				httpURLConnection=(HttpURLConnection) new URL(urlString).openConnection();
				//set phuong thuc request( get, post hoac head)
				httpURLConnection.setRequestMethod("HEAD");
				httpURLConnection.connect();//ket noi den
				responseCode=httpURLConnection.getResponseCode();
				if(responseCode>=400) {
					System.out.println("Link bi hong: "+urlString);
				}
				else {
					System.out.println("Link ok");
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

		driver.close();
		

	}

}
