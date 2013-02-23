package com.midget.player;

import com.midget.game.Game;
import com.midget.player.utilities.Ball;
import com.midget.player.utilities.Swing;

public abstract class Player {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	protected Game game;
	protected Ball ball;
	protected Swing swing;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	/**
	 * 
	 */
	public Player() {
		this.ball = new Ball(this);
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
	 * @return the game
	 */
	public Game getGame() {
		return game;
	}

	/**
	 * @param game the game to set
	 */
	public void setGame(Game game) {
		this.game = game;
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
}
