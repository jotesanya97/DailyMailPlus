package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ForgotPasswordPage {

    @FindBy(how = How.NAME, using = "email")
    public static WebElement fpemail;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[1]/acc-forgotten-password/div/div[2]/div/div/form/div[2]/button")
    public static WebElement fpbutton;

    public void enter_my_email_in_the_enter_email_field() {
        fpemail.sendKeys("jotesanya97@gmail.com");
    }

    public void click_the_continue_button() {
        fpbutton.click();
    }
}



