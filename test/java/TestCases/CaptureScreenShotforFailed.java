package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;
//to capture a screenshot for fail test cases
public class CaptureScreenShotforFailed extends TestBase{
	 
	
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
    	String expTitle = "Swag. Labs";
    	String actTtle = login.verifyTitle();
    	Assert.assertEquals(expTitle, actTtle);
    }
    
	@Test(enabled=false)
	public void verifyloginToApp()
	{
      String expResult = "https://www.saucedemo.com/inventory.html";
      String actUrl = login.loginToApp();
	  Assert.assertEquals(expResult, actUrl);	
	}
	@Test(enabled=false)
	public void labelofInventory()
	{
		String expRes = "PRODUCTS";
		String actRes = login.labelofInventory();
		Assert.assertEquals(expRes, actRes);
	}
	@AfterMethod
	public void closeBrowser(ITestResult a) throws Exception
	{
	
		if(ITestResult.FAILURE==a.getStatus())
				{
			     
			      UtilityMethod.captureScreenshot(a.getName());
		
				}
			
		
		driver.close();
	}
	
	
}
	
	


