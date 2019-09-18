package com.example.player.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.player.data.Player;
@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {

	public Optional<Player> findByEmail(String email);
}
