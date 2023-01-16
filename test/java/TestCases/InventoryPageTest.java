package TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {
LoginPage login;
InventoryPage invent;
@BeforeMethod
public void setup() throws Exception {

	initalization();
    login = new LoginPage();
	login.loginToApp();
	invent=new InventoryPage();
	
	
}
	
@Test
public void VerifypeekLogoTest()
{
	boolean result = invent.VerifypeekLogo();
	Assert.assertEquals(result, true);
}
@Test
public void VerifyswagBotTest()
{
	boolean res = invent.VerifyswagBot();
	Assert.assertEquals(res, true);
}
@Test

public void verifyaddProductTest() throws Exception
{
	
	 boolean Result = invent.verifyaddProduct();
	 Assert.assertEquals(Result, true);
}
@Test

public void checkoutBtnTest() throws Exception

{
	
	boolean result = invent.checkoutbtn();
    Assert.assertEquals(result, true);
}
@Test
public void continuemethodtest() throws Exception
{
	 
	boolean result = invent.continuemehod();
	Assert.assertEquals(result, true);
}
@Test
public void finishbtntest() throws Exception
{
	boolean result = invent.finishbtn();
	Assert.assertEquals(result, true);
}

@AfterMethod
public void closeBrowser()
{
	driver.close();
}


	}


