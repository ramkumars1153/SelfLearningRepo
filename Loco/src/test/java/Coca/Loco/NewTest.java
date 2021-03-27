package Coca.Loco;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() 
  {
	  
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--start-maximized");
	  WebDriver driver = new ChromeDriver(options);
	  driver.get("https://www.flipkart.com/");

	  System.out.println("Flipkart is open by the user for testing the app make your app building dream come true this is not correct man");

	  
  }
}
