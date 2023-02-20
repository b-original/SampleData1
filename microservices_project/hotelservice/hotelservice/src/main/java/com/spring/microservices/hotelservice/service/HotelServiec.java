package com.spring.microservices.hotelservice.service;

import com.spring.microservices.hotelservice.beans.Hotel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface HotelServiec {

    Hotel saveHotelEntity(Hotel hotel);

    Hotel getHotelEntity(String hotelId);

    List<Hotel> getAllHotels();

    Hotel deleteHotel(String hotelId);
}
