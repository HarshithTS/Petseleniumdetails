package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.GseasAssessmentLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;

public class GseasAssessmentTest {
	DriverConfiguration d = new DriverConfiguration();
	GseasAssessmentLib L;
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass(){
		d.openbrowser("chrome");
		L = new GseasAssessmentLib();	
	}
	@BeforeMethod
	public void BefoeMethod(Method method){
		d.driver.get("https://demo.virtualuniversity.io/");
		Reports.logger=Reports.report.startTest(method.getName());
		}
	
	@Test
	public void Test() throws Exception{
		Thread.sleep(5000);
		L.userid("Harshith");
		L.Password("Harshithts1");
		L.Login();
		L.Selectingcourse();
		L.Assess();
		L.NewEvaluation();
		L.Nameofthetest("J2EE");
		L.Hasnegativemarking();
		L.Timed();
		Thread.sleep(2000);
		L.Time("3600");
		L.Publish();
		L.Submittestname();
		L.Managequestions();
		L.uploadquestions();
		L.choosefile("C:\\Users\\OMC\\Desktop\\gseas\\upload_questions1.xlt");
		L.Upload();
	}

@AfterClass
public void openreport(){
	Reports.logger.log(LogStatus.INFO,"Test end");
	Reports.report.endTest(Reports.logger);
	Reports.report.flush();
	DriverConfiguration.driver.get(Reports.ReportLocation);	
}
}


