package com.stackroute.music.repository;

import com.stackroute.music.domain.Track;
//jpa repo
//import org.springframework.data.jpa.repository.JpaRepository;
//mongo repo

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
//    @Query(value = "SELECT u FROM User u ORDER BY id")
//    @Query(
//            value = "SELECT * FROM Track u WHERE u.id = ?1",
//            nativeQuery = true)
//    Track findbytrackid(int status);
}
