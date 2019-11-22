package reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class DemoReports 
{
		
	@Test(invocationCount = 3)
	public void TestMultipleThreads ()
	   {
			WebDriver driver = new FirefoxDriver();		
			driver.get("http://www.google.com");
			System.out.println("Page Title is " + driver.getTitle());
			Assert.assertEquals("Google", driver.getTitle());
			driver.quit();

		}
	}


