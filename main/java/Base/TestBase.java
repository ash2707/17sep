package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Readdata;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
		public static WebDriver driver;
		public void initalization() throws Exception
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.manage().window().maximize();
			driver.get(Readdata.readPropertyFile("url"));
			//driver.get("https://www.saucedemo.com/");
			
	
		}
		

	}


