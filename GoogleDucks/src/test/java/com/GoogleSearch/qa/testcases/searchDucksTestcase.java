package com.GoogleSearch.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GoogleSearch.pages.searchDucks;
import com.GoogleSearch.qa.base.testBase;

public class searchDucksTestcase  extends testBase{
	searchDucks searchducks;
	
	public searchDucksTestcase() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		intialization();
		searchducks= new searchDucks();
	}
	
	@Test(priority=1)
	public void validatePageTitleTest()
	{
		String title= searchducks.validatePageTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void searchDucksTest() {
		System.out.println("****");
		searchducks.searchDuck();
		String title1 = driver.getTitle();
		Assert.assertEquals(title1, "Baby Ducks - Google Search");
		
		    }
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
    	
    
}
