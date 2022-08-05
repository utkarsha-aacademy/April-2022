package selenium_April_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class synchDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//	Syntax of Implicit wait 
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]"));
		CreateNewAcc.click();
		
		// Static Wait
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @name='firstname']"))).sendKeys("Ravi");
//		WebElement FirstName = driver.findElement(By.xpath("//input[@type='text' and @name='firstname']"));
//		FirstName.sendKeys("Ravi");
		
		WebElement SurName = driver.findElement(By.xpath("//input[@name='lastname']"));
		SurName.sendKeys("Nangare");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Welcome to Facebook Sign UP page')");
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

}
