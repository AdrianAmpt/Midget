package com.midget.game;

import java.util.ArrayList;
import java.util.List;

import com.midget.domain.Domain;

public class GameFactory {
	
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	Domain domain;
	List<Game> gameArray;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	public GameFactory(Domain domain) {
		this.domain = domain;
		gameArray = new ArrayList<Game>();
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
