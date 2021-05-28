package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Event {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillshare.com/home");
				
		WebElement linkBrowseElement= driver.findElement(By.linkText("Browse"));

		Actions actions=new Actions(driver);
		Action mouseAction=actions
				.moveToElement(linkBrowseElement)
				.build();
		
		
//		String colorString=linkBrowseElement.getCssValue("color");
//		//System.out.println(colorString); //in ra: rgba(255,255,255,1)		
//		String hex = Color.fromString(colorString).asHex();//dung class color doi sang ma hex
//		System.out.println("Before hover: " +hex);
//		
//		mouseAction.perform();
//		colorString=linkBrowseElement.getCssValue("color");
//		hex = Color.fromString(colorString).asHex();
//		System.out.println("After hover: " +hex);
//		
//		Thread.sleep(2000);
		
				
		//---------------------------	
		
		
		WebElement inputElement=driver.findElement(By.name("email"));
		mouseAction=actions
				.moveToElement(inputElement)
				.click()
				.keyDown(inputElement, Keys.SHIFT)//de in hoa input
				.sendKeys(inputElement, "lelythuyvi@gmail.com")
				.keyUp(inputElement, Keys.SHIFT)
				.doubleClick()//de highlight input
				.contextClick() //click chuot phai
				.build();
		mouseAction.perform();
		Thread.sleep(2000);
		driver.close();
				
		
		
		
		
		
		

	}

}
