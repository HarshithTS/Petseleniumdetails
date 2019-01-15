package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;
import elementrepository.GseasAssessment;


public class GseasAssessmentLib {
GseasAssessment G = PageFactory.initElements(DriverConfiguration.driver,GseasAssessment.class);


 public void userid(String Userid){
	 try{
	 G.getUserid().sendKeys(Userid);
	 Reports.PassCase("Entering userid", "UserId");
       }
	 catch(Exception e){
		 System.out.println("error");
	 }
 }
 
	 public void Password(String Password){
		 try{
		 G.getPassword().sendKeys(Password);
		 Reports.PassCase("Entering password", "password");
	 }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	 public void Login(){
		 try{
		 G.getLogin().click();
		 Reports.PassCase("Logging in", "Login");
	 }
	 catch(Exception e){
		 System.out.println("error");
	 }
	 }
	 public void Selectingcourse(){
		 try{
		 G.getSelectingcourse().click();
		 Reports.PassCase("selecting course","Select course");
	 }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	 public void Assess(){
		 try{
		 G.getAssess().click();
		 Reports.PassCase("Clicking on assess tab", "Assess");
	 }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	 public void NewEvaluation(){
		 try{
		 G.getNewevaluation().click();
		 Reports.PassCase("Clicking on new evaluation","New evaluation");
	 }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	 public void Nameofthetest(String Testname){
		 try{
		 G.getNameofthetest().sendKeys(Testname);
		 Reports.PassCase("Entering test name","Test Name");
	 }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
		 
	 public void Hasnegativemarking(){
		 try{
		 G.getHasnegativemarking().click();
		 Reports.PassCase("Enable the negativemark","Negative mark");
	 }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	public void Timed(){
		try{
		G.getTimed().click();
		Reports.PassCase("Enabling time", "Timed");
	}
		catch(Exception e){
			System.out.println("error");
		}
		}
	public void Time(String string){
		try{
		G.getTime().sendKeys(string);
		Reports.PassCase("Setting time","Time");
	}
		catch(Exception e){
			System.out.println("error");
		}
	}
	public void Publish(){
		try{
		G.getPublish().click();
		Reports.PassCase("Publishing Test","Test");
	}
		catch(Exception e){
			System.out.println("error");
		}
	}
	public void Submittestname(){
		try{
		G.getSubmittestname().click();
		Reports.PassCase("submitting test","Submit test");
 }
	catch(Exception e){
		System.out.println("error");
	}
}
	public void Managequestions(){
		try{
		G.getManagequestions().click();
		Reports.PassCase("Clicking on manage questions","Manage questions");
	}
		catch(Exception e){
			System.out.println("error");
		}
	}
		public void  uploadquestions(){
			try{
			G.getUploadquestions().click();
			Reports.PassCase("Clicking on upload question tab","Uploadquestions");
		}
			catch(Exception e){
				System.out.println("error");
			}
}
		public void choosefile(String string){
			try{
			G.getChoosefile().sendKeys(string);
			Reports.PassCase("selecting exceel sheet","uploading excel sheet");
		}
			catch(Exception e){
				System.out.println("error");
			}
}
		public void Upload(){
			try{
			G.getUpload().click();
			Reports.PassCase("Uploading file","UPLOAD");
		}
			catch(Exception e){
				System.out.println("error");
			}
}
}

