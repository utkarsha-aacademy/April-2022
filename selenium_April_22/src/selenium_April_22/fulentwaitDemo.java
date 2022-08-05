package selenium_April_22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.netty.handler.timeout.TimeoutException;

public class fulentwaitDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "/selenium_April_22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		
		WebElement colorchangeBtn = driver.findElement(By.xpath("//button[@id='colorChange']"));

		WebElement EnableAfterBtn = driver.findElement(By.xpath("//button[@id='enableAfter']"));
		
		System.out.println("Before button get enabled"+EnableAfterBtn.isEnabled());
		System.out.println("Before Visible After Button shown"+colorchangeBtn.getCssValue("color"));
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(TimeoutException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
		System.out.println("After button get enabled"+EnableAfterBtn.isEnabled());
		System.out.println("After Visible After Button shown"+colorchangeBtn.getCssValue("color"));
		
	}

}
