package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static base.testBase.driver;


public class SubscribePage {

    @FindBy(how = How.CSS, using = "#body > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(1) > div.row-width-wide.hr-line > div > div.wab > div.row.js-shave-text > div:nth-child(1) > a > div > div.wab__image-wrapper.wab__image-wrapper--landscape > img")
    public static WebElement firstoffer;

    @FindBy(how = How.CSS, using = "body > div.optanon-alert-box-wrapper > div.optanon-alert-box-bg > div.optanon-alert-box-button-container > div.optanon-alert-box-button.optanon-button-allow > div > a")
    public static WebElement findoutmore;

    @FindBy(how = How.CSS, using = ".mpo_single-item:nth-child(3) .btn")
    public static WebElement membership;



    public void click_the_first_offer() {
        firstoffer.click();
    }

    public void click_find_out_more() throws InterruptedException {
        findoutmore.click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#body > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(1) > div.row-width-wide.hr-line > div > div.wab > div.wpano__lock.js-wpano-lock > div.wpano__msg.row.justify-content-md-center > div > div > div:nth-child(2) > div > div > a > div")).click();
    }

    public void click_subscribe_on_the_monthly_membership() throws InterruptedException {
        Thread.sleep(1000);
        membership.click();
    }
}
