package com.midget.engine;

public class Engine {
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private long time;
	private boolean active;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////

	public Engine(){
	}
	
	////////////////////////////////
	//  	                      //
	//       Business Logic       //
	//                            //
	////////////////////////////////
	
	public void update(long tpf){
		
	}
	
	public void run(){
		while(active){
			update(time - System.currentTimeMillis());
			time = System.currentTimeMillis();
		}
	}
	
	////////////////////////////////
	//                            //
	//  Getters, Setters & Adders //
	//                            //
	////////////////////////////////
}
