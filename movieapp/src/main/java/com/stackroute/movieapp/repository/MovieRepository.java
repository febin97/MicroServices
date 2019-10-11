package com.stackroute.movieapp.repository;


import com.stackroute.movieapp.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Integer> {

//    @Query("{ 'movieName' : ?0 }")
    public List<Movie> findMovieByMovieName(@Param("chars") String chars);

}