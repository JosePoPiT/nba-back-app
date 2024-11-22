package com.servicio.servicio_nba_players_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicio.servicio_nba_players_list.models.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}
