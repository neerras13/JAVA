package com.example.player.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {

	
}
