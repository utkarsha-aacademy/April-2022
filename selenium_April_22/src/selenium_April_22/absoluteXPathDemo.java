package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoluteXPathDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		
		// Absolute XPath
	//	WebElement userid = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/input"));
	//	WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/input"));
	//	WebElement LoginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[4]/button"));
		
		// Relative XPath
		WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		
		
		userid.sendKeys("XA0634");
		password.sendKeys("1234567");
		LoginBtn.click();
		
		
		driver.get("https://www.facebook.com");
		// Relative XPath with contains method
	//	WebElement UserName = driver.findElement(By.xpath("//input[contains(@id,'e')]")); 
		
		// Relative XPath with And Method
		WebElement UserName = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @name='email']")); 
		UserName.sendKeys("ravinangre@gmail.com");
		// Relative XPath with starts-with method
		WebElement Password = driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")); 
		Password.sendKeys("2345676543");
		// Relative XPath with OR Method
		//WebElement Login = driver.findElement(By.xpath("//button[@id='u_0_5_n3' or @name='login']"));
		
		// Relative XPath with text method
		WebElement Login = driver.findElement(By.xpath("//button[text()='Log In']"));
		Login.click();
		Thread.sleep(5000);
		// Relative XPath with contains text method
		WebElement ForgorPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
		ForgorPassword.click();
	}
	

}
