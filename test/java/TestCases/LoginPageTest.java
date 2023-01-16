package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
    LoginPage login;
    @BeforeMethod
    public void setup() throws Exception
    {
    	initalization();
    	login=new LoginPage();
    }
    @Test
    public void verifyTitleTest() throws Exception
    {
    	String expTitle = "Swag Labs";
    	String actTtle = login.verifyTitle();
    	Assert.assertEquals(expTitle, actTtle);
    }
    
	@Test
	public void verifyloginToApp()
	{
      String expResult = "https://www.saucedemo.com/inventory.html";
      String actUrl = login.loginToApp();
	  Assert.assertEquals(expResult, actUrl);	
	}
	@Test
	public void labelofInventory()
	{
		String expRes = "PRODUCTS";
		String actRes = login.labelofInventory();
		Assert.assertEquals(expRes, actRes);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	 
	
}



