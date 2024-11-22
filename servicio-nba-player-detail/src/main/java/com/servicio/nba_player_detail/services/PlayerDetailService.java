package com.servicio.nba_player_detail.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.servicio.nba_player_detail.models.entity.PlayerDetail;
import com.servicio.nba_player_detail.models.entity.PlayerListDto;
import com.servicio.nba_player_detail.repository.PlayerDetailRepository;
import com.servicio.nba_player_detail.repository.PlayerListClient;

@Service
public class PlayerDetailService {
    @Autowired
    private PlayerListClient playerListClient;


    @Autowired
    private PlayerDetailRepository playerDetailsRepository;

    public Optional<PlayerDetail> getPlayerDetails(Long playerId) {
        // Llamar al servicio PlayerList para obtener los detalles básicos del jugador
        PlayerListDto playerListDto = playerListClient.getPlayerById(playerId);

        // Buscar los detalles adicionales del jugador usando el playerId
        Optional<PlayerDetail> playerDetailOptional = playerDetailsRepository.findByPlayerId(playerId);

        // Si los detalles adicionales existen, los combinamos con los datos obtenidos del otro servicio
        if (playerDetailOptional.isPresent()) {
            PlayerDetail playerDetail = playerDetailOptional.get();

            // Seteamos los datos obtenidos desde el servicio PlayerList en playerDetail
            if (playerDetail.getCuriosities() == null || playerDetail.getCuriosities().isEmpty()) {
                playerDetail.setCuriosities("Curiosidades sobre el genio " + playerListDto.getName());
            }

            return Optional.of(playerDetail);
        }

        // Si no existen detalles adicionales, devolvemos vacío
        return Optional.empty();
    }
}
