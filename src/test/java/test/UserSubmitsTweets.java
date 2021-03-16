package test;

import org.testng.annotations.Test;


import pages.LoginPage;
import pages.MainPage;
import pages.TimelinePage;

public class UserSubmitsTweets extends TestBase {
	MainPage mainobject ;
	LoginPage loginobject ;
	TimelinePage tweetobject ;
	
	
	@Test
	public void userCanAddTweetNotExceed280CHAR() 
	{
		mainobject = new MainPage(driver);
		mainobject.mainuserLogin();
		
		loginobject = new LoginPage(driver);
		loginobject.userLogin();
		
		tweetobject = new TimelinePage(driver);
		tweetobject.userAddTweets("good day");
		
	}
	
	
		


		

}

