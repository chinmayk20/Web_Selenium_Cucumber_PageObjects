package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pageActions.HomePageActions;
import pageActions.NewsLetterPageActions;
import utils.EnumConstant;
import utils.UserData;

import java.util.List;

public class NewsLetter {

    NewsLetterPageActions newsLetterPageActions;
    HomePageActions homePageActions;

    @When("^user Clicks on SignUp NewsLetterURL$")
    public void userClicksOnSignUpNewsLetterURL() {
        newsLetterPageActions.clickOnNewsLetter();
    }

    @And("^user Enters following information$")
    public void userEntersFollowingInformation(DataTable userData) {
        final UserData myData = (UserData) userData.asList(UserData.class).stream().findFirst().get();
        newsLetterPageActions.newsLetterFormDataEntry(myData.getTitle(), myData.getFirstName(), myData.getLastName(), myData.getEmail(), myData.getAddress());
    }

    @And("^user clicks on Sign-up button$")
    public void userClicksOnSignUpButton() {
        newsLetterPageActions.clickOnSignUpButton();
    }

    @Then("^he is presented with a Thank You message$")
    public void heIsPresentedWithAThankYouMessage() {
        Assert.assertTrue("Page Title is wrong ", newsLetterPageActions.newsLetterConfirmation() == "");
    }

    @When("user searches for (.*)")
    public void user_searches_for_the_intended_data(String searchData) {
        homePageActions.searchAndClick(searchData);
    }

    @Then("clicks on the moreinfo on the first result")
    public void clicks_on_the_moreinfo_on_the_first_result() {
        homePageActions.clickOnMoreInfo();
    }

    @Then("user verifies the following data")
    public void is_presented_with_intended_data(List<String> myData) {
        for (String my : myData) {
            switch (EnumConstant.valueOf(my)) {
                case PHONE_NUMBER:
                    homePageActions.verifyDivPhoneNumberDisplayed();
                    break;
                case DAYS:
                    homePageActions.verifyDivNumberOfDays();
                    break;
                case PRICE:
                    homePageActions.verifyDivDisplayedPrice();
                    break;
                default:
                    throw new IllegalArgumentException(EnumConstant.valueOf(my) + " is unsupported check ");
            }
        }
    }

}
