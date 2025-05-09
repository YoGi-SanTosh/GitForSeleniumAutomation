package PackageName.Projectname;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCaseLoginAmazon 
{

	@Test
	public void withvalidcredentials() throws InterruptedException 
	{
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		HomePage home=new HomePage(driver);
		home.accountAnlist(driver);
		home.signin();
		
		LoginAmazon login=new LoginAmazon(driver);
		login.UName(driver);
		login.Continuebtn();
		login.PWD();
		login.Signinbtn();
		login.SearchProduct();
	}
	
}

