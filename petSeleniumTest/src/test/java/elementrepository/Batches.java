package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Batches {

@FindBy(xpath="(//input[@placeholder='User ID'])[1]")
private WebElement Userid;

@FindBy(xpath="//input[@placeholder='Password']")
private WebElement password;

@FindBy(xpath="(//input[@type='submit'])[1]")
private WebElement Login;

@FindBy(xpath="//span[contains (text(),'JAVA SELENIUM')]")
private WebElement Javaselenium;

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

}
