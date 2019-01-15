/*package test;

import java.util.ArrayList;

import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;

import actionlibrary.FlipkartLoginLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVesionThree;

public class FlipkartLoginTest {
	
	DriverConfiguration K =new DriverConfiguration();
	FlipkartLoginLib Z;

	
	@BeforeClass
	public void BeforeTest(){
	K.openbrowser("chrome");
	Z = new FlipkartLoginLib();	
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		K.driver.get("https://www.flipkart.com/");
		ArrayList tab=new ArrayList(K.driver.getWindowHandles());
		K.driver.switchTo().window((String) tab.get(1));
		K.driver.close();
		K.driver.switchTo().window((String) tab.get(0));
	}
	
	@org.testng.annotations.Test
	public void Test() throws Exception{
		Z.Mobno("9535312084");
		Z.Password("444599");
		Thread.sleep(2000);
		Z.Login();
	}
	 @AfterClass
	    public void openTestReport(){
	    	ReportVesionThree.logger.info("Test END");
	    	ReportVesionThree.report.flush();//flush method commits the report and logger object things to the file
	    	DriverConfiguration.driver.get(ReportVesionThree.ReportLocation);
	    	
	    }
}


*/