package com.project.backend.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rating")
    private Double rating;
    @Column(name = "content")
    private String content;
    @Column(name = "date")
    private LocalDate date = LocalDate.now();
    @ManyToOne @JoinColumn(name = "gameId")
    private Game game;
    @ManyToOne @JoinColumn(name = "accountId")
    private Account account;
}
