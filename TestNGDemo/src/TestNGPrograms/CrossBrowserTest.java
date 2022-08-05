package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	public WebDriver driver;
	 @BeforeClass
	  @Parameters("browser")
	  public void f(String browser) {
		  if(browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","/TestNGDemo/Binary/chromedriver.exe");
			  driver = new ChromeDriver();
			   }
		  else if(browser.equals("edge")) {
			  System.setProperty("webdriver.edge.driver","/TestNGDemo/Binary/msedgedriver.exe");
			  driver = new EdgeDriver();
		  }
		  else if(browser.equalsIgnoreCase("gecko")) {
			  System.setProperty("webdriver.gecko.driver","/TestNGDemo/Binary/geckodriver.exe");
			  driver = new FirefoxDriver();
		 }
		  driver.get("https://kite.zerodha.com");
	  }
	 @Test(priority = 1,invocationCount = 5)
	 public void loginkite() throws InterruptedException {
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  UserName.sendKeys("XA0634");
		  Password.sendKeys("Sarika699!");
		  LoginBtn.click();
		  Thread.sleep(1000);
	 }
	 @Test(priority = 2)
	 public void loginkitepin() throws InterruptedException {
		 WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys("691991");
		  ContinueBtn.click();
		  Thread.sleep(3000);
	 }
	 @Test(priority = 3)
	 public void CheckTitleTest() {
		  String ExpectedTitle = "Dashboard / Kite";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
	 }
	 @AfterClass
	 public void teardown() {
		 driver.quit();
	 }
}
