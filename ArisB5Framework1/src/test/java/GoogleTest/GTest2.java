package GoogleTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class GTest2 extends Base 
{
	
	@Test
	public void TS002() throws IOException
	{
		myD=BrowserCall();
		myD.get(prop.getProperty("URL"));
		Assert.assertEquals(myD.getTitle(),prop.getProperty("ExpectedTitle"));
		
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.close();
	}

}
