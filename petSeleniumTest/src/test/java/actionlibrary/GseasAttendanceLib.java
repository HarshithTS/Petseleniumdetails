package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.Reports;
import elementrepository.GseasAttendance;

public class GseasAttendanceLib {
	GseasAttendance G = PageFactory.initElements(DriverConfiguration.driver,GseasAttendance.class);
	
	public void userid(String Userid){
		try{
		G.getUserid().sendKeys(Userid);
		Reports.PassCase("printing userid" , "user id");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
		public void password(String password){
			try{
			G.getPassword().sendKeys(password);
			Reports.PassCase("printing password", "password");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
		}
		public void Login(){
			try{
			G.getLogin().click();
			Reports.PassCase("clicking on login" ,"Login");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
		}
			public void TakeAttendance(){
		try{
			G.getTakeAttendance().click();
			Reports.PassCase("Clicking on take attendance","Take attendance");
		}
		catch(Exception e){
			System.out.println("error");
		}
		}
		public void Attdate(){
			try{
			G.getAttdate().click();
			Reports.PassCase("Clicking on attdate", "att date");
		}
			catch(Exception e){
				System.out.println("error");
			}
		}
		public void Seldate(){
			try{
			G.getSeldate().click();
			Reports.PassCase("Selecting date", "sel date");
		}
			catch(Exception e){
				System.out.println("error");
			}
		}
		public void choosecoursetab(){
			try{
			G.getChoosecoursetab().click();
			Reports.PassCase("Clicking on course tab", "course tab");
		}
			catch(Exception e){
				System.out.println("error");
			}
		}
		public void selcourse(){
			try{
			G.getSelcourse().click();
			Reports.PassCase("Selecting course", "sel course");
		}
			catch(Exception e){
				System.out.println("error");
			}
		}
		public void chooseBatchTab(){
			try{
			G.getChooseBatchTab().click();
			Reports.PassCase("Clickin on batch tab","Batch tab");
		}
			catch(Exception e){
				System.out.println("error");
			}
		}
	    public void selbatch(){
	    	try{
	    	G.getSelbatch().click();
	    	Reports.PassCase("Selecting batch to take attendance", "selbatch");
	    }
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    }
	    public void choosesession(){
	    	try{
	    	G.getChoosesession().click();
	    	Reports.PassCase("Selecting session", "choose session");
	    }
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    }
	    public void createnew(){
	    	try{
	    	G.getCreatenew().click();
	    	Reports.PassCase("creating new session","Create new");
	    	}
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    }
	    public void starttime(String starttime){
	    	try{
	    	G.getStarttime().sendKeys(starttime);
	    	Reports.PassCase("enetering start time", "start time");
	    }
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    	}
	    public void endtime(String endtime){
	    	try{
	    	G.getEndtime().sendKeys(endtime);
	    	Reports.PassCase("Enterning endtime","endtime");
	    }
	    	catch(Exception e){
	    	System.out.println("error");
	    }
	    }
	    public void nav(){
	    	try{
	    	G.getNav().click();
	    	Reports.PassCase("Marking navaneeth attendance P/O", "att");
	    }
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    }
	    public void pri(){
	    	try{
	    	G.getPri().click();
	    	Reports.PassCase("Marking p/o","att");
	    }
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    }
	    public void Sub(){
	    	try{
	    	G.getSubmit2().click();
	    	Reports.PassCase("Submitting attendance", "submit");
	    }
	    	catch(Exception e){
	    		System.out.println("error");
	    	}
	    }

}
