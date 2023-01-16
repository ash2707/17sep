package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
//one test depends on another test case if one test case runs then another also run
public class DependentTest extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login =new LoginPage();
		
	}
	@Test
	public void verifytitletest() throws Exception
	
	{
		String exptitle = "Swag Labs";
		String acttitle = login.verifyTitle();
	    Assert.assertEquals(exptitle, acttitle);
	}
	@Test(dependsOnMethods="verifytitletest")
	public void loginToApptest()
	{
		String expurl = "https://www.saucedemo.com/inventory.html";
	    String acturl = login.loginToApp();
	    Assert.assertEquals(expurl, acturl);
	}
	

	
	}


