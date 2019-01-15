package test;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.UploadingContentsLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;

public class UploadingContentsTest {
	
DriverConfiguration D= new DriverConfiguration();
UploadingContentsLib U;

@org.testng.annotations.BeforeClass
public void BeforeClass(){
	D.openbrowser("chrome");
	U =new UploadingContentsLib();	
}
@org.testng.annotations.BeforeMethod
public void BeforeMethod(Method method){
	D.driver.get("http://demo.virtualuniversity.io");
	Reports.logger=Reports.report.startTest(method.getName());
}

@org.testng.annotations.Test
public void Test() throws Exception{
	U.userid("Harshith");
	U.Password("Harshithts1");
	U.Login();
	U.Course();
	Thread.sleep(3000);
    U.ManageCurriculum();
    U.AddModule();
    U.ModuleName("Demo Content module");
    U.Submitmodule();
    U.Addtopic();
    U.Topicname("DemoTopic");
    U.SubmitTopic();
}
	@AfterClass
	public void Report(){
		Reports.logger.log(LogStatus.INFO,"endTest");
		Reports.report.endTest(Reports.logger);
		Reports.report.flush();
		DriverConfiguration.driver.get(Reports.ReportLocation);
	}
	
}
