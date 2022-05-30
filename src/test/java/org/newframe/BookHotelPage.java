package org.newframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass{
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num")
	private WebElement txtCreditCardNum;
	
	@FindBy(id = "cc_type")
	private WebElement dDnCreditCardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement dDnExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement dDNExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNum;
	
	@FindBy(id = "book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNum() {
		return txtCreditCardNum;
	}

	public WebElement getdDnCreditCardType() {
		return dDnCreditCardType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDNExpYear() {
		return dDNExpYear;
	}

	public WebElement getTxtCvvNum() {
		return txtCvvNum;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void BookHotel(String firstName, String lastName, String address, String creditNum,
			                String creditCardType, String expMonth , String expYear, 
			                String cvvNum ) {
		TypeText(getTxtFirstName(), firstName);
		TypeText(getTxtLastName(), lastName);
		TypeText(getTxtCreditCardNum(), creditNum);
		TypeText(getdDnCreditCardType(), creditCardType);
		TypeText(getdDnExpMonth(), expMonth);
		TypeText(getdDNExpYear(), expYear);
		TypeText(getTxtCvvNum(), cvvNum);
		Click(getBtnBookNow());
		
	
	}
	
	

	}

