package PackageName.Projectname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	//1
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement accountAnlist; 
	
	
	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signinbutton;
	
	//2
	
	
	public void accountAnlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAnlist).perform();
		
	}
	
	public void signin()
	{
			
		signinbutton.click();
	}
	
	
	//3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
