package com.GoogleSearch.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleSearch.qa.base.testBase;

public class searchDucks extends testBase{
	@FindBy(name="q")
	WebElement searchbox;
	
	//intializing the webobjects
	public searchDucks() {
		PageFactory.initElements(driver, this);
	}
	//Action
    public String validatePageTitle() {
    	return driver.getTitle();
    }
    public void searchDuck()
    {
    	System.out.println("***********"+searchbox.getTagName());
    	System.out.println("***********"+searchbox.getText());
    searchbox.sendKeys("Baby Ducks");
    searchbox.sendKeys(Keys.ENTER);
    
    
    }
    
    
}
