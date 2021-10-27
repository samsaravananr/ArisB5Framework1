package GoogleTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Base 
{
	public WebDriver myD;
	public Properties prop;
	public FileInputStream fis;
	public String vBrowser;
	
	
	public WebDriver BrowserCall() throws IOException
	{
		prop=new Properties();
		fis=new FileInputStream("C:\\Users\\SARAVANAN R\\Mobile5\\ArisB5Framework1\\Data.properties");
		prop.load(fis);
		vBrowser=prop.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\chromedriver.exe");
			myD=new ChromeDriver();
		}
		
		else if(vBrowser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB5\\msedgedriver.exe");
			WebDriver myD=new EdgeDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser");
		}
		return myD;
		
		
		
	}
	
	

}
