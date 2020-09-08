package projecte2e;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

//@Listeners(Listen.class)
	public class Tests extends BaseClass{
	LandingPage l = new LandingPage();
	
	@Test(priority=0)
	public void print()
	{
		System.out.println("hello.  I am a new TC");
	}
		
	@Test(enabled=true)
	public void testTitle()
	{
		String actualTitle = driver.getTitle();
		String titleContains = "PHPTRAVELS";
		System.out.println(actualTitle);
		if(actualTitle.contains(titleContains))
		{
			Assert.assertTrue(true);
		}
	}
		
	@Test
	public void checkHotelSelected()
	{
		WebElement hotel = l.getHotel(driver);
		String className = hotel.getAttribute("class");
		 Assert.assertTrue( className.contains("active"));
	}
	
	@Test
	public void searchHotelLocation()
	{
		WebElement h = l.getSearch(driver);
		h.click();
		h.sendKeys("dubai");
		act(driver);
		ac.keyDown(h,"ENTER");
		ac.keyUp(h,"ENTER");
		
	}
}
