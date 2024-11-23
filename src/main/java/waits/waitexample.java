package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class waitexample {
		WebDriver driver;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void check() {
		driver.get("https://www.rediff.com/");
		//WebDriverWait wait = new WebDriverWait( driver , Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"topdiv_0\"]/h2[1]/a")));
		
		//Wait fwait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		//Declare and initialise a fluent wait
		FluentWait fwait = new FluentWait(driver);
		//Specify the timout of the wait
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"topdiv_0\"]/h2[1]/a")));
		fwait.withTimeout( Duration.ofSeconds(30));
		//Sepcify polling time
		fwait.pollingEvery(Duration.ofSeconds(3));
		//Specify what exceptions to ignore
		fwait.ignoring(NoSuchElementException.class);

		//This is how we specify the condition to wait on.
		//This is what we will explore more in this chapter
		//wait.until(ExpectedConditions.alertIsPresent());
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
}
