package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimelinePage extends PageBase
{

	public TimelinePage(WebDriver driver) {
		super(driver);
	
	}
		@FindBy(xpath ="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div")
		WebElement addtweet ;
		
		@FindBy(xpath ="//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[4]/div/div/div[2]/div/div/span/span")
		WebElement tweetbutton ;
		
		@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]")
		WebElement imagebutton ;
		
		@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div")
		WebElement errormsg ;
		
		@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[4]/div/div/div[2]/div[1]/div[3]/div")
		WebElement counter ;
		
		@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[4]/div/div/div[1]/div[2]/div")
		WebElement gifbutton ;
		
		
		public void userAddTweets(String tweetbody) {
			addtweet.sendKeys(tweetbody);
		    tweetbutton.click();
		}
		
		public void userClicksontweetButton() {
			tweetbutton.click();
		}
		    
		 public void userUploadimage() {
			 imagebutton.click();
			
		 }
		 
		 public void userClickgif() {
			
				if (gifbutton.isEnabled() == true) {
					System.out.println("gif button is not enabled");
				}
		 }
		 
		 public void errormsgdisplay() {
			 errormsg.isDisplayed();
		 }
		 
		 public void wordcounter() {
			
			 String value =  counter.getText();
			System.out.println(value);
		 }
}