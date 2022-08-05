package selenium_April_22;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WindowHandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/selenium_April_22/Binary/msedgedriver.exe");
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(option);
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		WebElement companies = driver.findElement(By.xpath("//div[text()='Companies']"));
		WebElement Services = driver.findElement(By.xpath("//div[text()='Services']"));
		
		jobs.click();
		companies.click();
		Services.click();
		
		Set<String> Childwindows =	driver.getWindowHandles();
		
		Iterator<String> itr = Childwindows.iterator();
		
		while(itr.hasNext()) {
			String Child_window = itr.next();
			if(!MainWindow.equalsIgnoreCase(Child_window)) {
				driver.switchTo().window(Child_window);
				System.out.println(driver.getTitle());
			//	WebElement Skills = driver.findElement(By.xpath("//div[@id='skill']//input[@name='qp']"));
			//	WebElement location = driver.findElement(By.xpath("//div[@id='location']//input[@name='ql']"));
			//	WebElement SearchBtn = driver.findElement(By.xpath("//button[@id='qsbFormBtn']"));
			//	Skills.sendKeys("selenium");
			//	location.sendKeys("Pune");
			//	SearchBtn.click();
			}
		}
		driver.switchTo().window(MainWindow);
	//	driver.close();
		driver.quit();
	}

}
