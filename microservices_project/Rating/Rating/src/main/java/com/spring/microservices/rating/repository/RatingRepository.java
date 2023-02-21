package com.spring.microservices.rating.repository;

import com.spring.microservices.rating.beans.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating,String> {


    @Query("Select r from Rating r where r.userId=?1 ")
    List<Rating> getAllRatingsByUser(String userId);

    @Query("Select r from Rating r where r.hotelId=?1 ")
    List<Rating> getAllRatingsToHotel(String hotelId);

}
