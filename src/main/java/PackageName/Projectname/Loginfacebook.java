package PackageName.Projectname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginfacebook 
{
//1st
	WebDriver driver;
	@FindBy(name="email") WebElement FuserName;
	
	@FindBy(name="pass") WebElement Fpass;
	
	@FindBy(name="login") WebElement Floginbtn;
	
//	@FindBy(xpath = "//span[@class='xhb22t3 xb5gni xcj1dhv x6s0dn4 x78zum5 xuxw1ft x47corl x1ye3gou']")
//	public WebElement FindFrnd;

//2nd 

public void UserName()
{
	FuserName.sendKeys("yogisantosh1989@gmail.com");
}

public void Pass()
{
	Fpass.sendKeys("Santosh@#");
}

public void LoginF()
{
	Floginbtn.click();
}

//public void FindFrd()
//{
//	FindFrnd.sendKeys("Ajay Devgun");
//}
//3rd
public Loginfacebook(WebDriver driver)
{
	PageFactory.initElements(driver, this);	
}

}