package com.spring.microservices.rating.services.impl;

import com.spring.microservices.rating.beans.Rating;
import com.spring.microservices.rating.exceptions.ErrorWhileSavingException;
import com.spring.microservices.rating.exceptions.NoDataFoundException;
import com.spring.microservices.rating.exceptions.UnableToFetchException;
import com.spring.microservices.rating.repository.RatingRepository;
import com.spring.microservices.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating SaveRating(Rating rating) throws ErrorWhileSavingException {
        String randomRatingId= UUID.randomUUID().toString();
        rating.setRatingId(randomRatingId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatingsByUser(String userId) throws UnableToFetchException {
        return ratingRepository.getAllRatingsByUser(userId);
    }

    @Override
    public List<Rating> getAllRatings() throws UnableToFetchException {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingsToHotel(String hotelId) throws UnableToFetchException {
        return ratingRepository.getAllRatingsToHotel(hotelId);
    }
}
