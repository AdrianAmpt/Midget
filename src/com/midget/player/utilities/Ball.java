package com.midget.player.utilities;

import com.midget.player.Player;
import com.midget.track.Track;

public class Ball {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	Player player;
	Swing swing;
	Track track;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public Ball(Player player) {
		this.player = player;
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
	 * @return the player
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * @param player the player to set
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}

	/**
	 * @return the swing
	 */
	public Swing getSwing() {
		return swing;
	}

	/**
	 * @param swing the swing to set
	 */
	public void setSwing(Swing swing) {
		this.swing = swing;
	}

	/**
	 * @return the track
	 */
	public Track getTrack() {
		return track;
	}

	/**
	 * @param track the track to set
	 */
	public void setTrack(Track track) {
		this.track = track;
	}
}
