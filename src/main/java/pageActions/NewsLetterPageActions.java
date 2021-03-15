package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageLocators.HomePageLocators;
import utils.SeleniumDriver;

public class NewsLetterPageActions {

    HomePageLocators homePageLocators=null;

    public NewsLetterPageActions(){
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),homePageLocators);
    }

    public void clickOnNewsLetter(){
        homePageLocators.newsLetter.click();
    }

    public void newsLetterFormDataEntry(String title,String fname,String lname, String email,String city){
        Select select = new Select(homePageLocators.title_dropdown);
        select.selectByValue(title);
        homePageLocators.firstName.sendKeys(fname);
        homePageLocators.lastName.sendKeys(lname);
        homePageLocators.eMail.sendKeys(email);
        homePageLocators.post.sendKeys(city);
    }

    public void clickOnSignUpButton(){
        homePageLocators.signUpButton.click();
    }

    public String newsLetterConfirmation(){
        return SeleniumDriver.getDriver().getTitle();
    }

}
