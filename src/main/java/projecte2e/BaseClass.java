package projecte2e;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;

public class BaseClass 
{
	protected FirefoxDriver driver;
	protected static Properties prop;
	protected static FileInputStream fis;
	protected static Actions ac;
	
	public static void loadProp() throws IOException
	{
		prop = new Properties();
		fis = new FileInputStream("/home/samiksha/eclipse-workspace/projecte2e/src/main/java/projecte2e/config.properties");
		prop.load(fis);
	}
	
	public static void takeSnap(WebDriver driver)
	{
		prop.getProperty("path");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.
	}
	
	public static void act(WebDriver driver)
	{
		ac = new Actions(driver); 	
	}
	@BeforeClass
	public void setUp() throws IOException
	{
		loadProp();
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		driver = new FirefoxDriver();
		Reporter.log("Starting firefox");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Reporter.log("Launchin cricbuzz website");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("set timeout");
	}
	
	@AfterClass
	public void tearDown()
	{
		Reporter.log("Closing firefox");
		driver.close();
	}
	
	public WebDriver getDriver() 
	{
		return driver;
	}
}
