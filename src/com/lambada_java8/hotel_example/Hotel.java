package com.lambada_java8.hotel_example;

public class Hotel {

	private int pricePerNight;
	private int rating;
	private HotelType hotelType;
	
	public Hotel(int pricePerNight, int rating, HotelType hotelType) {
		super();
		this.pricePerNight = pricePerNight;
		this.rating = rating;
		this.hotelType = hotelType;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public HotelType getHotelType() {
		return hotelType;
	}

	public void setHotelType(HotelType hotelType) {
		this.hotelType = hotelType;
	}
	
	
}
