package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParameter {
  @Test
  @Parameters("browser")
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","/TestNGDemo/Binary/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
	  }
	  else if(browser.equals("edge")) {
		  System.setProperty("webdriver.edge.driver","/TestNGDemo/Binary/msedgedriver.exe");
		  WebDriver driver = new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  else if(browser.equalsIgnoreCase("gecko")) {
		  System.setProperty("webdriver.gecko.driver","/TestNGDemo/Binary/geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.facebook.com");
	  }
  }
}
