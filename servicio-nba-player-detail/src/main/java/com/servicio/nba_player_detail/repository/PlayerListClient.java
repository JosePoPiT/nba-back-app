package com.servicio.nba_player_detail.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.servicio.nba_player_detail.models.entity.PlayerListDto;

@FeignClient(name = "servicio-nba-players-list")
public interface PlayerListClient {
  @GetMapping("/players/{id}")
  PlayerListDto getPlayerById(@PathVariable("id") Long id);
}
