package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionDemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		act.doubleClick(doubleClickBtn).perform();
		
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		act.contextClick(RightClickBtn).perform();
		
		WebElement Buttons = driver.findElement(By.xpath("//span[text()='Buttons']"));
		
		act.moveToElement(Buttons).perform();
		
		WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		act.click(DynamicClickBtn).perform();
		
		WebElement BookStore = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		act.moveToElement(BookStore).perform();
		
		act.moveToElement(Buttons).perform();
		
		Thread.sleep(2000);
		
		driver.get("https://www.naukri.com/");
		WebElement Jobs = driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(Jobs).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		act.moveToElement(interactions).perform();
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(source, target).perform();

	}

}
