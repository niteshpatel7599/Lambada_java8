package com.lambada_java8.hotel_example;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

	List<Hotel> hotels = new ArrayList<>();
	
	public HotelService() {
		hotels.add(new Hotel(20000, 5, HotelType.FIVE_STAR));
		hotels.add(new Hotel(4000, 3, HotelType.THREE_STAR));
		hotels.add(new Hotel(5000, 4, HotelType.FOUR_STAR));
		hotels.add(new Hotel(6000, 4, HotelType.THREE_STAR));
		hotels.add(new Hotel(10000, 3, HotelType.FIVE_STAR));
		hotels.add(new Hotel(5000, 4, HotelType.FOUR_STAR));
	}

	public List<Hotel> filterHotels(FilteringConditions filteringConditions) {
		List<Hotel> filterHotels = new ArrayList<>();
		for (Hotel hotel : hotels) {
			if(filteringConditions.test(hotel))
				filterHotels.add(hotel);
		}
		return filterHotels;
	}

//	
//	public List<Hotel> filterHotelLessThan(int price){
//		List<Hotel> filterHotels = new ArrayList<>();
//		for (Hotel hotel : filterHotels) {
//			if(isHotelLessThan(price, hotel))
//				filterHotels.add(hotel);
//		}
//		return filterHotels;
//	}
//	
//	public List<Hotel> filterHotelWithType(HotelType hotelType){
//		List<Hotel> filterHotels = new ArrayList<>();
//		for (Hotel hotel : filterHotels) {
//			if(isHotelFiveStar(hotel))
//				filterHotels.add(hotel);
//		}
//		return filterHotels;
//	}
//	
//	public List<Hotel> filterHotelWithRating(int  rating){
//		List<Hotel> filterHotels = new ArrayList<>();
//		for (Hotel hotel : filterHotels) {
//			if(isHotelRating(rating,hotel))
//				filterHotels.add(hotel);
//		}
//		return filterHotels;
//	}
	

}
