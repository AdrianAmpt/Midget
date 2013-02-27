package com.midget.track;

import java.util.HashSet;
import java.util.Set;

import com.midget.common.Vector;
import com.midget.player.utilities.Ball;
import com.midget.track.obstacle.Obstacle;

public class Track {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private float friction;
	private Cell[][] cells;
	private Set<Obstacle> obstacles;
	private HomePlate homePlate;
	private Ball ball;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	Track(int sizex, int sizey, float cellSize, float friction, Vector homePlateCoors){
		this.friction = friction;
		this.cells = new Cell[sizex][sizey];
		
		for (int i = 0; i < sizex; i++) {
			for (int j = 0; j < sizey; j++) {
				this.cells[i][i] = new Cell(new Vector(i * cellSize, j * cellSize));
			}
		}
		
		this.obstacles = new HashSet<Obstacle>();
		this.homePlate = new HomePlate(homePlateCoors);
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
	 * @return the cells
	 */
	public Cell[][] getCells() {
		return cells;
	}

	/**
	 * @param cells the cells to set
	 */
	public void setCells(Cell[][] cells) {
		this.cells = cells;
	}

	/**
	 * @return the obstacles
	 */
	public Set<Obstacle> getObstacles() {
		return obstacles;
	}

	/**
	 * @param obstacles the obstacles to set
	 */
	public void setObstacles(Set<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}

	/**
	 * @return the homePlate
	 */
	public HomePlate getHomePlate() {
		return homePlate;
	}

	/**
	 * @param homePlate the homePlate to set
	 */
	public void setHomePlate(HomePlate homePlate) {
		this.homePlate = homePlate;
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
