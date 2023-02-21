package com.spring.microservices.rating.services;

import com.spring.microservices.rating.beans.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    Rating SaveRating(Rating rating);

    List<Rating> getAllRatingsByUser(String userId);

    List<Rating> getAllRatings ();

    List<Rating> getAllRatingsToHotel(String hotelId);

}
