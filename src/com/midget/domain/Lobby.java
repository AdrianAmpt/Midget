package com.midget.domain;

import java.util.HashSet;
import java.util.Set;

import com.midget.game.MultiplayerGame;

public class Lobby {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////

	private Domain domain;
	private Connecter connector;
	private Set<MultiplayerGame> games;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////

	/**
	 * 
	 * @param domain
	 */
	public Lobby(Domain domain){
		this.domain = domain;
		games = new HashSet<MultiplayerGame>();
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
	 * @return the connector
	 */
	public Connecter getConnector() {
		return connector;
	}

	/**
	 * @param connector the connector to set
	 */
	public void setConnector(Connecter connector) {
		this.connector = connector;
	}

	/**
	 * @return the games
	 */
	public Set<MultiplayerGame> getGames() {
		return games;
	}

	/**
	 * @param games the games to set
	 */
	public void setGames(Set<MultiplayerGame> games) {
		this.games = games;
	}
	
	/**
	 * @param game
	 */
	public void addGame(MultiplayerGame game) {
		this.games.add(game);
	}
	
	/**
	 * @param game
	 */
	public void removeGame(MultiplayerGame game) {
		this.games.remove(game);
	}
}
