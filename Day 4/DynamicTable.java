package selenium_4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/table.html");
		WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
		
		
		List < WebElement > rows = mytable.findElements(By.tagName("tr"));
       	int rowsCount = rows.size(); //so dong cua table
    	
    	for (int i = 0; i < rowsCount; i++) {
    	    //list chua cac cot trong 1 dong
    	    List < WebElement > colums = rows.get(i).findElements(By.tagName("td"));
       	    int columnsCount = colums.size();      	    
       	    
       	    
    	    System.out.println("So cot co trong dong " + (i+1) + " la " + columnsCount);
    	    
    	    for (int j = 0; j < columnsCount; j++) {
    	        
    	        String celtext = colums.get(j).getText();
    	        System.out.println("gia tri cua hang " + (i+1)+ " va cot " + (j+1) + " la " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
    	}
	}

}
