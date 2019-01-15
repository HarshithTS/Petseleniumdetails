package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadingContents {
	@FindBy(xpath="(//input[@placeholder='User ID'])[1]")
	private WebElement Userid;
	
    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement password;
    
    @FindBy(xpath="(//input[@type='submit'])[1]")
    private WebElement Login;
    
    @FindBy(xpath="//span[contains (text(),'JAVA SELENIUM')]")
    private WebElement Javaselenium;
    
    @FindBy(xpath="//span[contains (text(),'Manage Curriculum')]")
    private WebElement managecurriculum;
    
    @FindBy(xpath="//span[contains (text(),'Add A Module')]")
    private WebElement Addmodule;
    
    @FindBy(xpath="//input[@name='name']")
    private WebElement modulename;
    
    @FindBy (xpath="//span[contains (text(),'Submit')]")
    private WebElement Submitmodule;
    
    @FindBy(xpath="(//span[contains (text(),'Add A Topic')])[1]")
    private WebElement addtopic;
    
    @FindBy(xpath="//input[@name='name']")
    private WebElement topicname;
    
    @FindBy(xpath="//span[contains (text(),'Submit')]")
    private WebElement Submittopic;

	public WebElement getUserid() {
		return Userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getJavaselenium() {
		return Javaselenium;
	}

	public WebElement getManagecurriculum() {
		return managecurriculum;
	}

	public WebElement getAddmodule() {
		return Addmodule;
	}

	public WebElement getModulename() {
		return modulename;
	}

	public WebElement getSubmitmodule() {
		return Submitmodule;
	}

	public WebElement getAddtopic() {
		return addtopic;
	}

	public WebElement getTopicname() {
		return topicname;
	}

	public WebElement getSubmittopic() {
		return Submittopic;
	}

}
