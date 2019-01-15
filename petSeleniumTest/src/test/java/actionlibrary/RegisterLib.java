package actionlibrary;
import org.openqa.selenium.support.PageFactory;

import commonlibrary.DriverConfiguration;
import commonlibrary.ReportVesionThree;
import elementrepository.Register;

public class RegisterLib {
	
	//Register F = new Register(); this way of object creation will give NPE since there is no link between webelements and driver objects
	Register F = PageFactory.initElements(DriverConfiguration.driver, Register.class);
	public void enterfirstname(String FirstName){
		try{
		F.getFirstname().sendKeys(FirstName);
		ReportVesionThree.PassCase("Printing first name","FirstName");
	}
	catch(Exception e){
		
		System.out.println("There is some error in the FirstName");	
	}	
	}
	public void enterLastname(String LastName){
		try{
		F.getLastname().sendKeys(LastName);
		ReportVesionThree.PassCase("Printing Lastname", "LastName");
	}
		catch(Exception e){
			System.out.println("error is occured");
			
		}
		}
		
	public void Address(String Address){
		try{
		F.getAddress().sendKeys(Address);
		ReportVesionThree.PassCase("printing Address","Address");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
		public void Email(String Email){
			try{
			F.getEmail().sendKeys(Email);
			ReportVesionThree.PassCase("Printing Email", "Email");
		}
			catch(Exception e){
			System.out.println("error occcured");	
			}
			}
		public void Phone(String Phone){
			try{
			F.getPhone().sendKeys(Phone);
			ReportVesionThree.PassCase("printing phone number", "phone no");
			}
			catch(Exception e){
				System.out.println("error occured");
			}
		}
			public void Sex(){
				try{
				F.getSex().click();	
				ReportVesionThree.PassCase("marking  gender", "sex");
				}
	 
			catch(Exception e){
				System.out.println("error occured");
			}
			}
			public void Hobbies(){
				try{
				F.getHobbies().click();
				ReportVesionThree.PassCase("Selecting Hobbies", "Hobbies");
			}
				catch(Exception e){
				System.out.println("error occured");
				}
				}
			public void  languagetab(){
				try{
				F.getLanguagetab().click();
				ReportVesionThree.PassCase("clicking Languagetab", "Language tab");
			}
				catch(Exception e){
					System.out.println("error occured");
				}
				}
		public void Languages(){
			try{
			F.getLanguages().click();
			ReportVesionThree.PassCase("printing languages" , "Languages");
		}
		    catch(Exception e){
		    	System.out.println("error occured");
		    }
		}
		
		public void Elanguagetab(){
			try{
			F.getElanguagetab().click();
			ReportVesionThree.PassCase("clicking Elantab","outside click");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
			}
		public void Skills(){
			try{
			F.getSkills().click();
			ReportVesionThree.PassCase("clicking on skills tab", "skills tab");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
			}
		public void Skillss(){
			try{
			F.getSkillss().click();
			ReportVesionThree.PassCase("selecting skills","skills");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
			}
		    
		public void Countrytab(){
			try{
			F.getCountrytab().click();
			ReportVesionThree.PassCase("clicking on country tab","country tab");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
		}
		public void Country(){
			try{
			F.getCountry().click();
			ReportVesionThree.PassCase("selecting country", "country");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
		}
		public void SelCountrytab(){
			try{
			F.getSelcountrytab().click();
			ReportVesionThree.PassCase("clicking on select country tab", "sel countrytab");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
			}
		
		public void Selcountry(){
			try{
			F.getSelcountry().click();
			ReportVesionThree.PassCase("clicking on selected country name", "select country");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
			}
		public void Yeartab(){
			try{
			F.getYeartab().click();
			ReportVesionThree.PassCase("clicking on year tab", "yeartab");
		}
			catch(Exception e){
				System.out.println("error occured");
			}
			}
		public void Year(){
			try{
			F.getYear().click();
			ReportVesionThree.PassCase("selecting year", "year");
			}
			catch(Exception e){
				System.out.println("error occured");
			}
		}
		
	public void Monthtab(){
		try{	
		F.getMonthtab().click();
		ReportVesionThree.PassCase("clicking on month tab","month tab");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void Month(){
		try{
		F.getMonth().click();
		ReportVesionThree.PassCase("selecting month", "month");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void Daytab(){
		try{
		F.getDaytab().click();
		ReportVesionThree.PassCase("Clicking on Day tab","Day tab");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void Day(){
		try{
		F.getDay().click();
		ReportVesionThree.PassCase("selecting day","Day");
	}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
	}
	
	public void Password(String Password){
		try{
		F.getPassword().sendKeys(Password);
		ReportVesionThree.PassCase("printing password", "password");
	}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
		}
	public void ConfirmPassword(String ConfirmPassword){
		try{
		F.getConfirmpassword().sendKeys(ConfirmPassword);
		ReportVesionThree.PassCase("confirming password","confirm password");
	}
		catch(Exception e){
			System.out.println("error occured");
		}
	}
	public void Submit(){
		try{
		F.getSubmit().click();
		ReportVesionThree.PassCase("Clicking on submit","submit");
	}
		catch(Exception e){
			System.out.println("Erroe occured");
		}
	}
}

/*
@FindBy(xpath="//input[@placeholder ='First Name']")
private WebElement firstname;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//textarea[@rows='3']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement sex;
	
	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement hobbies;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement languagetab;
	
	@FindBy(xpath="//a[contains(text(),'Bulgarian')]")
	private WebElement languages;
	
	@FindBy(xpath="//select[@id='Skills']")
	private WebElement skills;
	
	@FindBy(xpath="//select[@id='countries']")
	private WebElement country;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement selcountry;
	
	@FindBy(xpath="//select[@placeholder='Year']")
	private WebElement year;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@placeholder='Day']")
	private WebElement day;
	
	@FindBy(xpath="//input[@ng-model='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	private WebElement confirmpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
*/