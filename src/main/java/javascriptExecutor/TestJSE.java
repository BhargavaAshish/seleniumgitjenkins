package javascriptExecutor;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestJSE {
	
	WebDriver driver;
	
	@Test
	public void setup() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.cssSelector("input[class='Automation']"));
		ele.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//String s = (String) js.executeScript("return document.title");
		
		Boolean b = (Boolean)js.executeScript("return document.querySelector('input.Automation').checked;"); 
		
		System.out.println(b);
		System.out.println("bye");
		driver.quit();
		//String return_value = (String) js.executeScript("return document.getElementById('some_id').innerHTML");
		
		/*JavascriptExecutor in Selenium to click a button
		
		js.executeScript(“document.getElementByID('element id').click();”);
		

		JavascriptExecutor in Selenium to send text
		
		js.executeScript(“document.getElementByID('element id').value = ‘xyz’;”);
		

		JavascriptExecutor in Selenium to interact with checkbox
		
		js.executeScript(“document.getElementByID('element id').checked=false;”);
		

		JavascriptExecutor in Selenium to refresh the browser window
		
		js.executeScript("location.reload()");
	
    	*/
		
	}

}