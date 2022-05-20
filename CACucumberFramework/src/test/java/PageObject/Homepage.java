package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver ldriver;

	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[1]/span")
	@CacheLookup
	WebElement topdeals;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[2]/span")
	@CacheLookup
	WebElement living;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[3]/span")
	@CacheLookup
	WebElement room;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[4]/span")
	@CacheLookup
	WebElement mattresses;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[5]/span")
	@CacheLookup
	WebElement dining;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[6]/span")
	@CacheLookup
	WebElement storage;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[7]/span")
	@CacheLookup
	WebElement study;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[8]/span")
	@CacheLookup
	WebElement kidsroom;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[9]/span")
	@CacheLookup
	WebElement decor;

	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[10]/span")
	@CacheLookup
	WebElement collection;

	@FindBy(xpath = "//header/section[1]/div[1]/ul[2]/li[3]/a[1]")
	@CacheLookup
	WebElement giftcards;
	
	@FindBy(xpath = "//body/div[@id='widget-Gumstack']/div[1]/div[1]/div[1]")
	@CacheLookup
	WebElement vedioshop;
	
	


	public void Topdeals() {
		topdeals.click();
	}

	public void Living() {
		living.click();
	}

	public void Room() {
		room.click();
	}

	public void Mattresses() {
		mattresses.click();
	}

	public void Dining() {
		dining.click();
	}

	public void Storage() {
		storage.click();
	}

	public void Study() {
		study.click();
	}

	public void Kidsroom() {
		kidsroom.click();
	}

	public void Decor() {
		decor.click();
	}

	public void Collection() {
		collection.click();
	}
	
	public void GiftCards() {
		giftcards.click();
	}
	public void vedioshop() {
		vedioshop.click();
	}
	
	

}
