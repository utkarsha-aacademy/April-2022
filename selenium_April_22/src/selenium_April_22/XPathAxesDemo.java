package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
		Dimension d = new Dimension(400, 330);
		driver.manage().window().setSize(d);
		WebElement CustomerService = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Customer Service']"));
		CustomerService.click();
		driver.close();
	}

}
