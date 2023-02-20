package com.spring.microservices.hotelservice.service.impl;

import com.spring.microservices.hotelservice.beans.Hotel;
import com.spring.microservices.hotelservice.exceptions.ErrorWhileSavingException;
import com.spring.microservices.hotelservice.exceptions.NoDataFoundException;
import com.spring.microservices.hotelservice.exceptions.UnableToFetchException;
import com.spring.microservices.hotelservice.repository.HotelRepository;
import com.spring.microservices.hotelservice.service.HotelServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelServiec {

    @Autowired
    HotelRepository hotelRepo;
    @Override
    public Hotel saveHotelEntity(Hotel hotel) throws ErrorWhileSavingException {
        String randomUserId = UUID.randomUUID().toString();
        hotel.setHotelId(randomUserId);
        return hotelRepo.saveHotelEntity(hotel);
    }

    @Override
    public Hotel getHotelEntity(String hotelId)  throws UnableToFetchException {
        return hotelRepo.getHotelEntity(hotelId);
    }

    @Override
    public List<Hotel> getAllHotels() throws NoDataFoundException {
        return hotelRepo.getAllHotels();
    }

    @Override
    public Hotel deleteHotel(String hotelId)throws NoDataFoundException {
        return hotelRepo.deleteHotel(hotelId);
    }
}
