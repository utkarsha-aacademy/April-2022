package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @Test
  public void lauchChrome() {
	  System.setProperty("webdriver.chrome.driver", "/selenium_April_22/Binary/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  @Test
  public void lauchEdge() {
	  System.setProperty("webdriver.edge.driver", "/selenium_April_22/Binary/msedgedriver.exe");
	  driver = new EdgeDriver();
	  driver.get("https://www.google.com");
  }
}
