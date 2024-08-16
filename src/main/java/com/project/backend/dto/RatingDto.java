package com.project.backend.dto;

import java.time.LocalDate;

import com.project.backend.entity.Account;
import com.project.backend.entity.Game;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RatingDto {
	private Long id;
	private Double rating;
	private String content;
	private LocalDate date = LocalDate.now();
	private Game game;
	private Account account;
}
