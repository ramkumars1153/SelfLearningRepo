package Coca.Loco;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ReportTestcase {
	
	static ExtentReports reports;
	static ExtentTest Test_Report;
	
	@Test
	public void f() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor)driver;

		reports = ReportGeneration.StartReport("OpenGoogle");
		Test_Report =reports.createTest("Opening Google");
		ReportGeneration.PassTest(driver, Test_Report, "This testcase has passed");
		
		PageFactory.initElements(driver, PageObject.class);
		PageObject.LoginField.sendKeys("ramkumars1153@gmail.com");
		PageObject.PasswordField.sendKeys("Police@100");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Test_Report =reports.createTest("Closing Google");
		ReportGeneration.PassScreenshot(driver, Test_Report, "Screenshot Attached Together");
		
		executor.executeScript("arguments[0].click();", PageObject.LoginBttn);
		Test_Report =reports.createTest("Sleeping Google");
		Test_Report.pass("Sleeping Google", MediaEntityBuilder.createScreenCaptureFromPath(ReportGeneration.capturescreen(driver)).build());
		
		reports.flush();
	}
}
