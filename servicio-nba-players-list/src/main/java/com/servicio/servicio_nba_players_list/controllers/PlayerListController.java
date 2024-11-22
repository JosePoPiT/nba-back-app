package com.servicio.servicio_nba_players_list.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.servicio_nba_players_list.models.entity.Player;
import com.servicio.servicio_nba_players_list.services.PlayerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/players")
public class PlayerListController {

  @Autowired
  private PlayerService playerService;

  @GetMapping
  public ResponseEntity<List<Player>> getAllPlayers() {
    List<Player> players = playerService.getAllPlayers();
    return ResponseEntity.ok(players);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
    Optional<Player> player = playerService.getPlayerById(id);
    return player.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }
}
