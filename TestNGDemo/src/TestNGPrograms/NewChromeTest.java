package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewChromeTest {
  public WebDriver driver;
  @Test
  public void launcgChrome() {
  System.setProperty("webdriver.chrome.driver","/TestNGDemo/Binary/chromedriver.exe");
  ChromeOptions option= new ChromeOptions();
  option.addArguments("--headless");
  driver = new ChromeDriver(option);
  driver.get("https://kite.zerodha.com");
  }
 @Test(priority = 1)
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
 @Test(priority = 4)
 public void teardown()
 {
	 driver.close();
 }
  }
