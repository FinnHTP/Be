package com.project.backend.service;

import java.util.List;

import com.project.backend.dto.RankAccountDto;
import com.project.backend.dto.RatingDto;

public interface RatingService {
	 	RatingDto createRating(RatingDto ratingDto);
	    RatingDto getRatingById(Long id);
	    Double getAvgRating(Long gameId);
	    RatingDto updateRating(Long id, RatingDto ratingDto);
	    List<RatingDto> getAllRating();
	    void deleteRating(Long id);
	    List<RatingDto> getAllRatingById(Long id);
}
