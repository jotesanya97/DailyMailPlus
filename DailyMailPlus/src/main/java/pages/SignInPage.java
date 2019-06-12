package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPage {
    public int random;

    @FindBy(how = How.NAME, using = "email")
    public static WebElement myemail;

    @FindBy(how = How.NAME, using = "password")
    public static WebElement mypassword;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/acc-login-or-register/div/div[2]/div/div[1]/acc-login-form/div/div[1]/div[4]/form/div[3]/button")
    public static WebElement signinbutton;

    @FindBy(how = How.ID, using = "regWithEmail.email")
    public static WebElement createdemail;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public static WebElement clickcontinue;

    @FindBy(how = How.LINK_TEXT, using = "Forgotten password?")
    public static WebElement clickfp;

    @FindBy(how = How.ID, using = "login.email")
    public static WebElement loginemail;



    public void enter_email_address(String email) {
        myemail.sendKeys(email);

    }

    public void enter_password(String password) {
        mypassword.sendKeys(password);
    }

    public void click_the_sign_in_button() {
        signinbutton.click();
    }

    public void enter_my_email_address_where_it_says_create_your_mail_account() {
        random = 100 + (int) (Math.random() * ((1000 - 1) + 1));
        System.out.println(random);
        createdemail.sendKeys("jotesanya" + random + "@gmail.com");
    }

    public void click_continue() {
        clickcontinue.click();
    }

    public void click_on_the_forgot_your_password_link() {
        clickfp.click();
    }

    public void enter_my_Email_address() {
        loginemail.sendKeys("jotesanya97@gmail.com");
    }



}
