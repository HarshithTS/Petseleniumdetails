package test;

import java.lang.reflect.Method;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.GseasAttendanceLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;

public class GseasAttendanceTest {
	DriverConfiguration B = new DriverConfiguration();
	GseasAttendanceLib H ;
	
	@BeforeClass
	public void Beforeclass(){
		B.openbrowser("chrome");
		H= new GseasAttendanceLib();
	}
	
	@BeforeMethod
	public void Beforemethod(Method method){
		B.driver.get("https://gseas.com/#/home/home_page");
		Reports.logger=Reports.report.startTest(method.getName()); 
	}
	
	@org.testng.annotations.Test
	public void Test() throws Exception {
		Thread.sleep(3000);
	    H.userid("Admin@abc");
		H.password("password");
		H.Login();
		H.TakeAttendance();
		H.TakeAttendance();
		H.Attdate();
		H.Seldate();
		H.choosecoursetab();
		H.selcourse();
		H.chooseBatchTab();
		H.selbatch();
		H.choosesession();
		H.createnew();
		H.starttime("4PM");
		H.endtime("7PM");
		H.nav();
		H.pri();
		H.Sub();     
		
		Alert alert=B.driver.switchTo().alert();
			 alert.dismiss();
	}
	@AfterClass
	    public void OpenReport(){
		Reports.logger.log(LogStatus.INFO,"Test END");
		Reports.report.endTest(Reports.logger);
		Reports.report.flush();//flush method commits the report and logger object things to the file
		DriverConfiguration.driver.get(Reports.ReportLocation);
	}

}
