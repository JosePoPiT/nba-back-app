package com.servicio.nba_player_detail.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.nba_player_detail.models.entity.PlayerDetail;
import com.servicio.nba_player_detail.services.PlayerDetailService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/player-detail")
public class PlayerDetailController {
  @Autowired
  private PlayerDetailService playerDetailService;


  @GetMapping("/{id}")
    public ResponseEntity<PlayerDetail> getPlayerDetails(@PathVariable Long id) {
        Optional<PlayerDetail> playerDetail = playerDetailService.getPlayerDetails(id);
        return playerDetail.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
