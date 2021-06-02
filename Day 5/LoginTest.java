package testng_4;

import org.openqa.selenium.Keys;
import org.testng.annotations.*;


public class LoginTest {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to application");
	}
	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from application");
	}
	//before method chay truoc @test
	@BeforeMethod
	public void connectDB() {
		System.out.println("Connect to DB");
	}
	//after method chay sau test
	@AfterMethod
	public void disconnectDB() {
		System.out.println("Disconnect to DB\n");
	}
	
	//binh thuong @test se chay theo thu tu bang chu cai (neu k co priority)
	@Test(priority = 1, description = "This is a login test")
	public void bloginTest() {
		System.out.println("Test 1 - Login is successful");
	}
	
	@Test(priority = 2, description = "This is a logout test")
	public void alogoutTest() {
		System.out.println("Test 2 - Logout is successful");
	}
}
