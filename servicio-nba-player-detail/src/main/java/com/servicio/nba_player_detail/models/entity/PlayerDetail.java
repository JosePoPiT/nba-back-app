package com.servicio.nba_player_detail.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_details")
public class PlayerDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long playerId;

  private String curiosities;
  private LocalDate birthDate;
  private Boolean retired;
  private String college;
  private String highSchool;
  private Long totalPoints;
  private Long totalRebounds;
  private Long totalAssists;
  private Long totalSteals;
  private Long totalBlocks;
  private Long totalThreePointers;
  private Long playoffPoints;
  private Long playoffRebounds;
  private Long playoffAssists;
  private Integer mvpTitles;
  private Integer defensivePlayerAwards;
  private Integer allStarSelections;
  private String olympicMedals;
  private String retiredJerseyTeam;
  private String notableInjuries;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Long playerId) {
    this.playerId = playerId;
  }

  public String getCuriosities() {
    return curiosities;
  }

  public void setCuriosities(String curiosities) {
    this.curiosities = curiosities;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Boolean getRetired() {
    return retired;
  }

  public void setRetired(Boolean retired) {
    this.retired = retired;
  }

  public String getCollege() {
    return college;
  }

  public void setCollege(String college) {
    this.college = college;
  }

  public String getHighSchool() {
    return highSchool;
  }

  public void setHighSchool(String highSchool) {
    this.highSchool = highSchool;
  }

  public Long getTotalPoints() {
    return totalPoints;
  }

  public void setTotalPoints(Long totalPoints) {
    this.totalPoints = totalPoints;
  }

  public Long getTotalRebounds() {
    return totalRebounds;
  }

  public void setTotalRebounds(Long totalRebounds) {
    this.totalRebounds = totalRebounds;
  }

  public Long getTotalAssists() {
    return totalAssists;
  }

  public void setTotalAssists(Long totalAssists) {
    this.totalAssists = totalAssists;
  }

  public Long getTotalSteals() {
    return totalSteals;
  }

  public void setTotalSteals(Long totalSteals) {
    this.totalSteals = totalSteals;
  }

  public Long getTotalBlocks() {
    return totalBlocks;
  }

  public void setTotalBlocks(Long totalBlocks) {
    this.totalBlocks = totalBlocks;
  }

  public Long getTotalThreePointers() {
    return totalThreePointers;
  }

  public void setTotalThreePointers(Long totalThreePointers) {
    this.totalThreePointers = totalThreePointers;
  }

  public Long getPlayoffPoints() {
    return playoffPoints;
  }

  public void setPlayoffPoints(Long playoffPoints) {
    this.playoffPoints = playoffPoints;
  }

  public Long getPlayoffRebounds() {
    return playoffRebounds;
  }

  public void setPlayoffRebounds(Long playoffRebounds) {
    this.playoffRebounds = playoffRebounds;
  }

  public Long getPlayoffAssists() {
    return playoffAssists;
  }

  public void setPlayoffAssists(Long playoffAssists) {
    this.playoffAssists = playoffAssists;
  }

  public Integer getMvpTitles() {
    return mvpTitles;
  }

  public void setMvpTitles(Integer mvpTitles) {
    this.mvpTitles = mvpTitles;
  }

  public Integer getDefensivePlayerAwards() {
    return defensivePlayerAwards;
  }

  public void setDefensivePlayerAwards(Integer defensivePlayerAwards) {
    this.defensivePlayerAwards = defensivePlayerAwards;
  }

  public Integer getAllStarSelections() {
    return allStarSelections;
  }

  public void setAllStarSelections(Integer allStarSelections) {
    this.allStarSelections = allStarSelections;
  }

  public String getOlympicMedals() {
    return olympicMedals;
  }

  public void setOlympicMedals(String olympicMedals) {
    this.olympicMedals = olympicMedals;
  }

  public String getRetiredJerseyTeams() {
    return retiredJerseyTeam;
  }

  public void setRetiredJerseyTeams(String retiredJerseyTeams) {
    this.retiredJerseyTeam = retiredJerseyTeams;
  }

  public String getNotableInjuries() {
    return notableInjuries;
  }

  public void setNotableInjuries(String notableInjuries) {
    this.notableInjuries = notableInjuries;
  }

}
