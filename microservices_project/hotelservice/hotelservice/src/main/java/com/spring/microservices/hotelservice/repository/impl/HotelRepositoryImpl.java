package com.spring.microservices.hotelservice.repository.impl;

import com.spring.microservices.hotelservice.beans.Hotel;
import com.spring.microservices.hotelservice.repository.HotelRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class HotelRepositoryImpl implements HotelRepository {

    private static Map<String,Hotel> hotelList= new HashMap<>();

    @Override
    public Hotel saveHotelEntity(Hotel hotel) {
        System.out.println(hotel.getHotelName()+" "+hotel.getHotelId());
        return hotelList.put(hotel.getHotelId(),hotel);
    }

    @Override
    public Hotel getHotelEntity(String hotelId) {
        return hotelList.get(hotelId);
    }

    @Override
    public ArrayList<Hotel> getAllHotels() {
        return (ArrayList<Hotel>) hotelList.values().stream().collect(Collectors.toList());
    }

    @Override
    public Hotel deleteHotel(String hotelId) {
        return hotelList.remove(hotelId);
    }
}
