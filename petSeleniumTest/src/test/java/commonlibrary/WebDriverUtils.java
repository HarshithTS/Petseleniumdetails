package commonlibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WebDriverUtils  {
	 static Robot robot;
	    static boolean status = true;

	    public static void waitForPageToLoad() {
	        DriverConfiguration.driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

	    }

	    public static void waitForLinkTextPresent(String linkName) {
	        WebDriverWait wait = new WebDriverWait(DriverConfiguration.driver, 20);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkName)));

	    }

	    public static void waitForButtonPresent(WebElement weButton) {

	        WebDriverWait wait = new WebDriverWait(DriverConfiguration.driver, 60);
	        wait.until(ExpectedConditions.visibilityOf(weButton));
	    }

	   public static void scrollToBottom(WebDriver driver) {
	        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	   }
	   public static void EnterValue(WebDriver driver){
		   ((JavascriptExecutor) driver).executeScript("document.getElementById('')");
	   }

	    public static void waitForXpathPresent(String wbXpath) {
	        WebDriverWait wait = new WebDriverWait(DriverConfiguration.driver, 20);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbXpath)));
	    }

	    public static void waitForElementPresent(WebElement wbElement) {
	        WebDriverWait wait = new WebDriverWait(DriverConfiguration.driver, 20);
	        wait.until(ExpectedConditions.visibilityOf(wbElement));
	    }

	    public static boolean verifyText(String wbXpath, String expectedText) {
	        boolean flag = false;
	        String actText = DriverConfiguration.driver.findElement(By.xpath(wbXpath)).getText();
	        if (expectedText.equals(actText)) {
	            flag = true;
	            System.out.println(expectedText + "=text is verified==>PASS");
	        } else {
	            System.out.println(expectedText + "=text is not verified==>FAIL");

	        }
	        return flag;
	    }

	    public static void select(String wbName, String visbleText) {
	        Select sel = new Select(DriverConfiguration.driver.findElement(By.name(wbName)));
	        sel.selectByVisibleText(visbleText);
	    }

	    public static void select(String wbName, int index) {
	        Select sel = new Select(DriverConfiguration.driver.findElement(By.name(wbName)));
	        sel.selectByIndex(index);
	    }

	    public static void select(WebElement wb, String value) {
	        Select sel = new Select(wb);
	        sel.selectByVisibleText(value);
	    }

	    public static void aceptAlert() {
	        Alert alt = DriverConfiguration.driver.switchTo().alert();
	        System.out.println(alt.getText());
	        alt.accept();
	    }

	    public static void dismissAlert() {
	        Alert alt = DriverConfiguration.driver.switchTo().alert();
	        System.out.println(alt.getText());
	        alt.dismiss();
	    }

	    public static void mouseOver(String wbxpath) {
	        WebElement wb = DriverConfiguration.driver.findElement(By.xpath(wbxpath));
	        Actions act = new Actions(DriverConfiguration.driver);
	        act.moveToElement(wb).perform();

	    }

	 /*   public static boolean sikuliClickImage(String imageName) {

	        try {
	            Screen scr = new Screen();
	            Pattern okButtonManhattan = new Pattern(ConstantClass.projectDir + "\\Sikuli Images\\" + imageName);
	            System.out.println("got the image from folder");
	            scr.wait(okButtonManhattan, 5);
	            scr.click(okButtonManhattan);
	        } catch (Exception e) {
	            status = false;
	            e.printStackTrace();
	        }
	        return status;

	    }
*/
	    public static void configRobot() {
	        try {
	            robot = new Robot();
	        } catch (AWTException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

	    public static void clickEscape() {
	        configRobot();
	        robot.keyPress(KeyEvent.VK_ESCAPE);
	    }

	    public static void KeyboardEnter() {
	        configRobot();
	        robot.keyPress(KeyEvent.VK_ENTER);
	    }

	    public void fluentWaitMethod() {
	        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverConfiguration.driver).withTimeout(30, TimeUnit.SECONDS)
	                .pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
	            public Boolean apply(WebDriver driver) {
	                WebElement element = driver.findElement(By.id(""));
	                element.click();
	                return true;
	            }
	        };

	        wait.until(function);
	    }

}
   


