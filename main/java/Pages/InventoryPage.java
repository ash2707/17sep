package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class InventoryPage extends TestBase {
@FindBy(xpath="//div[@class='peek']")private WebElement peeklogo;
@FindBy(xpath="//img[@class='footer_robot']")private WebElement swagBot;
@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-backpack']")private WebElement bagPack;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLight;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement tShirt;
@FindBy(xpath ="//span[@class='shopping_cart_badge']") private WebElement productCount;
@FindBy(xpath="//button[@name='checkout']")private WebElement checkoutBtn;
@FindBy(xpath="//span[@class='title']")private WebElement yourcarttitle;
@FindBy(xpath="//span[@class='title']")private WebElement yourinformation;
@FindBy(xpath="//input[@name='firstName']")private WebElement firsname;
@FindBy(xpath="//input[@name='lastName']")private WebElement lastname;
@FindBy(xpath="//input[@name='postalCode']")private WebElement postalcode;
@FindBy(xpath="//input[@name='continue']")private WebElement continueBtn;
@FindBy(xpath="//span[@class='title']")private WebElement overview;
@FindBy(xpath="//button[@name='finish']")private WebElement finishbtn;
@FindBy(xpath="//span[text()='Checkout: Complete!']")private WebElement complete;
public InventoryPage()
{
	PageFactory.initElements(driver, this);
}
	
public boolean VerifypeekLogo()
{
	return peeklogo.isDisplayed();
}

public boolean VerifyswagBot()
{
	return swagBot.isDisplayed();
}


public boolean verifyaddProduct() throws Exception
{
	
	bagPack.click();
	bikeLight.click();
	tShirt.click();
	 productCount.click();
	 Thread.sleep(2000);
	return yourcarttitle.isDisplayed();
     
}
public boolean checkoutbtn() throws Exception
{
	
	verifyaddProduct();
	checkoutBtn.click();
	return yourinformation.isDisplayed();
}
public boolean continuemehod() throws Exception
{
	
	checkoutbtn();
	Thread.sleep(2000);

	firsname.sendKeys("aaa");
	Thread.sleep(2000);

	lastname.sendKeys("dddd");
	Thread.sleep(2000);

	postalcode.sendKeys("1231");
	Thread.sleep(2000);
	
	continueBtn.click();
	
	return overview.isDisplayed();
}
public boolean finishbtn() throws Exception
{
	continuemehod();
	Thread.sleep(2000);
	finishbtn.click();
	return complete.isDisplayed();	
}


	
	}
	
	
	
	
	
	
	
	

