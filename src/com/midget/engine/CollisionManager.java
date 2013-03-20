package com.midget.engine;

import com.midget.common.Vector;

public class CollisionManager {
	
	private boolean detectCollision(Ball ball, Polygon obstacle, Vector translation){
		Vector[] ballFacePoints = ball.getFacePoints();
		Edge[] ballFaceEdges = new Edge[ballFacePoints.length - 1];
		Vector[] obstaclePoints = obstacle.getPoints();
		Edge[] obstacleEdges = obstacle.getEdges();
		
		for (int i = 0; i < ballFacePoints.length - 1; i++) {
			ballFaceEdges[i] = new Edge(ballFacePoints[i], ballFacePoints[i + 1]);
		}
		
		for ()
			
			
			// for each edge of both polygons (ball and object), project both polygons on line perpendicular to this edge.
			// if for all projections it holds that there is overlap, only then do the polygons collide,
			// so if any projection yields no overlap, return false.
			// do not forget to 'stretch' the ball with its translation, so when projecting the ball, add the translation to the
			// ballFacePoints
	}
	
}
