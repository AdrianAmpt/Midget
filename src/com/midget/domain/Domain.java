package com.midget.domain;

import com.midget.game.GameFactory;
import com.midget.player.PlayerFactory;
import com.midget.track.TrackFactory;

public class Domain {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private Lobby lobby;
	private GameFactory gameFactoty;
	private TrackFactory trackFactory;
	private PlayerFactory playerFactory;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	/**
	 */
	public Domain(){
		this.lobby = new Lobby(this);
		this.gameFactoty = new GameFactory(this);
		this.trackFactory = new TrackFactory(this);
		this.playerFactory = new PlayerFactory(this);
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
	 * @return the gameFactoty
	 */
	public GameFactory getGameFactoty() {
		return gameFactoty;
	}

	/**
	 * @return the trackFactory
	 */
	public TrackFactory getTrackFactory() {
		return trackFactory;
	}

	/**
	 * @return the playerFactory
	 */
	public PlayerFactory getPlayerFactory() {
		return playerFactory;
	}
}
