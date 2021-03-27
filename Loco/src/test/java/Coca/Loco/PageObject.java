package Coca.Loco;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObject {
	
	@FindBy(how=How.XPATH,using="//div//input[@class='_2IX_2- VJZDxU']")
	public static WebElement LoginField;
	
	@FindBy(xpath="//div//input[@type='password']")
	public static WebElement PasswordField;
	
	@FindBy(xpath="//div//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	public static WebElement LoginBttn;
	
}
