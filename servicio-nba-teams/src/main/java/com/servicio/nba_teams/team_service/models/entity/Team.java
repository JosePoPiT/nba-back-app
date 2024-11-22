package com.servicio.nba_teams.team_service.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "teams")
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String city;
  private String stadium;
  private Integer foundedYear;
  private Integer nbaChampionships;
  private Integer conferenceTitles;
  private Integer playoffAppearances;
  private String headCoach;
  private String owner;
  private Integer capacity;
  private String notablePlayers;
  private String color;

  @Lob
  private byte[] logo;

  public byte[] getLogo() {
    return logo;
  }

  public void setLogo(byte[] logo) {
    this.logo = logo;
  }

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

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStadium() {
    return stadium;
  }

  public void setStadium(String stadium) {
    this.stadium = stadium;
  }

  public Integer getFoundedYear() {
    return foundedYear;
  }

  public void setFoundedYear(Integer foundedYear) {
    this.foundedYear = foundedYear;
  }

  public Integer getNbaChampionships() {
    return nbaChampionships;
  }

  public void setNbaChampionships(Integer nbaChampionships) {
    this.nbaChampionships = nbaChampionships;
  }

  public Integer getConferenceTitles() {
    return conferenceTitles;
  }

  public void setConferenceTitles(Integer conferenceTitles) {
    this.conferenceTitles = conferenceTitles;
  }

  public Integer getPlayoffAppearances() {
    return playoffAppearances;
  }

  public void setPlayoffAppearances(Integer playoffAppearances) {
    this.playoffAppearances = playoffAppearances;
  }

  public String getHeadCoach() {
    return headCoach;
  }

  public void setHeadCoach(String headCoach) {
    this.headCoach = headCoach;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public String getNotablePlayers() {
    return notablePlayers;
  }

  public void setNotablePlayers(String notablePlayers) {
    this.notablePlayers = notablePlayers;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
