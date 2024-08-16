package com.project.backend.mapper;

import com.project.backend.dto.RatingDto;
import com.project.backend.entity.Rating;

public class RatingMapper {
	public static RatingDto MaptoDto(Rating rating) {
		return new RatingDto(rating.getId(), rating.getRating(),rating.getContent(),rating.getDate(),rating.getGame(),rating.getAccount());
	}
	public static Rating MapToEntity(RatingDto ratingDto) {
		return new Rating(ratingDto.getId(), ratingDto.getRating(),ratingDto.getContent(),ratingDto.getDate(), ratingDto.getGame(), ratingDto.getAccount());
	}
}
