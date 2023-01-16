package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase {
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{

		initalization();
		 login=new LoginPage();
	}
	
	@Test(priority=0)
	public void verifyTitleTest1() throws Exception
	{
		String exptitle = "Swag Labs";
		String acttitle = login.verifyTitle();
		Assert.assertEquals(exptitle, acttitle);
	}
	@Test(priority=-122)
	public void verifyTitleTest2() throws Exception
	{
		String exptitle = "Swag Labs";
		String acttitle = login.verifyTitle();
		Assert.assertEquals(exptitle, acttitle);
	}
    @Test(priority=-122)
    public void verifyTitleTest3() throws Exception
    {
    	String exptitle = "Swag Labs";
    	String acttitle = login.verifyTitle();
    	Assert.assertEquals(exptitle, acttitle);
    }
	@Test(priority=2)
	public void verifyTitleTest4() throws Exception
    {
    	String exptitle = "Swag Labs";
    	String acttitle = login.verifyTitle();
    	Assert.assertEquals(exptitle, acttitle);
    }
	@Test(priority=1)
	public void verifyTitleTest5() throws Exception
    {
    	String exptitle = "Swag Labs";
    	String acttitle = login.verifyTitle();
    	Assert.assertEquals(exptitle, acttitle);
    }
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}


