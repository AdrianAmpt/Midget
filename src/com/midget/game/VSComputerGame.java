package com.midget.game;

import java.util.List;

import com.midget.player.AI;
import com.midget.player.User;
import com.midget.track.Track;

public class VSComputerGame extends Game {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	// Properties from super class
	
	// protected User user;
	// protected List<Track> tracks;
	
	private AI opponent;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	/**
	 * 
	 * @param user
	 * @param tracks
	 * @param opponent
	 */
	public VSComputerGame(User user, List<Track> tracks, AI opponent) {
		super(user, tracks);
		this.opponent = opponent;
		this.opponent.setGame(this);
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
	 * @return the opponent
	 */
	public AI getOpponent() {
		return opponent;
	}

	/**
	 * @param opponent the opponent to set
	 */
	public void setOpponent(AI opponent) {
		this.opponent = opponent;
	}
}
