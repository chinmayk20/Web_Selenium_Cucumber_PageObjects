package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.SeleniumDriver;

import java.util.List;

public class Sports {

    @Given("I am on the BBC homepgae")
    public void i_am_on_the_homepgae() {
        SeleniumDriver.openPage("https://www.bbc.co.uk");
    }

    @Given("I move to the menu")
    public void i_move_to_teh_menu(List<String> list) {
        System.out.println(list.get(0));
    }

    @Given("I click on the Sports button")
    public void i_click_on_the_sports_button() {

    }

    @Then("I Should see the Sports page")
    public void i_should_see_the_sports_page() {

    }


}
