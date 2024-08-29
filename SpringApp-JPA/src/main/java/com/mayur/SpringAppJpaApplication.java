package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayur.entity.Player;
import com.mayur.player.PlayerRepository;

@SpringBootApplication
public class SpringAppJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringAppJpaApplication.class, args);
		PlayerRepository playerRepository= context.getBean(PlayerRepository.class);
		
		System.out.println(playerRepository.getClass().getName());
		Player p=new Player();
		p.setPlayerId(1);
		p.setPlayerName("Mayur");
		p.setPlayerAge(90);
		p.setAddress("Pune");
		
		playerRepository.save(p);
	}

}
