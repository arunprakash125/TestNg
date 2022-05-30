package org.newframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement txtOrderNum;

	public WebElement getTxtOrderNum() {
		return txtOrderNum;
	}
	public void BookingConfirm(String txtOrderNUm) {
	TypeText(getTxtOrderNum(), txtOrderNUm);
	Click(getTxtOrderNum());

}
	
	}
	
	

	

