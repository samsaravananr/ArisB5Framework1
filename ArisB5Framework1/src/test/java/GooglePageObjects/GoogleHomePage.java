package GooglePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage 
{
	
	public WebDriver myD;

	public GoogleHomePage(WebDriver myD) 
	{
	    super();
		this.myD = myD;
	}
	
	
	By SearchText=By.name("q");
	By SearchButton=By.name("btnK");
	
	
	public WebElement FSearchText()
	{
		return myD.findElement(SearchText);
	}
	
	public WebElement FSearchButton()
	{
		return myD.findElement(SearchButton);
	}


}
