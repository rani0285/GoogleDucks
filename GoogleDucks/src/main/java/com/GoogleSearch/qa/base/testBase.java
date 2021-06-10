package com.GoogleSearch.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
	public static WebDriver driver;
	public static Properties prop;
	public testBase() {
		try{
			prop = new Properties();
			FileInputStream  ip = new FileInputStream("C:\\Users\\nares\\eclipse-workspace2\\GoogleDucks\\src\\main\\java\\com\\GoogleSearch\\qa\\config\\config.properties");
			//config path we gave in file input stream
			prop.load(ip);
			
			
		}catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void intialization() throws InterruptedException
	{
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	       driver =new ChromeDriver();
	        //below step get() to go to website
		}/*else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\nares\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}*/
		
		Thread.sleep(1000);
		driver.get(prop.getProperty("url"));
		
	}
	}



