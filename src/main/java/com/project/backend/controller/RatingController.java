package com.project.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.backend.dto.RankAccountDto;
import com.project.backend.dto.RatingDto;
import com.project.backend.service.RankAccountService;
import com.project.backend.service.RatingService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/rating")
@SecurityRequirement(name = "bearerAuth")
public class RatingController {
	private RatingService ratingService;

    @PostMapping
    public ResponseEntity<RatingDto> createRating(@RequestBody RatingDto ratingDto){
       RatingDto savedRatingDto = ratingService.createRating(ratingDto);
        return new ResponseEntity<>(savedRatingDto, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<RatingDto> getRatingById(@PathVariable("id") Long id){
        RatingDto ratingDto = ratingService.getRatingById(id);
        return ResponseEntity.ok(ratingDto);
    }

    @GetMapping
    public ResponseEntity<List<RatingDto>> getAllRating(){
        List<RatingDto> ratingDtos = ratingService.getAllRating();
        return ResponseEntity.ok(ratingDtos);
    }
    
    @GetMapping("{id}/games")
    public ResponseEntity<List<RatingDto>> getAllRatingById(@PathVariable("id") Long id){
    	List<RatingDto> ratingDtos = ratingService.getAllRatingById(id);
    	return ResponseEntity.ok(ratingDtos);
    }
    
    @GetMapping("{id}/avg")
    public ResponseEntity<Double> getAvgRating(@PathVariable("id") Long id){
    	Double avg = ratingService.getAvgRating(id);
    	return ResponseEntity.ok(avg);
    }

    @PutMapping("{id}")
    public ResponseEntity<RatingDto> updateRating(@PathVariable("id") Long id, @RequestBody RatingDto ratingDto){
        RatingDto savedRatingDto = ratingService.updateRating(id, ratingDto);
        return new ResponseEntity<>(savedRatingDto, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteRatingById(@PathVariable("id") Long id){
        ratingService.deleteRating(id);
        return ResponseEntity.ok("Rating deleted successfully");
    }
}
