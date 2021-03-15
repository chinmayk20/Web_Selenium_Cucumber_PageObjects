package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageLocators.SearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {

	SearchPageLocators SearchPageLocators=null;
	public CarSearchPageActions()
	{
		//this.driver=driver;
		this.SearchPageLocators= new SearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), SearchPageLocators);
	}

	public void selectCarMaker(String carBrand)
	{
		Select selectCarMaker=new Select(SearchPageLocators.carMakerDropDown);
		selectCarMaker.selectByVisibleText("BMW");
		
	}
	
	public void selectCarModel(String carModel)
	{
		Select selectCarModel=new Select(SearchPageLocators.selectModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
	public void selectLocation(String location)
	{
		Select selectLocation=new Select(SearchPageLocators.selectLocation);
		selectLocation.selectByVisibleText(location);
	}
	public void selectPrice(String price)
	{
		Select selectPrice=new Select(SearchPageLocators.priceList);
		selectPrice.selectByVisibleText(price);
	}
	
	public void clickOnFindMyNextCarButton()
	{
		SearchPageLocators.findMyNextCarButton.click();
		
	}
	
	
	
}
