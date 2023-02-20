package com.spring.microservices.hotelservice.repository;

import com.spring.microservices.hotelservice.beans.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository {

    Hotel saveHotelEntity(Hotel hotel);

    Hotel getHotelEntity(String hotelId);

    List<Hotel> getAllHotels();

    Hotel deleteHotel(String hotelId);
}
