package com.midget.player.utilities;

import com.midget.common.Vector;
import com.midget.player.Player;

public class Swing {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private Player player;
	private Ball ball;
	private float force;
	private Vector direction;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public Swing(Player player) {
		this.player = player;
		this.ball = player.getBall();
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
	 * @return the ball
	 */
	public Ball getBall() {
		return ball;
	}

	/**
	 * @param ball the ball to set
	 */
	public void setBall(Ball ball) {
		this.ball = ball;
	}

	/**
	 * @return the force
	 */
	public float getForce() {
		return force;
	}

	/**
	 * @param force the force to set
	 */
	public void setForce(float force) {
		this.force = force;
	}

	/**
	 * @return the direction
	 */
	public Vector getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(Vector direction) {
		this.direction = direction;
	}
}
