package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
	public WebDriver driver;
  @Test
  public void launchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "/selenium_April_22/Binary/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
  }
  @Test
  public void login() {
	  WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("utkarshaa.academy@gmail.com");
		password.sendKeys("12345432");
		LoginBtn.click();
  }
}
