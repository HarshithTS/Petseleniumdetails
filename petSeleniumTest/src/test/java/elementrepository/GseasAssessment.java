package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GseasAssessment {
	
	@FindBy(xpath="(//input[@placeholder='User ID'])[1]")
	private WebElement Userid;
	
    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement password;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement Submit;
    
    @FindBy(xpath="(//input[@type='submit'])[1]")
    private WebElement Login;
    
    @FindBy(xpath="(//span[contains (text(),'Assessment')])[1]")
    private WebElement selectingcourse;
    
    @FindBy(xpath="(//span[contains (text(),'Assess')])[4]")
    private WebElement Assess;
    
    @FindBy(xpath="(//span[contains (text(),'New Evaluation')])")
    private WebElement Newevaluation;
    
    @FindBy(xpath="//input[@name='name']")
    private WebElement Nameofthetest;
    
    @FindBy(xpath="//span[contains (text(),'Has Negative Marking')]")
    private WebElement Hasnegativemarking;
    
    @FindBy(xpath="//span[contains (text(),'Timed')]")
    private WebElement Timed;
    
    @FindBy(xpath="//input[@ng-model='ngDialogData.item.time']")
    private WebElement Time;
    
    @FindBy(xpath="(//span[contains (text(),'Publish')])")
    private WebElement publish;
    
    @FindBy(xpath="(//span[contains (text(),'Submit')])[2]")
    private WebElement Submittestname;
    
    @FindBy(xpath="(//span[contains (text(),'Manage Questions')])[1]")
    private WebElement Managequestions;
    
    @FindBy(xpath="//span[contains (text(),'Upload Questions')]")
    private WebElement uploadquestions;
    
    @FindBy(xpath="//input[@name='attachment']")
    private WebElement choosefile;
    
    @FindBy(xpath="(//span[contains (text(),'Upload')])[2]")
    private WebElement Upload;

	public WebElement getUserid() {
		return Userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getSelectingcourse() {
		return selectingcourse;
	}

	public WebElement getAssess() {
		return Assess;
	}

	public WebElement getNewevaluation() {
		return Newevaluation;
	}

	public WebElement getNameofthetest() {
		return Nameofthetest;
	}

	public WebElement getHasnegativemarking() {
		return Hasnegativemarking;
	}

	public WebElement getTimed() {
		return Timed;
	}

	public WebElement getTime() {
		return Time;
	}

	public WebElement getPublish() {
		return publish;
	}

	public WebElement getSubmittestname() {
		return Submittestname;
	}

	public WebElement getManagequestions() {
		return Managequestions;
	}

	public WebElement getUploadquestions() {
		return uploadquestions;
	}

	public WebElement getChoosefile() {
		return choosefile;
	}

	public WebElement getUpload() {
		return Upload;
	}
	
	
	
}
