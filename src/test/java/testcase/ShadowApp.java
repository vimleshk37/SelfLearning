package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShadowApp {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void ZeilWebLogin() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("/html/body")).getShadowRoot()
				.findElement(By.cssSelector("body > flutter-view > flt-text-editing-host > form #username"));
		element.sendKeys("Vimlesh Kumar");
		
	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/explore");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void closer() {
		//driver.close();
		System.out.println("Closing Browser");
	}

}
