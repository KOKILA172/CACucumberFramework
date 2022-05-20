package StepDefinations;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.Validatingtitle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseClass;



public class Step1 extends BaseClass {
	
	
	public WebDriver driver;
	public LoginPage lp;
	public Validatingtitle vt;
	public Homepage hp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		log = LogManager.getLogger(BaseClass.class.getName());
		System.setProperty("webdriver.chrome.driver", "D:\\CA\\CACucumberFramework\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		hp = new Homepage(driver);
		vt = new Validatingtitle(driver);
		
	}

	@When("User opens url {string}")
	public void user_opens_url_something(String url) {
		log.info("*****************chrome is opened succesfully***************************");
		driver.get(url);
		driver.manage().window().maximize();
	}

	@And("user clicks on the login link")
	public void user_clicks_on_the_login_link() throws InterruptedException {
		Thread.sleep(3000);
		lp.Login();
		lp.Clicklogin();
		Thread.sleep(3000);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) throws InterruptedException {
		Thread.sleep(3000);
		lp.setUserName(string);
		Thread.sleep(3000);
		lp.setPassword(string2);
	}

	@And("click on Login")
	public void click_on_login() throws InterruptedException {
		lp.Submit();
		Thread.sleep(5000);
	}
	 
	@Then("close browser")
	public void close_browser() throws Throwable {
		log.info("*****************chrome is closed succesfully***************************");
		driver.quit();
	}

	@When("user can view the titles of the page {string}")
	public void user_can_view_the_titles_of_the_page(String title) {
		if (driver.getPageSource().contains("Stores")) {
			driver.close();
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@Then("user searches required products {string}")
	public void user_searches_required_products_something(String strArg1) throws InterruptedException {
		Thread.sleep(3000);
		lp.setSearch(strArg1);

	}

	@And("clicks on the search icon")
	public void clicks_on_the_search_icon() {
		lp.Enter();
	}

	@Then("User clicks on the cart")
	public void user_clicks_on_the_cart() throws InterruptedException {
		Thread.sleep(3000);
		lp.Cart();
		Thread.sleep(3000);
	}

	@Then("User clicks on the track order to track the order")
	public void user_clicks_on_the_track_order_to_track_the_order() throws InterruptedException {
		Thread.sleep(3000);
		lp.track();
	}

	@Then("User should be able to see the details of the company")
	public void user_should_be_able_to_see_the_details_of_the_company() throws InterruptedException {
		Thread.sleep(3000);
		lp.aboutcompany();

	}

	@Then("User should be able to see the wishlist")
	public void user_should_be_able_to_see_the_wishlist() throws InterruptedException {
		Thread.sleep(3000);
		lp.Wishlist();
	}

	@Then("User should be able navigate from one product to another")
	public void user_should_be_able_navigate_from_one_product_to_another() throws InterruptedException {
		Thread.sleep(3000);
		hp.Topdeals();
		Thread.sleep(3000);
		hp.Living();
		Thread.sleep(3000);
		hp.Room();
		Thread.sleep(3000);
		hp.Mattresses();
		Thread.sleep(3000);
		hp.Dining();
		Thread.sleep(3000);
		hp.Storage();
		Thread.sleep(3000);
		hp.Study();
		Thread.sleep(3000);
		hp.Kidsroom();
		Thread.sleep(3000);
		hp.Decor();
		Thread.sleep(3000);
		hp.Collection();
		Thread.sleep(3000);
	}
	

    @Then("User can view the giftcards offered")
    public void user_can_view_the_giftcards_offered() throws InterruptedException  {
    	Thread.sleep(3000);
    	hp.GiftCards();
  
    }
    @Then("User can shop over vedio")
    public void user_can_shop_over_vedio() throws InterruptedException  {
    	Thread.sleep(3000);
    	hp.vedioshop();
    }
    
    
}
