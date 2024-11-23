package screenshotfailedtc;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotUtility extends Base implements ITestListener {
	
	//WebDriver driver;
	
	//public ScreenshotUtility (WebDriver driver) {
		//this.driver = driver;
		
	//}
 // This method will execute before starting of Test suite.
 public void onStart(ITestContext tr) {

 }

 // This method will execute, Once the Test suite is finished.
 public void onFinish(ITestContext tr) {

 }

 // This method will execute only when the test is pass.
 public void onTestSuccess(ITestResult tr) {
	 try {
  captureScreenShot(tr, "pass");
 }catch(IOException ex) {
	 
 }
 }

 // This method will execute only on the event of fail test.
 public void onTestFailure(ITestResult tr)  {
	 try {
  captureScreenShot(tr, "fail");
	 }catch(IOException ex) {
		 
	 }
 }

 // This method will execute before the main test start (@Test)
 public void onTestStart(ITestResult tr) {

 }

 // This method will execute only if any of the main test(@Test) get skipped
 public void onTestSkipped(ITestResult tr) {
 }

 public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
 }

 // Function to capture screenshot.
 public void captureScreenShot(ITestResult result, String status) throws IOException {
  // AndroidDriver driver=ScreenshotOnPassFail.getDriver();
	 System.out.println("Capturing Screenshot");
	 System.out.println(status);
  String destDir = "";
  String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
  // To capture screenshot.
  //File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  //FileUtils.copyFile(scrFile, new File("d://Screen.png"));
 /* DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
  // If status = fail then set folder name "screenshots/Failures"
  if (status.equalsIgnoreCase("fail")) {
   destDir = "screenshots/Failures";
  }
  // If status = pass then set folder name "screenshots/Success"
  else if (status.equalsIgnoreCase("pass")) {
   destDir = "screenshots/Success";
  }

  // To create folder to store screenshots
  new File(destDir).mkdirs();
  // Set file name with combination of test class name + date time.
  String destFile = passfailMethod + " - " + dateFormat.format(new Date()) + ".png";

  try {
   // Store file at destination folder location
	  FileHandler.copy(scrFile, new File(destDir + "/" + destFile));
  } catch (IOException e) {
   e.printStackTrace();
  }*/
  System.out.println("Capturing....");
  
  try{
		// To create reference of TakesScreenshot
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		// Call method to capture screenshot
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		// Copy files to specific location 
		// result.getName() will return name of test case so that screenshot name will be same as test case name
		FileUtils.copyFile(src, new File("D:\\"+"Helloxx"+ ".png"));
		System.out.println("Successfully captured a screenshot");
	}catch (Exception e){
		System.out.println("Exception while taking screenshot "+e.getMessage());
	}
}
}