package com.midget.track;

import com.midget.common.Vector;

public class HomePlate {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private Vector worldCoordinates;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////

	/**
	 * @param worldCoordinates the worldCoordinates to set
	 */
	public void setWorldCoordinates(Vector worldCoordinates) {
		this.worldCoordinates = worldCoordinates;
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
	
	public HomePlate(Vector worldCoordinates) {
		this.worldCoordinates = worldCoordinates;
	}

	/**
	 * @return the worldCoordinates
	 */
	public Vector getWorldCoordinates() {
		return worldCoordinates;
	}
}
