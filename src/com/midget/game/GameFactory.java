package com.midget.game;

import java.util.ArrayList;
import java.util.List;

import com.midget.domain.Domain;
import com.midget.player.Player;

public class GameFactory {
	
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	Domain domain;
	List<Game> gameArray;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public GameFactory(Domain domain) {
		this.domain = domain;
		gameArray = new ArrayList<Game>();
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
	 * @return the gameArray
	 */
	public List<Game> getGameArray() {
		return gameArray;
	}

	/**
	 * @param gameArray the gameArray to set
	 */
	public void setGameArray(List<Game> gameArray) {
		this.gameArray = gameArray;
	}
	
	/**
	 * @param game
	 */
	public void addGame(Game game) {
		this.gameArray.add(game);
	}
	
	/**
	 * @param game
	 */
	public void removeGame(Game game) {
		this.gameArray.remove(game);
	}
}
