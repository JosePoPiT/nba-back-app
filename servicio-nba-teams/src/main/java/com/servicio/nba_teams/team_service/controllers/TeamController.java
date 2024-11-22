package com.servicio.nba_teams.team_service.controllers;

import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.nba_teams.team_service.models.entity.Team;
import com.servicio.nba_teams.team_service.models.entity.TeamDTO;
import com.servicio.nba_teams.team_service.services.TeamService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/teams")
public class TeamController {

  @Autowired
  private TeamService teamService;

  // @GetMapping
  // public List<Team> getAllTeams() {
  // return teamService.getAllTeams();
  // }

  // @GetMapping("/{id}")
  // public Team getTeamById(@PathVariable Long id) {
  // return teamService.getTeamById(id);
  // }

  @GetMapping
  public List<TeamDTO> getAllTeams() {
    List<Team> teams = teamService.getAllTeams();
    return teams.stream().map(this::convertToDto).collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  public TeamDTO getTeamById(@PathVariable Long id) {
    Team team = teamService.getTeamById(id);
    return convertToDto(team);
  }

  private TeamDTO convertToDto(Team team) {
    TeamDTO TeamDTO = new TeamDTO();
    TeamDTO.setId(team.getId());
    TeamDTO.setName(team.getName());
    TeamDTO.setCity(team.getCity());
    TeamDTO.setStadium(team.getStadium());
    TeamDTO.setFoundedYear(team.getFoundedYear());
    TeamDTO.setNbaChampionships(team.getNbaChampionships());
    TeamDTO.setConferenceTitles(team.getConferenceTitles());
    TeamDTO.setPlayoffAppearances(team.getPlayoffAppearances());
    TeamDTO.setHeadCoach(team.getHeadCoach());
    TeamDTO.setOwner(team.getOwner());
    TeamDTO.setCapacity(team.getCapacity());
    TeamDTO.setNotablePlayers(team.getNotablePlayers());
    TeamDTO.setColor(team.getColor());

    if (team.getLogo() != null) {
      String base64Logo = Base64.getEncoder().encodeToString(team.getLogo());
      TeamDTO.setLogo(base64Logo);
    }

    return TeamDTO;
  }

}
