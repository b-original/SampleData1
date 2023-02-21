package com.spring.microservices.rating.controller;

import com.spring.microservices.rating.beans.Rating;
import com.spring.microservices.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingserviceController {

    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> saveRatings(@RequestBody Rating rating){
        Rating rating1=ratingService.SaveRating(rating);

        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @GetMapping("/byUserId/{userId}")
    public ResponseEntity<List<Rating>> findRatingByUserId(@PathVariable String userId){
        List<Rating> ratings=ratingService.getAllRatingsByUser(userId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/byHotelId/{hotelId}")
    public ResponseEntity<List<Rating>> findRatingByHotelId(@PathVariable String hotelId){
        List<Rating> ratings=ratingService.getAllRatingsToHotel(hotelId);
        return ResponseEntity.ok(ratings);
    }

    @GetMapping("/allRatings")
    public ResponseEntity<List<Rating>> findAllRating(){
        List<Rating> ratings=ratingService.getAllRatings();
        return ResponseEntity.ok(ratings);
    }

}
