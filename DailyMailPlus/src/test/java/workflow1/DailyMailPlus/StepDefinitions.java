package workflow1.DailyMailPlus;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.SignInPage;
import pages.SubscribePage;

import java.io.IOException;

public class StepDefinitions extends testBase {

	@Before
	public void setup() throws IOException {
		initialize();
	}

	@Given("^I go to the Home Page$")
	public void i_go_to_the_Home_Page() throws Throwable {
		driver.get(CONFIG.getProperty("URL"));
		//driver.findElement(By.cssSelector("body > div.optanon-alert-box-wrapper > div.optanon-alert-box-bg > div.optanon-alert-box-button-container > div.optanon-alert-box-button.optanon-button-allow > div > a")).click();

	}
	@Given("^I click sign in$")
	public void i_click_sign_in() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.click_sign_in();
		//driver.findElement(By.linkText("Sign In")).click();

	}

	@Given("^I enter my email address where it says create your mail account$")
	public void i_enter_my_email_address_where_it_says_create_your_mail_account() throws Throwable {
		//random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
		//System.out.println(random);
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.enter_my_email_address_where_it_says_create_your_mail_account();

		//driver.findElement(By.id("regWithEmail.email")).sendKeys("jotesanya" + random + "@gmail.com");
		//you must assign a variable to the generated email so that you can use it again for email confirmation
		//also find out how you would use page object model for generated email

	}

	@Given("^I enter my title$")
	public void i_enter_my_title() throws Throwable {
		new Select(driver.findElement(By.cssSelector(".pull-right:nth-child(3) > .btn"))).selectByValue("string:mr");

	}

	@Given("^I click continue$")
	public void i_click_continue() throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.click_continue();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Given("^I enter a firstname \"([^\"]*)\"$")
	public void i_enter_a_firstname(String firstname) throws Throwable {
		driver.findElement(By.id("profile.given_name")).sendKeys(firstname);
	}

	@Given("^I enter a lastname \"([^\"]*)\"$")
	public void i_enter_a_lastname(String lastname) throws Throwable {
		driver.findElement(By.id("profile.family_name")).sendKeys(lastname);
	}

	@Given("^I enter my email address$")
	public void i_enter_my_email_address() throws Throwable {
		//driver.findElement(By.id("basicDetail.email")).clear();
		//Thread.sleep(1000);
		//driver.findElement(By.id("basicDetail.email")).sendKeys("jotesanya" + random + "@gmail.com");


	}

	@Given("^I confirm my email address$")
	public void i_confirm_my_email_address() throws Throwable {

	}

	@Given("^I enter my password$")public void i_enter_my_password() throws Throwable {
		driver.findElement(By.id("login.password")).sendKeys("Bababinraders1");

	}

	@Given("^I confirm my password$")
	public void i_confirm_my_password() throws Throwable {

	}

	@Given("^I will click continue$")
	public void i_will_click_continue() throws Throwable {

	}

	@When("^I verify that \"([^\"]*)\" is logged in$")
	public void i_verify_that_is_logged_in(String arg1) throws Throwable {

	}

	@Then("^I click sign out$")
	public void i_click_sign_out() throws Throwable {

	}
	@Given("^I enter my email \"([^\"]*)\" address$")
	public void i_enter_my_email_address(String email) throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.enter_email_address(email);
		//driver.findElement(By.name("email")).sendKeys(email);

	}

	@Given("^I enter my password \"([^\"]*)\"$")
	public void i_enter_my_password(String password) throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.enter_password (password);
		//driver.findElement(By.name("password")).sendKeys(password);

	}

	@Given("^I click the sign in button$")
	public void i_click_the_sign_in_button() throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.click_the_sign_in_button();
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/acc-login-or-register/div/div[2]/div/div[1]/acc-login-form/div/div[1]/div[4]/form/div[3]/button")).click();

	}

	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {

	}
	@Then("^I want to see an error \"([^\"]*)\" error message details$")
	public void i_want_to_see_an_error_error_message_details(String errormessage) throws Throwable {
		Thread.sleep(1000);
		Assert.assertEquals(errormessage, driver.findElement(By.cssSelector("body > div.container > div:nth-child(2) > acc-login-or-register > div > div.ng-scope > div > div.col-xs-12.col-sm-6.col-md-5.col-md-offset-1.col-lg-5.col-lg-offset-1 > acc-login-form > div > div.panel > div.panel-body.clearfix > form > div:nth-child(3) > acc-field-error > div > span")).getText());
	}
	@Given("^I click the My Account link$")
	public void i_click_the_My_Account_link() throws Throwable {
		driver.findElement(By.cssSelector("#header > div > div.container.header > div > div.col.header__account-links > div > div:nth-child(1) > a")).click();

	}
	@Given("^I click on the forgot your password link$")
	public void i_click_on_the_forgot_your_password_link() throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.click_on_the_forgot_your_password_link();
		//driver.findElement(By.linkText("Forgotten password?")).click();

	}

	@When("^I enter my email in the enter email field$")
	public void i_enter_my_email_in_the_enter_email_field() throws Throwable {
		ForgotPasswordPage forgotPasswordPage = PageFactory.initElements(driver, ForgotPasswordPage.class);
		forgotPasswordPage.enter_my_email_in_the_enter_email_field();
		//driver.findElement(By.name("email")).sendKeys("jotesanya97@gmail.com");

	}

	@Then("^I click the continue button$")
	public void i_click_the_continue_button() throws Throwable {
		ForgotPasswordPage forgotPasswordPage = PageFactory.initElements(driver, ForgotPasswordPage.class);
		forgotPasswordPage.click_the_continue_button();
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/acc-forgotten-password/div/div[2]/div/div/form/div[2]/button")).click();

	}

	@Given("^I click offers$")
	public void i_click_offers() throws Throwable {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.click_offers();
		//driver.findElement(By.linkText("Offers")).click();
	}

	@Given("^I click the first offer$")
	public void i_click_the_first_offer() throws Throwable {
		SubscribePage subscribePage = PageFactory.initElements(driver, SubscribePage.class);
		subscribePage.click_the_first_offer();
		//driver.findElement(By.cssSelector("#body > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(1) > div.row-width-wide.hr-line > div > div.wab > div.row.js-shave-text > div:nth-child(1) > a > div > div.wab__image-wrapper.wab__image-wrapper--landscape > img")).click();
		//driver.findElement(By.cssSelector(".wab__item:nth-child(1) .wab__title-inner")).click();

	}

	@Given("^I click find out more$")
	public void i_click_find_out_more() throws Throwable {
		SubscribePage subscribePage = PageFactory.initElements(driver, SubscribePage.class);
		subscribePage.click_find_out_more();
		//driver.findElement(By.cssSelector("body > div.optanon-alert-box-wrapper > div.optanon-alert-box-bg > div.optanon-alert-box-button-container > div.optanon-alert-box-button.optanon-button-allow > div > a")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("#body > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(1) > div.row-width-wide.hr-line > div > div.wab > div.wpano__lock.js-wpano-lock > div.wpano__msg.row.justify-content-md-center > div > div > div:nth-child(2) > div > div > a > div")).click();


	}

	@Given("^I click subscribe on the monthly membership$")
	public void i_click_subscribe_on_the_monthly_membership() throws Throwable {
		SubscribePage subscribePage = PageFactory.initElements(driver, SubscribePage.class);
		subscribePage.click_subscribe_on_the_monthly_membership();
		//driver.findElement(By.cssSelector(".mpo_single-item:nth-child(3) .btn")).click();

	}

	@Given("^I enter my Email address$")
	public void i_enter_my_Email_address() throws Throwable {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		signInPage.enter_my_Email_address();
		//driver.findElement(By.id("login.email")).sendKeys("jotesanya97@gmail.com");

	}
	@Then("^I click Sign in$")
	public void i_click_Sign_in() throws Throwable {
		driver.findElement(By.cssSelector("body > div.container > div:nth-child(2) > acc-login-or-register > div > div.ng-scope > div > div.col-xs-12.col-sm-6.col-md-5.col-md-offset-1.col-lg-5.col-lg-offset-1 > acc-login-form > div > div.panel > div.panel-body.clearfix > form > div.pull-right.controls > button")).click();
	}

}





