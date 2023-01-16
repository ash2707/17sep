package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class SoftAssertionTest extends TestBase{
     LoginPage login;
     InventoryPage invent;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		 login = new LoginPage();
		invent=new InventoryPage();
		login.loginToApp();
	}
	@Test
    public void verifyPeekLogoTest()
    {
    	System.out.println("excution started");
    	SoftAssert soft=new SoftAssert();           //in the soft assertion exception occurs but method not excute but method
    	                                             //statements printed
    	boolean result = invent.VerifypeekLogo();
    	soft.assertEquals(result, false);
    	System.out.println("excution ended");
        soft.assertAll();
    	
    }
    @AfterMethod
    public void closeBrowser()
    {
    	driver.close();
    }
	
	}


