
 package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.GseasSignInLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVesionThree;
import commonlibrary.Reports;

public class GseasSignInTest {
	DriverConfiguration B = new DriverConfiguration();
	GseasSignInLib H;
  @BeforeClass
	public void Befo(){
		B.openbrowser("chrome");
		H= new GseasSignInLib();
	}
	@BeforeMethod
	public void BeforeMethod(Method method){
		B.driver.get("https://www.gseas.com/#/landing");	
		Reports.logger=Reports.report.startTest(method.getName()); 
	}
	@org.testng.annotations.Test
	public void Test() throws Exception{
		 H.userid("Harshith11@abc");
		 H.password("12345678");
		 Thread.sleep(2000);
		 H.Login();	
}
@AfterClass
public void OpenTestReport(){
	Reports.logger.log(LogStatus.INFO,"Test END");
	Reports.report.endTest(Reports.logger);
	Reports.report.flush();//flush method commits the report and logger object things to the file
	DriverConfiguration.driver.get(Reports.ReportLocation);

}
}