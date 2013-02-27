package com.midget.track;

import java.util.ArrayList;
import java.util.List;

import com.midget.domain.Domain;
import com.midget.track.Track;

public class TrackFactory {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	Domain domain;
	List<Track> trackArray;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public TrackFactory(Domain domain) {
		this.domain = domain;
		trackArray = new ArrayList<Track>();
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
	 * @return the trackArray
	 */
	public List<Track> getTrackArray() {
		return trackArray;
	}

	/**
	 * @param trackArray the trackArray to set
	 */
	public void setTrackArray(List<Track> trackArray) {
		this.trackArray = trackArray;
	}
	
	/**
	 * @param track
	 */
	public void addTrack(Track track) {
		this.trackArray.add(track);
	}
	
	/**
	 * @param track
	 */
	public void removeTrack(Track track) {
		this.trackArray.remove(track);
	}
}
