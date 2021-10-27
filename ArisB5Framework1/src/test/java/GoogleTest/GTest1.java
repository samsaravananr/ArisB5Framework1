package GoogleTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import GooglePageObjects.GoogleHomePage;
import GooglePageObjects.GoogleResultPage;

public class GTest1 extends Base
{
	
	@Test
	public void TS001() throws IOException, InterruptedException
	{
		myD=BrowserCall();
		myD.get(prop.getProperty("URL"));
		myD.manage().window().maximize();
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//ENTER Aris Global in Google Search
		//CLICK on Google Search button
		GoogleHomePage GHP=new GoogleHomePage(myD);
		GHP.FSearchText().sendKeys("Aris Global");
		Thread.sleep(3000);
		GHP.FSearchButton().click();
		
		//CAPTURE and PRINT - Result Stats Information
		GoogleResultPage GRP=new GoogleResultPage(myD);
		String vRes=GRP.FResult().getText();
		System.out.println(vRes);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.close();
	}
	
	

}
