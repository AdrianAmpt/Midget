package com.midget.track;

import java.util.HashSet;
import java.util.Set;

import com.midget.common.Vector;
import com.midget.track.obstacle.Obstacle;

public class Cell {

	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	/***************************z****
	 *        Properties           *
	 *******************************/
	
	private Vector[] points;
	private Vector worldCoordinates;
	private Set<Obstacle> obstacles;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	Cell (Vector worldCoordinates) {
		this.worldCoordinates = worldCoordinates;
		points[0] = new Vector(0 , 0);
		points[1] = new Vector(0 , 1);
		points[2] = new Vector(1 , 1);
		points[3] = new Vector(1 , 0);
		this.obstacles = new HashSet<Obstacle>();
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
}
