package pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how = How.LINK_TEXT, using = "")
    public WebElement SportsLink;

    @FindBy(how = How.CSS, using = "//select[@name='vars[title]']")
    public WebElement newsLetter;

    @FindBy(how = How.CSS, using = "#reassurance-bar-iter_4_reassurance-item-cont")
    public WebElement title_dropdown;

    @FindBy(how = How.CSS, using = "[placeholder*='First']")
    public WebElement firstName;

    @FindBy(how = How.CSS, using = "[placeholder*='Last']")
    public WebElement lastName;

    @FindBy(how = How.CSS, using = "[placeholder*='E-mail']")
    public WebElement eMail;

    @FindBy(how = How.CSS, using = "[placeholder*='Post']")
    public WebElement post;

    @FindBy(how = How.CSS, using = "#agree")
    public WebElement agreeTerms;

    @FindBy(how = How.CSS, using = "#sign-up")
    public WebElement signUpButton;


    @FindBy(how = How.CSS, using = "#price-pin #price-pin_days-num-01")
    public WebElement divNoDays;

    @FindBy(how = How.CSS, using = "#price-pin #price-pin_cc_newmarket .pin-price-normal .ibecurr")
    public WebElement divPrice;

    @FindBy(how = How.CSS, using = "#supplier-phone-cont #supplier-phone")
    public WebElement divPhoneNumber;

    @FindBy(how = How.XPATH, using = "//div[@class='optanon-alert-box-button optanon-button-allow']")
    public WebElement alertMessage;

}
