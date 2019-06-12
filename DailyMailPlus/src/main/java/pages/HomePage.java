package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how=How.LINK_TEXT, using="Sign In")
    public static WebElement sign_in;

    @FindBy(how = How.LINK_TEXT, using = "Offers")
    public static WebElement offers;



    public void click_sign_in(){
        sign_in.click();
    }


    public void click_offers() {
        offers.click();
    }






}


