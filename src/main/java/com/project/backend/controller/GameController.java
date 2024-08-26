package com.project.backend.controller;

import com.project.backend.dto.CouponDto;
import com.project.backend.dto.GameDto;
import com.project.backend.dto.GameTypeDto;
import com.project.backend.entity.Coupon;
import com.project.backend.entity.Game;
import com.project.backend.entity.GameType;
import com.project.backend.mapper.GameMapper;
import com.project.backend.mapper.GameTypeMapper;
import com.project.backend.service.GameService;
import com.project.backend.service.GameTypeService;

import io.jsonwebtoken.io.IOException;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/games")
@SecurityRequirement(name = "bearerAuth")
public class GameController {
    private GameService gameService;
private GameTypeService gameTypeService;
    
//    @CrossOrigin(origins = "http://localhost:3000")
//    @PostMapping
//    public ResponseEntity<GameDto> createGame(@RequestBody GameDto game){
//        GameDto savedGame = gameService.createGame(game);
//        return new ResponseEntity<>(savedGame, HttpStatus.CREATED);
//    }
    
//@Autowired
//private CouponRepository couponRepository;

//@CrossOrigin(origins = "http://localhost:3000")
//@GetMapping("/coupons")
//public ResponseEntity<List<CouponDto>> getCoupons() {
//    List<Coupon> coupons = couponRepository.findAll();
//    List<CouponDto> couponDtos = coupons.stream()
//                                         .map(coupon -> new CouponDto(coupon.getId(), coupon.getCoupon(), coupon.getValue()))
//                                         .collect(Collectors.toList());
//    return ResponseEntity.ok(couponDtos);
//}

@CrossOrigin(origins = "http://localhost:3000")
@PostMapping("")
public ResponseEntity<GameDto> createGame(
        @RequestParam(value = "name", required = false) String name,
        @RequestParam("description") String description,
        @RequestParam("priceGame") Double priceGame,
        @RequestParam("status") Boolean status,
        @RequestParam("releaseDate") String releaseDate,
        @RequestParam(value = "version", required = false) String version,
        @RequestParam("gameType") Long gameTypeId,
        @RequestParam(value = "couponId", required = false) Long couponId, 
        @RequestParam("image") MultipartFile image) throws java.io.IOException {
    
    GameDto gameDto = new GameDto();
    gameDto.setName(name);
    gameDto.setDescription(description);
    gameDto.setPriceGame(priceGame);
    gameDto.setStatus(status);
    gameDto.setReleaseDate(LocalDate.parse(releaseDate));
    gameDto.setVersion(version);

   
    GameTypeDto gameTypeDto = gameTypeService.getGameTypeById(gameTypeId);
    GameType gameType = GameTypeMapper.mapToGameType(gameTypeDto);
    gameDto.setGameType(gameType);

    Coupon coupon = new Coupon();
        gameDto.setCoupon(coupon);

    // Xử lý ảnh nếu có
    if (image != null && !image.isEmpty()) {
        try {
            String imageName = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
            String imagePath = "C:/Users/Admin/Desktop/UpdateCode/my-app/public/image/games/" + imageName;
            File destFile = new File(imagePath);
            image.transferTo(destFile);
            gameDto.setImage(imageName);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Lưu game
    GameDto savedGame = gameService.createGame(gameDto);
    return new ResponseEntity<>(savedGame, HttpStatus.CREATED);
}





//@PostMapping("/{gameId}/image")
//public ResponseEntity<GameDto> uploadGameImage(
//        @PathVariable Long gameId,
//        @RequestParam("image") MultipartFile image) throws java.io.IOException {
//
//    GameDto gameDto = gameService.getGameById(gameId); // Lấy thông tin game hiện tại
//
//    try {
//        // Chuyển đổi MultipartFile sang byte[]
//        gameDto.setImage(image.getBytes());
//    } catch (IOException e) {
//        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    GameDto updatedGame = gameService.updateGame(gameId, gameDto);
//    return new ResponseEntity<>(updatedGame, HttpStatus.OK);
//}




    
    @GetMapping("{id}")
    public ResponseEntity<GameDto> getGameById(@PathVariable("id") Long gameId){
        GameDto gameDto = gameService.getGameById(gameId);
        return ResponseEntity.ok(gameDto);
    }
    @GetMapping
    public ResponseEntity<List<GameDto>> getAll(){
        List<GameDto> games = gameService.getAllGame();
        return ResponseEntity.ok(games);
    }
    @GetMapping("get8Game")
    public ResponseEntity<List<GameDto>> get8Games(){
        List<GameDto> games = gameService.get8Game();
        return ResponseEntity.ok(games);
    }

    @GetMapping("/profit")
    public Map<String, Double> getRevenueData() {
        return gameService.getMonthlyStatistics();
    }
    
    
    
    @PutMapping("{id}")
    public ResponseEntity<GameDto> updateGame(
            @PathVariable("id") Long gameId,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam("description") String description,
            @RequestParam("priceGame") Double priceGame,
            @RequestParam("status") Boolean status,
            @RequestParam("releaseDate") String releaseDate,
            @RequestParam( "version") String version,
            @RequestParam(value = "couponId", required = false) Long couponId, 
            @RequestParam("gameType") Long gameTypeId,
            @RequestParam(value = "image", required = false) MultipartFile image) throws IllegalStateException, java.io.IOException 
    {
    	  System.out.println("Name: " + name);
    	    System.out.println("Description: " + description);
    	    System.out.println("PriceGame: " + priceGame);
    	    System.out.println("Status: " + status); 
    	    System.out.println("ReleaseDate: " + releaseDate);
    	    System.out.println("Version: " + version);
    	    System.out.println("GameTypeId: " + gameTypeId);
        try {
            GameDto existingGame = gameService.getGameById(gameId);

            existingGame.setName(name);
            existingGame.setDescription(description);
            existingGame.setPriceGame(priceGame);
            existingGame.setStatus(status);
            existingGame.setReleaseDate(LocalDate.parse(releaseDate));
            existingGame.setVersion(version);

            if (couponId != null) {
              Coupon coupon = new Coupon();
                existingGame.setCoupon(coupon);
            }
            
            GameTypeDto gameTypeDto = gameTypeService.getGameTypeById(gameTypeId);
            existingGame.setGameType(GameTypeMapper.mapToGameType(gameTypeDto));

            if (image != null && !image.isEmpty()) {
                // Xoa anh cu
                String oldImagePath = "C:/Users/Admin/Desktop/UpdateCode/my-app/public/image/games/" + existingGame.getImage();
                File oldImageFile = new File(oldImagePath);
                if (oldImageFile.exists()) {
                    oldImageFile.delete();
                }

                // Luu 
                String imageName = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
                String imagePath = "C:/Users/Admin/Desktop/UpdateCode/my-app/public/image/games/" + imageName;
                File destFile = new File(imagePath);
                image.transferTo(destFile);

            
                existingGame.setImage(imageName);
            }

            GameDto updatedGame = gameService.updateGame(gameId, existingGame);
            return ResponseEntity.ok(updatedGame);

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    
    
//    @PostMapping("/{id}/image")
//    public ResponseEntity<GameDto> uploadGameImage2(
//            @PathVariable("id") Long gameId,
//            @RequestParam("gameImage") MultipartFile gameImage) throws java.io.IOException {
//
//        GameDto game = gameService.getGameById(gameId);
//        if (game == null) {
//            return ResponseEntity.notFound().build();
//        }
//
//        try {
//            game.setImage(gameImage.getBytes());
//            gameService.createGame(game);  // Hoặc hàm nào đó để lưu Game
//            return ResponseEntity.ok(game);
//        } catch (IOException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//    
    
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGame(@PathVariable("id") Long gameId){
        gameService.deleteGame(gameId);
        return ResponseEntity.ok("Game deleted Successfully");
    }
}
