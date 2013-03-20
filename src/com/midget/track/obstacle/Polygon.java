package com.midget.track.obstacle;

import com.midget.common.Vector;

public class Polygon {
	
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////

	Vector[] points;
	
	/**
	 * Use clockwise vector declaration
	 * @param points
	 */
	public Polygon(Vector... points) {
		this.points = new Vector[points.length];
		System.arraycopy( points, 0, this.points, 0, points.length );
	}
	
	public Polygon[] getConvexPolygons(){
		// FIXME:implement this
		return null;
	}
	
	private Polygon[] splitPolygon(Polygon polygon){
		// FIXME:implement this see drawing in notebook
		return null;
	}
	
	private boolean isInPolygon(Vector point, Polygon polygon){
		// FIXME:implement this
		return true;
	}
	
	private float getIntersectTime(Vector p1, Vector p2, Vector v1, Vector v2){
		// TODO: refactor
		Vector pt = p2.subtract(p1);
		Vector vt = v2.subtract(v1);
		if(pt.areParallel(vt)){
			throw new IllegalArgumentException("vectors are paralel");
		}
		float a = p1.getX();
		float b = pt.getX();
		float c = v1.getX();
		float d = vt.getX();
		float e = p1.getY();
		float f = pt.getY();
		float g = v1.getY();
		float h = vt.getY();
		return (b*(g-e)+f*(a-c))/(f*d-b*h);
	}
}
