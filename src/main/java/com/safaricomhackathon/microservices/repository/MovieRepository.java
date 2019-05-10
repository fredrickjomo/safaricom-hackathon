package com.safaricomhackathon.microservices.repository;

import com.safaricomhackathon.microservices.model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel,Long> {
}
