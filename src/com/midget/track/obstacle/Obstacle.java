package com.midget.track.obstacle;

import com.midget.common.Vector;

public abstract class Obstacle {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	protected Vector worldCoordinates;
	protected float angle;
	protected float slopeAngle;
	protected float friction;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public Obstacle(Vector worldCoordinates){
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

	/**
	 * @return the worldCoordinates
	 */
	public Vector getWorldCoordinates() {
		return worldCoordinates;
	}

	/**
	 * @param worldCoordinates the worldCoordinates to set
	 */
	public void setWorldCoordinates(Vector worldCoordinates) {
		this.worldCoordinates = worldCoordinates;
	}

	/**
	 * @return the angle
	 */
	public float getAngle() {
		return angle;
	}

	/**
	 * @param angle the angle to set
	 */
	public void setAngle(float angle) {
		this.angle = angle;
	}

	/**
	 * @return the slopeAngle
	 */
	public float getSlopeAngle() {
		return slopeAngle;
	}

	/**
	 * @param slopeAngle the slopeAngle to set
	 */
	public void setSlopeAngle(float slopeAngle) {
		this.slopeAngle = slopeAngle;
	}

	/**
	 * @return the friction
	 */
	public float getFriction() {
		return friction;
	}

	/**
	 * @param friction the friction to set
	 */
	public void setFriction(float friction) {
		this.friction = friction;
	}
}
