package test;


import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.CollaborateLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;

public class CollaborateTest {
	DriverConfiguration D=new DriverConfiguration();
	CollaborateLib C;
	
	@BeforeClass
	public void Beforeclass(){
		D.openbrowser("chrome");
		C=new CollaborateLib();
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(Method method){
		D.driver.get("http://demo.virtualuniversity.io");
		Reports.logger=Reports.report.startTest(method.getName());
	}
	@org.testng.annotations.Test
	public void Test() throws Exception{
		C.userid("Harshith");
		C.Password("Harshithts1");
		C.Sub();
		C.Java();
		Thread.sleep(2000);
		C.Collaboratetab();
		C.Postannouncement();
		C.Announcementmatter("Tomorrow is holiday");
		C.AddFile();
		C.Choosefile("D:\\holiday\\hhh.jpg");
		Thread.sleep(2000);
		C.SubmitAnnouncement();
		
	}
@AfterClass
public void Afterclass(){
	Reports.logger.log(LogStatus.INFO, "endTest");
	Reports.report.endTest(Reports.logger);
	Reports.report.flush();
	DriverConfiguration.driver.get(Reports.ReportLocation);
}
}