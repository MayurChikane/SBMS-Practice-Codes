package com.mayur.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Player {
	@Id
	private Integer playerId;
	private String playerName;
	private Integer playerAge;
	private String address;

	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge + ", address="
				+ address + "]";
	}
	
	
}
