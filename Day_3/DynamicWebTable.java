package selenium_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> numCol = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("số cột: " +numCol.size());
		
		List<WebElement> numRow = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("số hàng dữ liệu: " +numRow.size());
		
		
//		WebElement data1Row = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]"));
//		System.out.println("Dữ liệu hàng 7: " +data1Row.getText());
		
		//WebElement dataElement =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[7]/td[3]"));
		//System.out.println("Dữ liệu hàng 7, cột 3: " +dataElement.getText());
		
		String data;
		float sum=0;
		for(int i=1; i<=numRow.size();i++) {
			data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[3]")).getText();
			sum+=Float.parseFloat(data);
		}
		System.out.println("Sum: "+ sum);
		
		double max=0;
		double temp;
		for(int i=1; i<=numRow.size();i++) {
			data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[3]")).getText();
			temp=Double.parseDouble(data);
			if(temp>max) {
				max=temp;
			}
		}
		System.out.println("Max: "+ max);
		 
		
		driver.close();
		

	}

}
