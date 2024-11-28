# NBA BACK MS

Conjunto de MS creados para retornar data relacionada a equipos y jugadores de NBA

## Caracteristicas
- Microservicios independientes: Cada microservicio se encarga de gestionar un aspecto específico (listado y detalle de jugadores, listado de equipos).
- Spring Cloud Gateway: Se utiliza como puerta de enlace para enrutar a los ms.
- Eureka Server: Detección de servicios para balanceo de cargas.
- MySQL: Base de datos para almacenar datos de jugadores y equipos.
- API REST: Cada servicio expone una API REST para acceder a los datos.

## Servicios Disponibles

 - Servicio-nba-players-list: Proporciona una lista de jugadores históricas de la NBA con estadísticas básicas.
 - Servicio-nba-player-detail: Proporciona detalles adicionales de un jugador como curiosidades, estadísticas mas detalladas.
 - Servicio-nba-teams: Proporciona información sobre los equipos de la NBA, tales como año de fundación, ciudad, estadio y más.

## Tecnologías Utilizadas

- Java 17
- Spring Boot 3.3.4
- Spring Cloud Gateway
- Eureka Discovery Server
- MySQL

## Instalación

- Clonar repositorio
[URL CLONE](https://github.com/JosePoPiT/nba-front-app.git)
- Configuración de MySQL
   Crea las bases de datos necesarias (nba_db, detail_nba_player_db, team_db).
   Utiliza los scripts SQL proporcionados para crear las tablas e insertar los datos iniciales.
    - CREATE TABLE players (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        team VARCHAR(255) NOT NULL,
        position VARCHAR(255) NOT NULL,
        height VARCHAR(50),
        weight VARCHAR(50),
        image LONGBLOB,
        championships INT,
        mvps INT,
        defensive_player_award INT,
        home_town VARCHAR(255),
        avg_points DOUBLE,
        avg_rebounds DOUBLE,
        avg_steals DOUBLE,
        avg_assists DOUBLE
    );

    - INSERT INTO players (name, team, position, height, weight, championships, mvps, defensive_player_award, home_town, avg_points, avg_rebounds, avg_steals, avg_assists) VALUES
    ('Bradley Beal', 'Washington Wizards', 'Guard', '6 ft 4 in', '207 lbs', 0, 0, 0, 'St. Louis, Missouri', 22.1, 4.1, 1.1, 4.0),
    ('Brandon Ingram', 'New Orleans Pelicans', 'Forward', '6 ft 8 in', '190 lbs', 0, 0, 0, 'Kinston, North Carolina', 18.7, 5.0, 0.7, 3.6),
    ('Coby White', 'Chicago Bulls', 'Guard', '6 ft 5 in', '195 lbs', 0, 0, 0, 'Goldsboro, North Carolina', 13.7, 3.6, 0.8, 3.5),
    ('Donovan Mitchell', 'Cleveland Cavaliers', 'Guard', '6 ft 1 in', '215 lbs', 0, 0, 0, 'Elmsford, New York', 23.9, 4.1, 1.3, 4.3),
    ('Jaylen Brown', 'Boston Celtics', 'Forward', '6 ft 6 in', '223 lbs', 0, 0, 0, 'Marietta, Georgia', 17.9, 5.2, 1.0, 2.2),
    ('Karl-Anthony Towns', 'Minnesota Timberwolves', 'Center', '6 ft 11 in', '248 lbs', 0, 0, 0, 'Edison, New Jersey', 23.0, 11.3, 0.8, 3.2),
    ('Jayson Tatum', 'Boston Celtics', 'Forward', '6 ft 8 in', '210 lbs', 0, 0, 0, 'St. Louis, Missouri', 20.8, 6.6, 1.1, 3.0);

    - team_db
    - CREATE TABLE teams (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    stadium VARCHAR(255),
    founded_year INT,
    nba_championships INT,
    conference_titles INT,
    playoff_appearances INT,
    head_coach VARCHAR(255),
    owner VARCHAR(255),
    capacity INT,
    notable_players VARCHAR(255),
    color VARCHAR(7),
    logo LONGBLOB
);

    INSERT INTO teams (name, city, stadium, founded_year, nba_championships, conference_titles, playoff_appearances, head_coach, owner, capacity, notable_players, color) VALUES
    ('Boston Celtics', 'Boston', 'TD Garden', 1946, 17, 21, 58, 'Joe Mazzulla', 'Boston Basketball Partners', 18624, 'Larry Bird, Paul Pierce, Bill Russell', '#007A33'),
    ('Los Angeles Lakers', 'Los Angeles', 'Crypto.com Arena', 1947, 17, 32, 61, 'Darvin Ham', 'Buss Family Trusts', 19068, 'Magic Johnson, Kobe Bryant, Shaquille O'Neal', '#552583'),
    ('Chicago Bulls', 'Chicago', 'United Center', 1966, 6, 6, 35, 'Billy Donovan', 'Jerry Reinsdorf', 20917, 'Michael Jordan, Scottie Pippen, Derrick Rose', '#CE1141');
## Estructura del proyecto

    - Servicio-nba-players-list: Microservicio que gestiona la lista de jugadores.
    - Servicio-nba-player-detail: Microservicio que gestiona los detalles de los jugadores.
    - Servicio-nba-teams: Microservicio que gestiona la información de los equipos.
    - Servicio-gateway: Gateway para enrutar las peticiones a los microservicios.
    - Servicio-eureka-server: Servidor Eureka para la detección de servicios.