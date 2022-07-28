package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import elementrepository.Batches;

public class BatchesLib {
	
	Batches B = PageFactory.initElements(DriverConfiguration.driver, Batches.class);
	////
	public void  Userid(String Userid){
		B.getUserid().sendKeys(Userid);
	}
	public void Password(String password){
		B.getPassword().sendKeys(password);
	}

}
