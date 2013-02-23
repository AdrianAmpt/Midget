package com.midget.game;

import java.util.List;

import com.midget.domain.Lobby;
import com.midget.player.User;
import com.midget.track.Track;

public class MultiplayerGame extends Game {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	// Properties from super class
	
	// protected User user;
	// protected List<Track> tracks;
	
	private Lobby lobby;
	private User opponent;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public MultiplayerGame(User user, List<Track> tracks, User opponent, Lobby lobby) {
		super(user, tracks);
		this.opponent = opponent;
		this.opponent.setGame(this);
		this.lobby = lobby;
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
	 * @return the lobby
	 */
	public Lobby getLobby() {
		return lobby;
	}

	/**
	 * @param lobby the lobby to set
	 */
	public void setLobby(Lobby lobby) {
		this.lobby = lobby;
	}

	/**
	 * @return the opponent
	 */
	public User getOpponent() {
		return opponent;
	}

	/**
	 * @param opponent the opponent to set
	 */
	public void setOpponent(User opponent) {
		this.opponent = opponent;
	}
}
