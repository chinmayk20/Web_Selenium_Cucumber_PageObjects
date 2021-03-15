package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPageLocators {

    @FindBy(how= How.XPATH,using=".//*[@id='makes']")
    public WebElement carMakerDropDown;

    @FindBy(how=How.XPATH,using=".//*[@id='models']")
    public WebElement selectModelDropDown;

    @FindBy(how=How.XPATH,using=".//*[@id='locations']")
    public WebElement selectLocation;

    @FindBy(how=How.XPATH,using=".//*[@id='price-max']")
    public WebElement priceList;

    @FindBy(how=How.XPATH,using=".//*[@id='search-submit']")
    public WebElement findMyNextCarButton;

    @FindBy(how=How.LINK_TEXT,using="Cars For Sale")
    public WebElement carsForSaleLink;

    @FindBy(how=How.LINK_TEXT,using="Sell My Car")
    public WebElement sellMyCarLink;

    @FindBy(how=How.LINK_TEXT,using="Car Reviews")
    public WebElement carReviewsLink;

    @FindBy(how=How.LINK_TEXT,using="Search Cars")
    public WebElement searchCarsLink;

    @FindBy(how=How.LINK_TEXT,using="Used Cars Search")
    public WebElement usedSearchCarsLink;

}
