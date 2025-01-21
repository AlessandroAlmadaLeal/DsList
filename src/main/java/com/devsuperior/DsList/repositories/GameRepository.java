package com.devsuperior.DsList.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.DsList.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long> {
	
	

}
