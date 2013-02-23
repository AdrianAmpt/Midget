package com.midget.game;

import java.util.ArrayList;
import java.util.List;

import com.midget.player.User;
import com.midget.track.Track;

public abstract class Game {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	protected User user;
	protected List<Track> tracks;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	/**
	 * 
	 * @param user
	 * @param tracks
	 */
	public Game(User user, List<Track> tracks) {
		this.user = user;
		user.setGame(this);
		this.tracks = new ArrayList<Track>();
		this.tracks.addAll(tracks);
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the tracks
	 */
	public List<Track> getTracks() {
		return tracks;
	}

	/**
	 * @param tracks the tracks to set
	 */
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	/**
	 * @param track
	 */
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	/**
	 * @param track
	 */
	public void removeTrack(Track track) {
		this.tracks.remove(track);
	}
}
