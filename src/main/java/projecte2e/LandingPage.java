package projecte2e;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BaseClass
{
		
	By hotel = By.xpath("//a[@data-name='hotels']");
	By search = By.xpath("//div[@class='select2-search']/input");
	
	public WebElement getHotel(WebDriver driver)
	{
		return (driver.findElement(hotel));
	}
	
	public WebElement getSearch(WebDriver driver)
	{
		return driver.findElement(search);
	}
	
}
