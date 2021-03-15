package pageActions;

import org.openqa.selenium.support.PageFactory;
import pageLocators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

    HomePageLocators homePageLocators=null;

    public HomePageActions(){
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(),homePageLocators);
    }

    public void clockOnSportsMenu(){
        homePageLocators.SportsLink.click();
    }


    public void verifyDivPhoneNumberDisplayed(){
        homePageLocators.divPhoneNumber.isDisplayed();
    }

    public void verifyDivDisplayedPrice(){

        homePageLocators.divPrice.isDisplayed();
    }

    public void verifyDivNumberOfDays(){

        homePageLocators.divNoDays.isDisplayed();
    }

    public void searchAndClick(String searchtext){
        homePageLocators.alertMessage.sendKeys(searchtext);
        homePageLocators.alertMessage.click();
    }

    public void clickOnMoreInfo(){
        homePageLocators.alertMessage.click();
    }



}
