package com.mayur.player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mayur.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Integer>{
	
}
