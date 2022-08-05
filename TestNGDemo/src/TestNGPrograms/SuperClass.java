package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuperClass {
	public WebDriver driver;
	  @Test
	  public void launchBrowser() {
		  System.setProperty("webdriver.chrome.driver", "/TestNGDemo/Binary/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
	  }
}
