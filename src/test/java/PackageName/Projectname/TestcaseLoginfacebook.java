package PackageName.Projectname;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestcaseLoginfacebook
{

	@Test
	public void validcredentials() throws InterruptedException 
	{
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(180));
		
		driver.navigate().refresh();
		Loginfacebook Loginf=new Loginfacebook(driver);
		Loginf.UserName();
		Loginf.Pass();
		Loginf.LoginF();
		wait.wait(6000);
		Object lock = new Object();

		lock.wait(); // Exception! Not synchronized on lock

		HomePageFacebook HomeF =new HomePageFacebook(driver);
		HomeF.FindFrd();
	}
	
	
	
	
	
}
