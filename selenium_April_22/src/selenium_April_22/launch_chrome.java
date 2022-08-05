package selenium_April_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class launch_chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium_April_22\\Binary\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
	}

}
