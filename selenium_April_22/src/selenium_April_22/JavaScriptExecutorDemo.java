package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_April_22\\Binary\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.location='https://demoqa.com/text-box'");
	
		//	driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
		
		js.executeScript("arguments[0].value='Ravi Nangare'", username);
		
//		js.executeScript("document.getElementById('userName').value='Ravi Nangare'");
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
	//	SubmitBtn.click();
		js.executeScript("arguments[0].click()", SubmitBtn);
		
		js.executeScript("alert('Welcome to Java Script Executor Demo')");
		
		driver.switchTo().alert().accept();
		
		 String DomainName = js.executeScript("return document.domain;").toString();			
	     System.out.println("Domain name of the site = "+DomainName);
	     
	     String url = js.executeScript("return document.URL;").toString();			
	     System.out.println("URL of the site = "+url);
	     
	     String TitleName = js.executeScript("return document.title;").toString();			
	     System.out.println("Title of the page = "+TitleName);
	     
	    // js.executeScript("window.scrollBy(0,400)");
	    WebElement checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
	    js.executeScript("arguments[0].scrollIntoView(true)", checkbox);
	    
	    js.executeScript("location.reload()");
	    
	    String sText =  js.executeScript("return document.documentElement.innerText").toString();
	    System.out.println("Inner Text of web page" +sText);
	    
	    WebElement logo = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']"));
	    System.out.println(logo.isDisplayed());
		
	}

}
