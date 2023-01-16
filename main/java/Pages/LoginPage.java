package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {	

	@FindBy(xpath="//div[@class='login_logo']")private WebElement swagLogo; 
	@FindBy(xpath="//input[@name='user-name']")private WebElement userName;
	@FindBy(xpath="//input[@name='password']")private WebElement passWord;
	@FindBy(xpath="//input[@name='login-button']")private WebElement loginBtn;
	
	@FindBy(xpath="//span[@class='title']")private WebElement productLabel ;

	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyTitle() throws Exception
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	/*public  boolean swagLogo()
	{
		return swagLogo.isDisplayed();
	}*/
	
	public String  loginToApp()
	{
	     userName.sendKeys("standard_user");	
		 passWord.sendKeys("secret_sauce");
		 loginBtn.click();
		return  driver.getCurrentUrl();
	}
	public String labelofInventory()
	{
		   loginToApp();
		   return productLabel.getText();

	}
	
	
	
	}


	



	
	


	


