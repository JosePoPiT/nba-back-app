package com.servicio.nba_teams.team_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.nba_teams.team_service.models.entity.Team;
import com.servicio.nba_teams.team_service.repository.TeamRepository;

@Service
public class TeamService {
  @Autowired
  private TeamRepository teamRepository;

  public List<Team> getAllTeams() {
    return (List<Team>) teamRepository.findAll();
  }

  public Team getTeamById(Long id) {
    return teamRepository.findById(id).orElse(null);
  }
}
