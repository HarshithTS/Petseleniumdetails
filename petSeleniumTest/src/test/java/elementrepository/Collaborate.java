package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Collaborate {
	
	@FindBy(xpath="(//input[@placeholder='User ID'])[1]")
	private WebElement Userid;
	
    @FindBy(xpath="//input[@placeholder='Password']")
    private WebElement password;
    
    @FindBy(xpath="//input[@value='Login']")
    private WebElement Sub;
    
    
    @FindBy(xpath="//span[contains (text(),'JAVA SELENIUM')]")
    //@FindBy(xpath="(//span[contains (text(),'Course')])[1]")
    private WebElement Javaselenium;
    
    @FindBy(xpath="(//span[contains (text(),'Collaborate')])[3]")
    private WebElement Collaboratetab;
    
    @FindBy(xpath="(//span[@layout-align='start center'])[1]")
    private WebElement postanannouncement;
    
    @FindBy(xpath="//textarea[@name='body']")
    private WebElement announcementmatter;
    
    @FindBy(xpath="(//a[@class='btn btn-info btn-xs'])[1]")
    private WebElement Addfile;
    
    @FindBy(xpath="//input[@name='attachment']")
    private WebElement choosefile;
    
    @FindBy(xpath="//span[contains (text(),'Submit')]")
    private WebElement SubmitAnnouncement;
    

	public WebElement getUserid() {
		return Userid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Sub;
	}

	public WebElement getJavaselenium() {
		return Javaselenium;
	}

	public WebElement getCollaboratetab() {
		return Collaboratetab;
	}

	public WebElement getPostanannouncement() {
		return postanannouncement;
	}

	public WebElement getAnnouncementmatter() {
		return announcementmatter;
	}

	public WebElement getAddfile() {
		return Addfile;
	}

	public WebElement getChoosefile() {
		return choosefile;
	}

	public WebElement getSubmitAnnouncement() {
		return SubmitAnnouncement;
	}
}
