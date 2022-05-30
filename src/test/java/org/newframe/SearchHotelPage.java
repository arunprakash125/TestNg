package org.newframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotel;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRoom;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultPerRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public void setdDnLocation(WebElement dDnLocation) {
		this.dDnLocation = dDnLocation;
	}

	public void setdDnHotel(WebElement dDnHotel) {
		this.dDnHotel = dDnHotel;
	}

	public void setdDnRoomType(WebElement dDnRoomType) {
		this.dDnRoomType = dDnRoomType;
	}

	public void setdDnNoOfRoom(WebElement dDnNoOfRoom) {
		this.dDnNoOfRoom = dDnNoOfRoom;
	}

	public void setTxtCheckInDate(WebElement txtCheckInDate) {
		this.txtCheckInDate = txtCheckInDate;
	}

	public void setTxtCheckOutDate(WebElement txtCheckOutDate) {
		this.txtCheckOutDate = txtCheckOutDate;
	}

	public void setdDnAdultPerRoom(WebElement dDnAdultPerRoom) {
		this.dDnAdultPerRoom = dDnAdultPerRoom;
	}

	public void setdDnChildrenPerRoom(WebElement dDnChildrenPerRoom) {
		this.dDnChildrenPerRoom = dDnChildrenPerRoom;
	}

	public void setBtnSearch(WebElement btnSearch) {
		this.btnSearch = btnSearch;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}
	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}
	public WebElement getdDnNoOfRoom() {
		return dDnNoOfRoom;
	}
	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}
	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}
	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void SearchHotel(String location , String hotels, String roomType, String noOfRooms, String checkInDtate,
			String checkOutDate, String adultPerRoom, String childrenPerRoom) {

		selectByText(getdDnLocation(), location);
		selectByText(getdDnHotel(), hotels);
		selectByText(getdDnNoOfRoom(), noOfRooms);
		selectByText(getTxtCheckInDate(), checkInDtate);
		selectByText(getTxtCheckOutDate(), checkOutDate);
		selectByText(getdDnAdultPerRoom(), adultPerRoom);
		selectByText(getdDnChildrenPerRoom(), childrenPerRoom);
		Click(getBtnSearch());

	}

}

