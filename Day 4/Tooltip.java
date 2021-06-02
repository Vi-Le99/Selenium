package selenium_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// ------------------bai 1
//        driver.get("http://demo.guru99.com/test/social-icon.html");					
//        String expectedTooltip = "Github";	
//        
//        WebElement icon = driver.findElement(By.cssSelector("a[class='github']"));	
//        String tooltip = icon.getAttribute("title");	
//        
//       	
//        System.out.println("Tooltip: "+tooltip);							
//        if(tooltip.equals(expectedTooltip)) {							
//            System.out.println("tooltip = expectedTooltip");					
//        }		
//        driver.close();		

		// --------------------bai 2
		driver.get("http://demo.guru99.com/test/tooltip.html");
		
		String expectedTooltip = "Github";
		WebElement download = driver.findElement(By.id("download_now"));	
		
        Actions builder = new Actions (driver);			       		
        builder.moveToElement(download).build().perform(); //di chuyen chuot den button download
        
        
        WebElement tooltipElement = driver.findElement(By.className("tooltip"));							
        String tooltip = tooltipElement.getText();			
        
        System.out.println("Tool Tip:  "+tooltip);							
        if(tooltip.equals(expectedTooltip)) {							
            System.out.println("Test Case: Passed");					
        }		
        driver.close();			

	}

}
