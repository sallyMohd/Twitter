package test;

import org.testng.annotations.Test;


import pages.LoginPage;
import pages.MainPage;
import pages.TimelinePage;

public class CannotTweetMore280Char extends TestBase {
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
		tweetobject.userAddTweets("A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet.0000000000111111111111111111113");
		
		tweetobject = new TimelinePage(driver);
		tweetobject.wordcounter();
		
		
		
	}
}
