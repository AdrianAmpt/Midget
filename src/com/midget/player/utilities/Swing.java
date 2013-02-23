package com.midget.player.utilities;

import com.midget.player.Player;

public class Swing {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private Player player;
	private Ball ball;
	
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
}
