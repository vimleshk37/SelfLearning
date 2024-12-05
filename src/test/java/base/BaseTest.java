package base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Readproperties;

public class BaseTest extends Readproperties{
	public static WebDriver driver;
	@BeforeClass
	@Parameters("application")
	public void setup(@Optional("AutomationDemo") String application) throws IOException{
		if(ReadConfig("browser").equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			if(application.equals("AutomationDemo"))
			driver.get(ReadConfig("testurl_1"));
			
			if(application.equals("Astroyogi"))
			driver.get(ReadConfig("testurl_2"));
			
			if(application.equals("Flipkart"))
			driver.get(ReadConfig("testurl_3"));
		}
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
		System.out.println("Browser is closed");
	}

}
