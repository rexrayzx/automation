package com.pages.facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.facebook.AutoConstant;
import com.generics.facebook.ExcelLibrary;

public class FacebookLoginPage implements AutoConstant{
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailIdTextfield;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgotten password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath="//a[.='Create New Account']")
	private WebElement createNewAccountButton;
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException {
		emailIdTextfield.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 2));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_Path, sheet_Name, 1, 3));
		loginButton.click();
	}
	public void forgotPasswordMethod() {
		forgotPasswordLink.click();
	}
	public void createNewAccountMethod() {
		createNewAccountButton.click();
	}
}
