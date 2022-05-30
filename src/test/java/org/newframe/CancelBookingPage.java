package org.newframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "ids[]")
	private WebElement checkBox;
	
	@FindBy(name = "cancelall")
	private WebElement cancelSelect;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelSelect() {
		return cancelSelect;
	}
	
	public void CancelBooking(String checkbox) {
		TypeText(getCheckBox(), checkbox);
		Click(getCancelSelect());

	}
	

}
