package com.midget.common;

import java.nio.FloatBuffer;

public class Vector {
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private FloatBuffer vector;
	private float x;
	private float y;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public Vector(float x, float y){
		this.x = x;
		this.y = y;
		
		vector = FloatBuffer.wrap(new float[]{x, y});
	}
	
	////////////////////////////////
	//                            //
	//       Business Logic       //
	//                            //
	////////////////////////////////
	
	public float dot(Vector v){
		return x * v.getX() + y * v.getY();
	}
	
	public Vector scale(float s){
		return new Vector(x*s, y*s);
	}
	
	public Vector normalize(){
		return this.scale(this.length());
	}
	
	public Vector add(Vector v){
		return new Vector(x + v.getX(), y + v.getY());
	}
	
	public Vector subtract(Vector v){
		return new Vector(x - v.getX(), y - v.getY());
	}
	
	public float length(){
		return (float)Math.sqrt(Math.pow((double)x, 2) + Math.pow((double)y, 2));
	}
	
	public float angle(Vector v){
		return (float)Math.acos(this.dot(v) / (this.length() * v.length()));
	}
	
	public float angle(){
		return angle(new Vector(1, 0));
	}
	
	public Vector normalVector(){
		return new Vector(this.y, -this.x).normalize();
	}
	
	public boolean areParallel(Vector v){
		return (this.x / v.x == this.y / v.y);
	}
	
	////////////////////////////////
	//                            //
	//  Getters, Setters & Adders //
	//                            //
	////////////////////////////////
	
	public FloatBuffer getVector() {
		return vector;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
}