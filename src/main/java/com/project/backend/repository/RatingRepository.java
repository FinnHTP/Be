package com.project.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.backend.dto.RatingDto;
import com.project.backend.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long>{
	@Query(value = "SELECT AVG(r.rating) from ratings r where game_id = :gameId", nativeQuery = true)
	public Double getAvgRating(@Param("gameId") Long gameId);
	
	@Query(value = "SELECT * from ratings r where game_id = :gameId and account_id = :accountId", nativeQuery = true)
	public RatingDto isExist(@Param("gameId") Long gameId , @Param("accountId") Long accountId);

	@Query(value = "SELECT * from ratings r where game_id = :gameId", nativeQuery = true)
	public List<Rating> getAllRatingById(@Param("gameId") Long id);
}
