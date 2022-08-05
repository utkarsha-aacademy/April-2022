package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewparallelTest {
	public WebDriver driver;
	  @Test
	  public void launchChrome() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/TestNGDemo/Binary/chromedriver.exe");
	//  ChromeOptions option= new ChromeOptions();
	//  option.addArguments("--headless");
	  driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  UserName.sendKeys("XA0634");
		  Password.sendKeys("Sarika699!");
		  LoginBtn.click();
		//  Thread.sleep(1000);
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys("691991");
		  ContinueBtn.click();
		  Thread.sleep(3000);
		  String ExpectedTitle = "Dashboard / Kite";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
		 driver.close();
	 }
	  @Test
	  public void launchEdge() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","/TestNGDemo/Binary/msedgedriver.exe");
	//  EdgeOptions opt = new EdgeOptions();
	//  opt.addArguments("--headless");
	  driver = new EdgeDriver();
	  driver.get("https://kite.zerodha.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  UserName.sendKeys("XA0634");
		  Password.sendKeys("Sarika699!");
		  LoginBtn.click();
		//  Thread.sleep(1000);
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys("691991");
		  ContinueBtn.click();
		  Thread.sleep(3000);
		  String ExpectedTitle = "Dashboard / Kite";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
		 driver.close();
	 }
	  @Test
	  public void launchGecko() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","/TestNGDemo/Binary/geckodriver.exe");
	 // FirefoxOptions opt1 = new FirefoxOptions();
	 // opt1.addArguments("--headless");
	  driver = new FirefoxDriver();
	  driver.get("https://kite.zerodha.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  UserName.sendKeys("XA0634");
		  Password.sendKeys("Sarika699!");
		  LoginBtn.click();
		  Thread.sleep(1000);
		  WebElement PIN = driver.findElement(By.xpath("//input[@id='pin']"));
		  WebElement ContinueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  PIN.sendKeys("691991");
		  ContinueBtn.click();
		  Thread.sleep(3000);
		  String ExpectedTitle = "Dashboard / Kite";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, ExpectedTitle);
		 driver.close();
	 } 
}
