package test;

import org.testng.annotations.Test;


import pages.LoginPage;
import pages.MainPage;
import pages.TimelinePage;

public class UserCannotAddsameTweettwice extends TestBase {
	MainPage mainobject ;
	LoginPage loginobject ;
	TimelinePage tweetobject ;
	
	
	
	@Test
	public void userCannotaddtweettwiceinarow() 
	{
		mainobject = new MainPage(driver);
		mainobject.mainuserLogin();
		
		loginobject = new LoginPage(driver);
		loginobject.userLogin();
		
		tweetobject = new TimelinePage(driver);
		tweetobject.userAddTweets("test11");
		
		tweetobject = new TimelinePage(driver);
		tweetobject.userAddTweets("test11");
		
		
		
		
	}
	

}
