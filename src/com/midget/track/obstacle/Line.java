package com.midget.track.obstacle;

import com.midget.common.Vector;

public class Line {
	
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	public static final int REGULAR_TYPE = 0;
	public static final int SLOPE_TYPE = 1;
	public static final int SURFACE_TYPE = 2;
	private int type;
	private Vector point0;
	private Vector point1;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public Line(Vector point0, Vector point1){
		this(point0, point1, REGULAR_TYPE);
	}
	
	public Line(Vector point0, Vector point1, int type){
		this.point0 = point0;
		this.point1 = point1;
		this.type = type;
	}
	
	////////////////////////////////
	//                            //
	//       Business Logic       //
	//                            //
	////////////////////////////////
	
	/**
	 * get a value between 0 and 1 to indicate the intersection point on this line.
	 * if value is not between 0 and 1, it means there is no intersection point
	 * @param ballPosition
	 * @param direction
	 * @return
	 */
	public float getIntersection(Vector ballPosition, Vector direction) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	/**
	 * returns the value of t for a point on the line
	 * @param v
	 * @return
	 */
	private float pointAtLine(Vector v){
		float x = v.getX() / point0.add(point1.subtract(v)).getX();
		float y = v.getY() / point0.add(point1.subtract(v)).getY();
		if(x==y){
		return x;
		}
		throw new IllegalArgumentException("Vertices are not at the same line y'all");
	}
	
	/**
	 * get the reflection from the inComingVector at intersection found at time = t
	 * @param t
	 * @param inComing
	 * @return
	 */
	public Vector getReflection(float t, Vector inComing) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	////////////////////////////////
	//                            //
	//  Getters, Setters & Adders //
	//                            //
	////////////////////////////////

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the point0
	 */
	public Vector getPoint0() {
		return point0;
	}

	/**
	 * @param point0 the point0 to set
	 */
	public void setPoint0(Vector point0) {
		this.point0 = point0;
	}

	/**
	 * @return the point1
	 */
	public Vector getPoint1() {
		return point1;
	}

	/**
	 * @param point1 the point1 to set
	 */
	public void setPoint1(Vector point1) {
		this.point1 = point1;
	}
}
