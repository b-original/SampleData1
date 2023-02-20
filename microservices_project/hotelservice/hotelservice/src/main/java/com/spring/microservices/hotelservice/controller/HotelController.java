package com.spring.microservices.hotelservice.controller;

import com.spring.microservices.hotelservice.beans.Hotel;
import com.spring.microservices.hotelservice.service.HotelServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    HotelServiec services;

    @PostMapping
    public ResponseEntity<Hotel> saveHotelEntity(@RequestBody Hotel hotel){
        System.out.println(hotel.getHotelName()+" "+hotel.getHotelId());
        Hotel hotel1=services.saveHotelEntity(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }


    @GetMapping("/id/{hotelId}")
    public ResponseEntity<Hotel> getHotelEntity(@PathVariable String hotelId) {
        Hotel hotel=services.getHotelEntity(hotelId);
        return ResponseEntity.ok(hotel);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels()  {
        List<Hotel> hotels= services.getAllHotels();
        return ResponseEntity.ok(hotels);
    }

    @DeleteMapping("/deletehotel/{hotelId}")
    public ResponseEntity<Hotel> deleteHotel(@PathVariable String hotelId) {
        Hotel hotel=services.deleteHotel(hotelId);
        return ResponseEntity.ok(hotel);
    }

}
