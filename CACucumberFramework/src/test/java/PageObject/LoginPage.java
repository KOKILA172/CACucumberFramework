package PageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinations.Step1;

public class LoginPage {
	public WebDriver ldriver;
	public static Logger log = LogManager.getLogger(Step1.class.getName());

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//header/div[1]/div[1]/section[3]/ul[1]/li[2]/span[1]/*[1]")
	@CacheLookup
	WebElement login;

	@FindBy(xpath = "//*[@id='header']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a")
	@CacheLookup
	WebElement clicklogin;

	@FindBy(xpath = "//input[@placeholder='Email Address']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Password']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	@CacheLookup
	WebElement submit;

	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	WebElement search;

	@FindBy(xpath = "//header/div[1]/div[1]/section[2]/div[1]/form[1]/div[1]/button[1]/span[1]")
	@CacheLookup
	WebElement enter;

	

	@FindBy(xpath = "//header/div[1]/div[1]/section[3]/ul[1]/li[4]/a[1]/div[1]/span[1]/*[1]")
	@CacheLookup
	WebElement cart;

	@FindBy(xpath = "//header/div[1]/div[1]/section[3]/ul[1]/li[1]/a[1]/span[1]/*[1]")
	@CacheLookup
	WebElement track;
	
	@FindBy(xpath = "//*[@id='footer-links']/div[1]/div[1]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement about;
	
	@FindBy(xpath = "//header/div[1]/div[1]/section[3]/ul[1]/li[3]/a[1]/div[1]/span[1]/*[1]")
	@CacheLookup
	WebElement wishlist;
	
	


	public void Login() {
		login.click();
	}

	public void Clicklogin() {
		clicklogin.click();
	}

	public void setUserName(String uname) {
		email.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void Submit() {

		submit.click();
	}

	public void setSearch(String searching) {
		search.sendKeys(searching);
	}

	public void Enter() {
		enter.click();
	}

	

	public void Cart() {
		cart.click();
	}

	public void track() {
		track.click();
	}
	public void aboutcompany() {
		about.click();
	}
	
	public void Wishlist() {
		wishlist.click();
	}

	
}
