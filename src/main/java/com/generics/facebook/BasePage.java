package com.generics.facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public WebDriver driver;
	public void selectbyvisibletext(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectbyvalue(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByValue(text);
	}
	public void selectbyindex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void movetoelement(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void robotEnter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void javescripclick(WebDriver driver, WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void fetchtitle() {
		System.out.println(driver.getTitle());
	}
	public void alertaccept() {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
}
