package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initalization();
		 login=new LoginPage();
		
	}
	@Test(groups={"sanity","Regression"})
	public void Test1() throws Exception
	{
		String exptitle = "Swag Labs";
		String acttitle = login.verifyTitle();
		Assert.assertEquals(exptitle, acttitle);
	}
    @Test(groups="smoke")
    public void Test2() throws Exception
	{
		String exptitle = "Swag Labs";
		String acttitle = login.verifyTitle();
		Assert.assertEquals(exptitle, acttitle);
	}
    @Test(groups= {"smoke","Regression"})
    public void Test3() throws Exception
	{
		String exptitle = "Swag Labs";
		String acttitle = login.verifyTitle();
		Assert.assertEquals(exptitle, acttitle);
	}
    @Test(groups="sanity")
    public void Test4() throws Exception
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
