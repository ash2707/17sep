package TestCases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DemoTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		
	}
   @Test(invocationCount=1)          // it is for the exceute test case multiple time given by no
   public void verifyTitle() throws Exception
   {
	     String exptitle = "Swag Labs";
	     String acttitle = login.verifyTitle();
	     Assert.assertEquals(exptitle, acttitle);
   }
   @Test(timeOut=2)              // for failing test case
   public void verifytitleTest1() throws Exception
   {
	    String exptitle = "Swag Labs";
	    String acttitle = login.verifyTitle();
	    Assert.assertEquals(exptitle,acttitle);
	    System.out.println("test cse ");
	    
   }
   
	}


