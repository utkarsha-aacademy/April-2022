package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		// CSS selector with ID
		
//		WebElement UserEmail = driver.findElement(By.cssSelector("input#email"));
	
		// CSS Selector with combinations of id and other attribute
		WebElement UserEmail = driver.findElement(By.cssSelector("input#email[class='inputtext _55r1 _6luy']"));
		UserEmail.sendKeys("utkarshaa.academy@gmail.com");
		
		// CSS Selector with class
		WebElement password = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		password.sendKeys("12345677654");
		
		// CSS Selector with other attribute
		
		//WebElement loginBtn = driver.findElement(By.cssSelector("button[name='login']"));
		
		// CSS Selector with parent child relationship
		//WebElement loginBtn = driver.findElement(By.cssSelector("div>button"));
		// CSS Selector with substring (Char At)
	//	WebElement loginBtn = driver.findElement(By.cssSelector("button[class^='_42ft']"));
		// CSS Selector with substring (dollar)
	//	WebElement loginBtn = driver.findElement(By.cssSelector("button[class$='_51sy']"));
		// CSS Selector with substring (star)
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class*='_42ft']"));
		
		loginBtn.click();
		
	}

}
