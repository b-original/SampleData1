package com.spring.microservices.rating.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ratings")
public class Rating {

    @Id
    @Column
    private String ratingId;
    @Column
    private String hotelId;
    @Column
    private String userId;
    @Column
    private int rating;
    @Column
    private String feedback;
    @Transient
    private User user;
    @Transient
    private Hotel hotel;
}
