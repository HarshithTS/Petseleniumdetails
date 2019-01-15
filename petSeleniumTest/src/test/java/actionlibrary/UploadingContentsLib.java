package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;
import elementrepository.UploadingContents;

public class UploadingContentsLib {
	
	UploadingContents U = PageFactory.initElements(DriverConfiguration.driver,	UploadingContents.class);
	
	 public void userid(String Userid){
		 try{
		 U.getUserid().sendKeys(Userid);
		 Reports.PassCase("Entering userid", "UserId");
	       }
		 catch(Exception e){
			 System.out.println("error");
		 }
	 }
	 
		 public void Password(String Password){
			 try{
			 U.getPassword().sendKeys(Password);
			 Reports.PassCase("Entering password", "password");
		 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }
		 public void Login(){
			 try{
			 U.getLogin().click();
			 Reports.PassCase("Logging in", "Login");
		 }
		 catch(Exception e){
			 System.out.println("error");
		 }
		 }
		 
		 public void Course(){
			 try{
			 U.getJavaselenium().click();
			 Reports.PassCase("Choosing course", "course");
		 }
			 catch(Exception e){
				 System.out.println("Error");
			 }
		 }
		 public void ManageCurriculum(){
			 try{
				 U.getManagecurriculum().click();
				 Reports.PassCase("Clicking on manage curriculum", "Managecurriculum");
			 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }
		 public void AddModule(){
			 try{
				 U.getAddmodule().click();
				 Reports.PassCase("Clicking on addmodule", "AddModule");
			 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }
		 public void ModuleName(String ModuleName){
			 try{
				 U.getModulename().sendKeys(ModuleName);
				 Reports.PassCase("Entering modulename","ModuleName");
			 }
			 catch(Exception e){
				System.out.println("error");
			 }
		 }
		 public void Submitmodule(){
			 try{
				 U.getSubmitmodule().click();
				 Reports.PassCase("Submitting Module","Module");
			 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }
		 public void Addtopic(){
			 try{
				 U.getAddtopic().click();
				 Reports.PassCase("Clicking on addtopic","AddTopic");
			 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }
		 public void Topicname(String topicname){
			 try{
			U.getTopicname().sendKeys(topicname);
			Reports.PassCase("Entering topic name","Topic name");
		 }
			 catch(Exception e){
				 System.out.println("error");
			 }
}
		 public void SubmitTopic(){
			 try{
				 U.getSubmittopic().click();
				 Reports.PassCase("SubmittingTopic","Submit Topic");
			 }
			 catch(Exception e){
				 System.out.println("error");
			 }
		 }

}