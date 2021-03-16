package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MainPage;
import pages.TimelinePage;

public class UserCannotaddgifwithimage extends TestBase {
	MainPage mainobject ;
	LoginPage loginobject ;
	TimelinePage tweetobject ;
	
	@Test
	public void UserCantuploadimagewithgif() throws AWTException {
		
		
		String imageName = "11561_Sun.png";
		String imagePath = System.getProperty("user.dir")+"\\Upload\\"+imageName;
		
		mainobject = new MainPage(driver);
		mainobject.mainuserLogin();
		
		loginobject = new LoginPage(driver);
		loginobject.userLogin();
		
		tweetobject = new TimelinePage(driver);
		tweetobject.userUploadimage();
		
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(imagePath);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		tweetobject = new TimelinePage(driver);
		tweetobject.userClickgif();

		
}

}
