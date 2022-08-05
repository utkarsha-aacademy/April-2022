package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class frameDemo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "/selenium_April_22/Binary/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
//		String MainWindow = driver.getWindowHandle();
		
		driver.switchTo().frame("frame1");
		
		WebElement SampleHeading = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(SampleHeading.getText());
		
	//	driver.switchTo().window(MainWindow);
		
		driver.switchTo().parentFrame();
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		
		WebElement SampleHeading1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(SampleHeading1.getText());
		
		driver.switchTo().parentFrame();
		WebElement pageText = driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
		System.out.println(pageText.getText());
	}

}
