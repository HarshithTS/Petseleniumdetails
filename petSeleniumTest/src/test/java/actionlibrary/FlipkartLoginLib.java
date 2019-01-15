package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVesionThree;

import elementrepository.FlipkartLogin;

public class FlipkartLoginLib {
FlipkartLogin  L =PageFactory.initElements(DriverConfiguration.driver, FlipkartLogin.class);

public void Mobno(String Mobno){
	try{
	L.getMobno().sendKeys(Mobno);
	ReportVesionThree.PassCase("printing mobile number", "Mobile number");
}
	catch(Exception e){
		System.out.println("error occured"); 
	}
}

public void Password(String Password){
	try{
	L.getPassword().sendKeys(Password);
	ReportVesionThree.PassCase("printing password", "password");
}
	catch(Exception e){
		System.out.println("error occured");
	}
}

public void Login(){
	try{
 	L.getLogin().click();
	ReportVesionThree.PassCase("clicking on login","login");
}
	catch(Exception e){
		System.out.println("error occured");
	}
}
	
}
