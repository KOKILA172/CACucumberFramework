package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Validatingtitle {
	public WebDriver ldriver;

	public Validatingtitle(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	

	@FindBy(xpath = "//a[contains(text(),'Bulk Orders')]")
	@CacheLookup
	WebElement text;

	public Object getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
