package com.servicio.nba_player_detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServicioNbaPlayerDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioNbaPlayerDetailApplication.class, args);
	}

}
