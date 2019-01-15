package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GseasSignIn {
	@FindBy(xpath="//input[@name='user_id']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="(//span[contains (text(),'Take Attendance')])[3]")
	private WebElement TakeAttendance;
	
	@FindBy(xpath="//input[@ng-model='attendance_date']")
	private WebElement attdatetab;
	
	@FindBy(xpath="(//span[contains (text(),'04')])[1]")
	private WebElement seldate;
	
	@FindBy(xpath="//md-select[@placeholder='Choose Course']")
	private WebElement choosecoursetab;
	
	@FindBy(xpath="//div[contains (text(),'Gseas')]")
	private WebElement selcourse;
	
	@FindBy(xpath="//md-select[@aria-label='Choose Batch']")
	private WebElement chooseBatchTab;
	
	@FindBy(xpath="(//md-option[@ng-repeat='batch in attendance_course.batches'])[1]")
	private WebElement selbatch;
	
	@FindBy(xpath="//md-select[@placeholder='Choose Session']")
	private WebElement choosesession;
	
	@FindBy(xpath="(//div[contains (text(),'Create New')])[1]")
	private WebElement createnew;
	
	@FindBy (xpath="//input[@ng-model='contact_session.start_time']")
	private WebElement starttime;
	
	@FindBy(xpath="//input[@ng-model='contact_session.end_time']")
	private WebElement endtime;
	
	@FindBy(xpath="//span[contains (text(),'navaneeth@abc')]")
	private WebElement nav;
	
	@FindBy(xpath="//span[contains (text(),'priyanka@abc')]")
	private WebElement pri;
	
	@FindBy(xpath ="//span[contains (text(),'Submit')]")
	private WebElement Submit2;

    @FindBy(xpath ="(//i[contains (text(),'home')])[2]")
    private WebElement home;
    
	

	public void setSeldate(WebElement seldate) {
		this.seldate = seldate;
	}

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
    
    public WebElement getTakeAttendance() {
		return TakeAttendance;
	}

    public WebElement getAttdate() {
		return attdatetab;
	}
    
    public WebElement getSeldate() {
		return seldate;
	}
	
	public WebElement getChoosecoursetab() {
		return choosecoursetab;
	}
	
	public WebElement getSelcourse() {
		return selcourse;
	}
	
	public WebElement getChooseBatchTab() {
		return chooseBatchTab;
	}
	
	public WebElement getSelbatch() {
		return selbatch;
	}
	
	public WebElement getChoosesession() {
		return choosesession;
	}
	
	public WebElement getCreatenew() {
		return createnew;
	}
	
	public WebElement getStarttime() {
		return starttime;
	}

	public WebElement getEndtime() {
		return endtime;
	}
    
    public WebElement getNav() {
		return nav;
	}

	public WebElement getPri() {
		return pri;
	}
	public WebElement getSubmit2() {
		return Submit2;
	}



	

}
