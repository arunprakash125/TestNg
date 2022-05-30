package org.newframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(id = "radiobutton_0")
private WebElement selectHotel;

@FindBy(id = "continue")
private WebElement btnSearch;

public WebElement getSelectHotel() {
	return selectHotel;
}

public WebElement getBtnSearch() {
	return btnSearch;
}

public void SelectHotel(String selectHotel) {
	TypeText(getSelectHotel(), selectHotel);
	Click(getBtnSearch());

}
}
  