package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;
import elementrepository.Collaborate;


public class CollaborateLib {
	Collaborate C = PageFactory.initElements(DriverConfiguration.driver, Collaborate.class);
	public void userid(String Userid){
		 try{
		 C.getUserid().sendKeys(Userid);
		 Reports.PassCase("Entering userid", "UserId");
	       }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	 
		 public void Password(String Password){
			 try{
			 C.getPassword().sendKeys(Password);
			 Reports.PassCase("Entering password", "password");
		 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }
		 public void Sub(){
			 try{
			 C.getLogin().click();
			 Reports.PassCase("Logging in", "Login");
		 }
		 catch(Exception e){
			 System.out.println("error");
		 }
		 }
		 
	public void Java(){
		try{
			C.getJavaselenium().click();
			Reports.PassCase("selecting course", "Java selenium course");
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
	public void Collaboratetab(){
		try{
			C.getCollaboratetab().click();
			Reports.PassCase("Clicking on collaboratetab", "Collaborate");
		}
		catch(Exception e){
			System.out.println("error");
		}
		}
	public void Postannouncement(){
		try{
			C.getPostanannouncement().click();
			Reports.PassCase("Clicking on postanannouncementtab", "Post An Announcement");
		}
		catch(Exception e){
			System.out.println("error");
		}
	}
	public void Announcementmatter(String matter){
		try{
			C.getAnnouncementmatter().sendKeys(matter);
			Reports.PassCase("Typing announcement matter", "Matter");
		}
		catch(Exception e){
			System.out.println("error");
		}
	
	}
public void AddFile(){
	try{
		C.getAddfile().click();
		Reports.PassCase("Selecting a file to upload", "Adding File");
	}
	catch(Exception e){
		System.out.println("error");
	}
}

public void Choosefile(String file){
	try{
		C.getChoosefile().sendKeys(file);
		Reports.PassCase("selecting file to upload","Choosefile");
	}
	catch(Exception e){
		System.out.println("error");
	}
	
}
public void SubmitAnnouncement(){
	try{
	C.getSubmitAnnouncement().click();
	Reports.PassCase("Submitting announcement", "Submit announcement");
}
	catch(Exception e){
		System.out.println("error");
	}
}
}
