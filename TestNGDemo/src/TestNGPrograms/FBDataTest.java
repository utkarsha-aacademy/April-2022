package TestNGPrograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FBDataTest {
  public WebDriver driver;
  @Test(dataProvider = "dp")
  public void fblogin(String username, String password) {
	  System.setProperty("webdriver.chrome.driver", "/TestNGDemo/Binary/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  UserName.sendKeys(username);
	  Password.sendKeys(password);
	  LoginBtn.click();
	  String ExpectedTitle = "Facebook";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "ravinangre@gmail.com", "123454321" },
      new Object[] { "ravinangre1983@gmail.com", "1234532" },
      new Object[] { "utkarshaa.academy@gmail.com", "1234532" },
      new Object[] { "academyutkarshaa@gmail.com", "1234532" },
      new Object[] { "info@utkarshaaacademy.com", "1234532" },
      new Object[] { "ravinangre1983@gmail.com", "1234532" },
      new Object[] { "ravinangre1983@gmail.com", "1234532" },
      new Object[] { "ravinangre1983@gmail.com", "1234532" },
    };
  }
}
