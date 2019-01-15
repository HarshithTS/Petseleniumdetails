package test;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.AmazonLib;
import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVersionThree;
import commonlibrary.ReportVesionThree;
import commonlibrary.Reports;

public class AmazonTest {
	DriverConfiguration A =new DriverConfiguration();
	AmazonLib H;
	
	@BeforeClass
	public void BeforeTest(){
  		A.openbrowser("chrome");
		H= new AmazonLib();
		
		//nareshbala4@gmail.com
		//Nareshgit#38
	}
	@BeforeMethod
	public void BeforeMethod(Method method){//java.lang.reflect.Method(class)
		A.driver.get("https://www.amazon.in/");
		//ReportVersionThree.logger=ReportVersionThree.report.startTest(method.getName()); 
	}
	@org.testng.annotations.Test
	public void Test(){
		H.signin();
		H.email("9535312084");
		H.conti();
		H.password("444599");
		H.submit();
	}
	 @AfterClass
	    public void openTestReport(){
	    	Reports.logger.log(LogStatus.INFO,"Test END");
	    	Reports.report.endTest(Reports.logger);
	    	Reports.report.flush();//flush method commits the report and logger object things to the file
	    	DriverConfiguration.driver.get(ReportVersionThree.ReportLocation);
	    	
	    }

}

