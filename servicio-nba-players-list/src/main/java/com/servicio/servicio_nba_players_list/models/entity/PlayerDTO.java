package com.servicio.servicio_nba_players_list.models.entity;

import java.util.List;

public class PlayerDTO {
  private Long id;
  private String name;
  private String team;
  private String position;
  private String height;
  private String weight;
  private String imageBase64;
  private int championships;
  private int mvps;
  private int defensivePlayerAward;
  private String homeTown;
  private List<String> teams;
  private double avgPoints;
  private double avgRebounds;
  private double avgSteals;
  private double avgAssists;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getImageBase64() {
    return imageBase64;
  }

  public void setImageBase64(String imageBase64) {
    this.imageBase64 = imageBase64;
  }

  public int getChampionships() {
    return championships;
  }

  public void setChampionships(int championships) {
    this.championships = championships;
  }

  public int getMvps() {
    return mvps;
  }

  public void setMvps(int mvps) {
    this.mvps = mvps;
  }

  public int getDefensivePlayerAward() {
    return defensivePlayerAward;
  }

  public void setDefensivePlayerAward(int defensivePlayerAward) {
    this.defensivePlayerAward = defensivePlayerAward;
  }

  public String getHomeTown() {
    return homeTown;
  }

  public void setHomeTown(String homeTown) {
    this.homeTown = homeTown;
  }

  public List<String> getTeams() {
    return teams;
  }

  public void setTeams(List<String> teams) {
    this.teams = teams;
  }

  public double getAvgPoints() {
    return avgPoints;
  }

  public void setAvgPoints(double avgPoints) {
    this.avgPoints = avgPoints;
  }

  public double getAvgRebounds() {
    return avgRebounds;
  }

  public void setAvgRebounds(double avgRebounds) {
    this.avgRebounds = avgRebounds;
  }

  public double getAvgSteals() {
    return avgSteals;
  }

  public void setAvgSteals(double avgSteals) {
    this.avgSteals = avgSteals;
  }

  public double getAvgAssists() {
    return avgAssists;
  }

  public void setAvgAssists(double avgAssists) {
    this.avgAssists = avgAssists;
  }

}
