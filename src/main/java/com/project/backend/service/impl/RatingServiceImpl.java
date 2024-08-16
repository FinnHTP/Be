package com.project.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.backend.dto.RatingDto;
import com.project.backend.entity.Rating;
import com.project.backend.exception.ResourceDuplicateException;
import com.project.backend.exception.ResourceNotFoundException;
import com.project.backend.mapper.RatingMapper;
import com.project.backend.repository.RankAccountRepository;
import com.project.backend.repository.RatingRepository;
import com.project.backend.service.RatingService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RatingServiceImpl implements RatingService{
	private RatingRepository ratingRepository;
	
	
	@Override
	public RatingDto createRating(RatingDto ratingDto) {
		Rating rating = RatingMapper.MapToEntity(ratingDto);
		if(ratingRepository.isExist(rating.getGame().getId(), rating.getAccount().getId()) == null){
			Rating savedRating = ratingRepository.save(rating);
		}else {
			throw new ResourceDuplicateException("Your Rating can't created because you Rated before");
		}
		
		return RatingMapper.MaptoDto(rating);
	}

	@Override
	public RatingDto getRatingById(Long id) {
		// TODO Auto-generated method stub
		Rating rating = ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating not found with given id " + id));
		return RatingMapper.MaptoDto(rating);
	}

	@Override
	public RatingDto updateRating(Long id, RatingDto ratingDto) {
		// TODO Auto-generated method stub
		Rating rating = ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating not found with given id " + id));
		rating.setRating(ratingDto.getRating());
		rating.setContent(ratingDto.getContent());
		rating.setAccount(ratingDto.getAccount());
		rating.setGame(ratingDto.getGame());
		Rating savedRating = ratingRepository.save(rating);
		return RatingMapper.MaptoDto(savedRating);
	}

	@Override
	public List<RatingDto> getAllRating() {
		// TODO Auto-generated method stub
		List<Rating> ratings = ratingRepository.findAll();
		return ratings.stream().map((rating) -> RatingMapper.MaptoDto(rating)).toList();
	}

	@Override
	public void deleteRating(Long id) {
		// TODO Auto-generated method stub
		Rating rating = ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating not found with given id " + id));
		ratingRepository.delete(rating);
	}

	@Override
	public Double getAvgRating(Long gameId) {
		// TODO Auto-generated method stub
		Double avgRating = ratingRepository.getAvgRating(gameId);
		return avgRating;
	}

	@Override
	public List<RatingDto> getAllRatingById(Long id) {
		// TODO Auto-generated method stub
		List<Rating> ratings = ratingRepository.getAllRatingById(id);
		return ratings.stream().map((rating) -> RatingMapper.MaptoDto(rating)).toList();
	}

}
