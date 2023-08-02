package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistePageStep extends BaseClass
{
	
	@Given("user on Register Page")
	public void user_on_register_page() 
	{
	    BaseClass.initialization();
	}
	@When("user enter {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and_and_and_and(String FullName, String Date, 
			String Month, String Year, String Gender, String MobileNo, String Email, String Pin)
	{
	   RegisterPage reg = new RegisterPage();
	   reg.registerPageFunctionality(FullName, Date, Month, Year, Gender, MobileNo, Email, Pin);
	}
	
	@After
	public static void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			byte f []=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
			
		}
		else 
		{
			byte f []=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 scenario.attach(f, "image/png", scenario.getName());
			
		}
	}
}
