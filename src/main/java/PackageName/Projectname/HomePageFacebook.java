package PackageName.Projectname;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFacebook 
{
	
	
	
	//1st
		
		@FindBy(xpath="//input[@placeholder='Search Facebook']") WebElement ClickFindfrnd;
		
		@FindBy(xpath = "//input[@placeholder='Search Facebook']")
		public WebElement FindFrnd;

	//2nd 

	
	public void LoginF()
	{
		ClickFindfrnd.click();
	}

	public void FindFrd()
	{
		FindFrnd.sendKeys("Ajay Devgun");
	}
	//3rd
	public HomePageFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}

	}
	