package org.newframe;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Adactin extends BaseClass {
	
	@BeforeClass
	public void beforeClass() {
		getDrivere();
		loadUrl("http://adactinhotelapp.com/index.php");
		maximize();

	}
	
	@AfterClass
	public void afterClass() {
		closeAllBrowsers();
		

	}
	@Test
	public void SearchHotel() {
		LoginPage loginPage = new LoginPage();
		loginPage.loginPage("arunprakash95", "prakash95");
		//search hotel
		
		SearchHotelPage searchHotelPage = new SearchHotelPage();
		searchHotelPage.SearchHotel("London", "Hotel Sunshine", "Double", "2 - Two", "06/02/2022", "10/02/2022", "2 - Two", "0 - None");
		
	
		
	}
	
	public void SelectHotel() {
		SelectHotelPage selectHotelPage = new SelectHotelPage();
		selectHotelPage.SelectHotel("radiobutton_0");
		

	}
	public void BookHotel() {
		BookHotelPage bookHotelPage = new BookHotelPage();
		bookHotelPage.BookHotel("Arun", "prakash", "chennai", "6565465465465465", "VISA", "December", "2022", "1234");

	}
	public void BookingConfirm() {
		BookingConfirmPage bookingConfirm = new BookingConfirmPage();
		bookingConfirm.BookingConfirm("Order No.    " + "N197YRY9QJ");
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
