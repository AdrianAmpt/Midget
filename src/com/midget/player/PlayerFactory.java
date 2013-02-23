package com.midget.player;

import java.util.ArrayList;
import java.util.List;

import com.midget.domain.Domain;

public class PlayerFactory {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private Domain domain;
	private List<Player> playerArrray;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	/**
	 * 
	 * @param domain
	 */
	public PlayerFactory(Domain domain) {
		this.setDomain(domain);
		this.setPlayerArrray(new ArrayList<Player>());
	}
	
	////////////////////////////////
	//                            //
	//       Business Logic       //
	//                            //
	////////////////////////////////
	
	////////////////////////////////
	//                            //
	//  Getters, Setters & Adders //
	//                            //
	////////////////////////////////
	
	/**
	 * @return the domain
	 */
	public Domain getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	/**
	 * @return the playerArrray
	 */
	public List<Player> getPlayerArrray() {
		return playerArrray;
	}

	/**
	 * @param playerArrray the playerArrray to set
	 */
	public void setPlayerArrray(List<Player> playerArrray) {
		this.playerArrray = playerArrray;
	}
	
	/**
	 * @param player
	 */
	public void addPlayer(Player player) {
		this.playerArrray.add(player);
	}
	
	/**
	 * @param player
	 */
	public void removePlayer(Player player) {
		this.playerArrray.remove(player);
	}
}
