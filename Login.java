package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login {
	WebDriver driver;

	@FindBy(name = "uid")
	WebElement usernameT;

	@FindBy(name = "password")
	WebElement passwordT;

	@FindBy(className = "barone")
	WebElement titleText;

	@FindBy(name = "btnLogin")
	WebElement login;

	// ham khoi tao, chen WebDriver vao
	public Login(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 20);
		//sau 20 giay k tim thay element thi se nem ngoai le
		PageFactory.initElements(factory, this);

	}

	public void setUserName(String strUserName) {
		usernameT.sendKeys(strUserName);
	}

	public void setPassword(String strPassword) {
		passwordT.sendKeys(strPassword);
	}

	public void clickLogin() {
		login.click();
	}

	public String getLoginTitle() {
		return titleText.getText();
	}

	public void loginToGuru99(String strUserName, String strPasword) {
		this.setUserName(strUserName);
		this.setPassword(strPasword);
		this.clickLogin();

	}

}
