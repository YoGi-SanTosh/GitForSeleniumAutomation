package PackageName.Projectname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAmazon 
{
	WebDriver driver;
	//1
	@FindBy(name = "email")
	WebElement Username; 
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Continuebutton;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement Pass;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signinbutton;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchProduct;
	
	//2
	public void UName(WebDriver driver)
	{
		Username.sendKeys("yogisantosh1989@gmail.com");
	}
	
	public void Continuebtn()
	{
		Continuebutton.click();
	}
	
	public void PWD()
	{
		Pass.sendKeys("Santosh@123");
	}
	public void Signinbtn()
	{
		signinbutton.click();
	}	
	public void SearchProduct()
	{
		SearchProduct.sendKeys("Mac Book");
	}
	
	//3
	public LoginAmazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}

