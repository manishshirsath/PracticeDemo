package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityLayer.UtilsClass;


import BaseLayer.BaseClass;

public class RegisterPage extends BaseClass
{
	@FindBy(xpath="//input[@id='name']")
	private WebElement fullName;
	
	@FindBy(xpath="//select[@id='dd']")
	private WebElement date;
	
	@FindBy(xpath="//select[@id='mm']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='yy']")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='gender']")
	private List<WebElement> gender;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='profilepin']")
	private WebElement pin;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerPageFunctionality(String FullName, String Date, String Month, String Year,
			String Gender, String MobileNumber, String Email, String Pin)
	{
		UtilsClass.sendKeys(fullName, FullName);
		UtilsClass.dropDownHandle(date, Date);
		UtilsClass.dropDownHandle(month, Month);
		UtilsClass.dropDownHandle(year, Year);
		UtilsClass.selectGender(gender, Gender);
		UtilsClass.sendKeys(mobileNumber, MobileNumber);
		UtilsClass.sendKeys(email, Email);
		UtilsClass.sendKeys(pin, Pin);
	}
}
