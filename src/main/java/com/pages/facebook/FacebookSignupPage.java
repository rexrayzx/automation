package com.pages.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.facebook.AutoConstant;
import com.generics.facebook.ExcelLibrary;
import com.generics.facebook.BasePage;

public class FacebookSignupPage extends BasePage implements AutoConstant{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextbox;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextbox;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement emailIdTextbox;
	
	@FindBy(xpath="//input[@id='u_2_j']")
	private WebElement reEnterEmailTextbox;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement newPasswordTextbox;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement dayDropdown;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement monthDropdown;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement yearDropdown;
	
	@FindBy(xpath="//input[@id='u_2_2']")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@id='u_2_3']")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signupButton;
	
	public FacebookSignupPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void SignupMethod() throws IOException {
		firstNameTextbox.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 0));
		lastNameTextbox.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 1));
		emailIdTextbox.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 2));
		reEnterEmailTextbox.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 2));
		newPasswordTextbox.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 3));
		selectbyvisibletext(dayDropdown, "21");
		selectbyvalue(monthDropdown, "7");
		selectbyvisibletext(yearDropdown, "1994");
		maleRadioButton.click();
		signupButton.click();
	}
}
