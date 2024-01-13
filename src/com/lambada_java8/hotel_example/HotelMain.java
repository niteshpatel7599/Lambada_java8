package com.lambada_java8.hotel_example;

import java.util.Collections;
import java.util.List;

public class HotelMain {

	public static void main(String[] args) {
		HotelService hotelService = new HotelService();
		//Example for lambda
		
//		//Lambda Expression
//		List<Hotel> hotels = hotelService.filterHotels((Hotel hotel)->{
//			return hotel.getPricePerNight() <= 5000;
//		});
//		System.out.println("List of hotels less than or equals to 5000 : "+ hotels);
		
		// More Precise way we can write if have only one line of code
		FilteringConditions lambdaExpression = hotel -> hotel.getPricePerNight() <=5000;
		List<Hotel> hotels = hotelService.filterHotels(lambdaExpression);
		System.out.println("List of hotels less than or equals to 5000 : "+ hotels);
		
	
		//Anonymous class 
//		List<Hotel> fiveStar = hotelService.filterHotels(new FilteringConditions() {
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getHotelType() == HotelType.FIVE_STAR;
//			}
//		});
//		System.out.println("List of hotels less than or equals to 5000 : "+ fiveStar);
//	}
}
}
