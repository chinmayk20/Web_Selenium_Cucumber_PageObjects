package pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageLocators.SearchPageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

    SearchPageLocators SearchPageLocators = null;

    public CarsGuideHomePageActions() {
        //this.driver=driver;
        this.SearchPageLocators = new SearchPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), SearchPageLocators);
    }

    public void moveToCarsForSaleMenu() {
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(SearchPageLocators.carsForSaleLink).perform();
    }

    public void clickOnSearchCarsMenu() {
        //moveToCarsForSaleMenu();
        SearchPageLocators.searchCarsLink.click();

    }

    public void clickOnUsedSearchCarsMenu() {
        //moveToCarsForSaleMenu();
        SearchPageLocators.usedSearchCarsLink.click();

    }

}
