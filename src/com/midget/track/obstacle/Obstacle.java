package com.midget.track.obstacle;

import java.util.ArrayList;
import java.util.List;

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
	protected List<Line> lines; 
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public Obstacle(Vector worldCoordinates){
		this.worldCoordinates = worldCoordinates;
		this.lines = new ArrayList<Line>();
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

	/**
	 * @return the lines
	 */
	public List<Line> getLines() {
		return lines;
	}

	/**
	 * @param lines the lines to set
	 */
	public void setLines(List<Line> lines) {
		this.lines = lines;
	}
}
