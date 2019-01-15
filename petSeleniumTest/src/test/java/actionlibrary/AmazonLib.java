package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVersionThree;


import elementrepository.Amazon;

public class AmazonLib {
	Amazon L = PageFactory.initElements(DriverConfiguration.driver, Amazon.class);
	
	public void signin(){
		try{
		L.getSignin().click();
		ReportVersionThree.PassCase("clicking on signin","signin");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	
	public void email(String Email){
		try{
		L.getEmail().sendKeys();
		ReportVersionThree.PassCase("printing email", "Eamil");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	
	public void conti(){
		try{
		L.getConti().click();
		ReportVersionThree.PassCase("Click on continue","continue");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void password(String Password){
		try{
		L.getPassword().sendKeys("psd");
		ReportVersionThree.PassCase("Printing password", "password");
	}
		catch(Exception e){
			System.out.println("password");
		}
	}
	public void submit(){
		try{
		L.getSubmit().click();
		ReportVersionThree.PassCase("Clicking on submit", "submit");
		}
		catch(Exception e){
			System.out.println("error occured");
		
		}
	}
	

}
