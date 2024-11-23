package screenshotfailedtc;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class screenshotTest extends Base {
	


		// Create Webdriver reference
		 //WebDriver driver;
		
		@Test
		public void captureScreenMethod() {
			//System.setProperty("webdriver.gecko.driver","D://Selenium Environment//Drivers//geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.softwaretestingmaterial.com");
			driver.navigate().refresh();
			//driver.findElement(By.xpath("//*[@id='cse-search-box']/div/input[4]")).sendKeys("agile"); //Statement with correct Xpath
			//driver.findElement(By.xpath("//*[@id='cse']")).sendKeys("agile"); //Statement with incorrect Xpath	
			
			
			Assert.assertTrue(false);
			driver.close();
		}
}
