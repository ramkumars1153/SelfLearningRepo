package Coca.Loco;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportGeneration {
	static ExtentReports reports;
	static ExtentHtmlReporter reporter;
	
  public static ExtentReports StartReport(String Scenario) {
	  
	  String Path = "C:\\Eclipse\\"+Scenario+".html";
	  File file = new File(Path);
	  reporter = new ExtentHtmlReporter(file);
	  reports = new ExtentReports();
	  reports.attachReporter(reporter);
	  return reports;
  }
  
  public static void PassTest(WebDriver driver, ExtentTest Test_Report,String Comment) throws IOException {
	  Test_Report.log(Status.PASS, Comment);
	  Test_Report.addScreenCaptureFromPath(capturescreen(driver));
  }
  
  public static void FailTest(WebDriver driver, ExtentTest Test_Report,String Comment) throws IOException {
	  Test_Report.log(Status.FAIL, Comment);
	  Test_Report.addScreenCaptureFromPath(capturescreen(driver));
  }
  
  public static void PassScreenshot(WebDriver driver, ExtentTest Test_Report, String Comment) throws IOException {
	  Test_Report.pass(Comment, MediaEntityBuilder.createScreenCaptureFromPath(capturescreen(driver)).build());
  }
  
  public static String capturescreen(WebDriver driver) throws IOException {
	  TakesScreenshot take = (TakesScreenshot)driver;
	  File src=take.getScreenshotAs(OutputType.FILE);
	  String Path ="C:\\Eclipse\\"+System.currentTimeMillis()+".png";
	  File dest = new File(Path);
	  FileUtils.copyFile(src, dest);
	  return Path;
  }
}
