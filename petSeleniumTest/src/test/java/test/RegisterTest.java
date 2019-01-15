package test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import actionlibrary.RegisterLib;

import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVesionThree;

public class RegisterTest {
	DriverConfiguration B =new DriverConfiguration();
	RegisterLib H;
	

	@BeforeClass
	public void BeforeTest()
	{
		//driver.get("http://demo.automationtesting.in/Register.html");
		
		B.openbrowser("chrome");
		H =new RegisterLib();
	}
	@BeforeMethod
	public void BeforeMethod(Method m){
		ArrayList tab = new ArrayList(B.driver.getWindowHandles());
		B.driver.switchTo().window((String) tab.get(1));
		B.driver.close();
		B.driver.switchTo().window((String) tab.get(0));
		B.driver.get("http://demo.automationtesting.in/Register.html");
		ReportVesionThree.logger = ReportVesionThree.report.createTest(m.getName());
	}
    @org.testng.annotations.Test
    public void Test() throws Exception
    {
    	H.enterfirstname("Harshhh!");
    	H.enterLastname("T S");
    	H.Address("BTM");
    	H.Email("xyzharsss@gmail.com");
    	H.Phone("9980910634");
    	H.Sex();
    	H.Hobbies();
    	H.languagetab();
    	H.Languages();
    	H.Elanguagetab();
    	Thread.sleep(5000);
    	H.Skills();
    	H.Skillss();
    	H.Countrytab();
    	H.Country();
    	H.SelCountrytab();
    	H.Selcountry();
    	H.Yeartab();
    	H.Year();
    	H.Monthtab();
    	H.Month();
    	H.Daytab();
    	H.Day();
    	H.Password("Harshithts1");
    	H.ConfirmPassword("Harshithts1");
        H.Submit();
    }
    
    @AfterClass
    public void OpenTestReport(){
    	ReportVesionThree.logger.info("Test END");
    	ReportVesionThree.report.flush();//flush method commits the report and logger object things to the file
    	DriverConfiguration.driver.get(ReportVesionThree.ReportLocation);
    	
   
    	
    }

  }

