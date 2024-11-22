package com.servicio.servicio_nba_players_list.services;

import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.servicio_nba_players_list.models.entity.Player;
import com.servicio.servicio_nba_players_list.models.entity.PlayerDTO;
import com.servicio.servicio_nba_players_list.repository.PlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    public PlayerDTO convertToDto(Player player) {
        PlayerDTO playerDto = new PlayerDTO();
        playerDto.setId(player.getId());
        playerDto.setName(player.getName());
        playerDto.setTeam(player.getTeam());
        playerDto.setPosition(player.getPosition());
        playerDto.setHeight(player.getHeight());
        playerDto.setWeight(player.getWeight());
        playerDto.setChampionships(player.getChampionships());
        playerDto.setMvps(player.getMvps());
        playerDto.setDefensivePlayerAward(player.getDefensivePlayerAward());
        playerDto.setHomeTown(player.getHomeTown());
        playerDto.setTeams(player.getTeams());
        playerDto.setAvgPoints(player.getAvgPoints());
        playerDto.setAvgRebounds(player.getAvgRebounds());
        playerDto.setAvgSteals(player.getAvgSteals());
        playerDto.setAvgAssists(player.getAvgAssists());

        if (player.getImage() != null) {
            String base64Image = Base64.getEncoder().encodeToString(player.getImage());
            playerDto.setImageBase64(base64Image);
        }

        return playerDto;
    }

}
