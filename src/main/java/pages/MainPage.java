package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase {

	public MainPage(WebDriver driver) {
		super(driver);
		
		
		}
		@FindBy(xpath ="//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[1]/div/div[3]/a[2]/div")
		WebElement Floginbutton ;
		
		
		
		public void mainuserLogin() {
			
			Floginbutton.click();

	}
	

}
