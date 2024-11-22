package com.servicio.nba_player_detail.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.nba_player_detail.models.entity.PlayerDetail;


public interface PlayerDetailRepository extends JpaRepository<PlayerDetail, Long> {
  Optional<PlayerDetail> findByPlayerId(Long playerId);
}
