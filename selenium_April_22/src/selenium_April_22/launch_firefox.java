package selenium_April_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium_April_22\\Binary\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		// Locator - id
		
	//	WebElement useremail =  driver.findElement(By.id("email"));
	//	WebElement password = driver.findElement(By.id("pass"));
		
		WebElement useremail =  driver.findElement(By.className("inputtext"));
		WebElement password = driver.findElement(By.id("pass"));
		
		// Locator tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		if(links.size() !=0) {
			for(WebElement linkname : links ) {
				System.out.println(linkname.getText());
			}
		}
		// Locator - name
		
	//	WebElement loginBtn = driver.findElement(By.tagName("button"));
		
		useremail.sendKeys("utkarshaa_academy@gmail.com");
		password.sendKeys("123456543");
	//	loginBtn.click();
		
		// Locator LinkText
		
	//	WebElement FBPay = driver.findElement(By.linkText("Facebook Pay"));
	//	FBPay.click();
		
		// Partial link Text
		WebElement VIC = driver.findElement(By.partialLinkText("Voting Infor"));
		VIC.click();
		
		Thread.sleep(5000);
		
		driver.get("https://kite.zerodha.com/");
		
		WebElement userid = driver.findElement(By.id("userid"));
		WebElement password1 = driver.findElement(By.id("password"));
		
		// Locator - classname
		WebElement Login = driver.findElement(By.className("button-orange"));
		
		userid.sendKeys("XA0634");
		password1.sendKeys("12345676");
		Login.click();
		
	}

}
