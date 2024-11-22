package com.servicio.nba_teams.team_service.repository;

import org.springframework.data.repository.CrudRepository;

import com.servicio.nba_teams.team_service.models.entity.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{
  
}
