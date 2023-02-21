package com.spring.microservices.rating.repository.impl;

import com.spring.microservices.rating.beans.Hotel;
import com.spring.microservices.rating.beans.Rating;
import com.spring.microservices.rating.repository.RatingRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RatingRepositoryImpl {

   /* private static Map<String,Rating> ratingsMap= new HashMap<>();

    @Override
    public Rating SaveRating(Rating rating) {
        return save(rating);
    }

    @Override
    public List<Rating> getAllRatingsByUser(String userId) {
        return ratingsMap.values().stream().filter(i->i.getUserId().equals(userId)).collect(Collectors.toList());
    }

    @Override
    public List<Rating> getAllRatings() {
        return findAll();
    }

    @Override
    public List<Rating> getAllRatingsToHotel(String hotelId) {
        return ratingsMap.values().stream().filter(i->i.getHotelId().equals(hotelId)).collect(Collectors.toList());
    }*/
}
