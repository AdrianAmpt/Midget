package com.midget.domain;

public class Connecter {
	
	////////////////////////////////
	//                            //
	//         Properties         //
	//                            //
	////////////////////////////////
	
	private Lobby lobby;
	
	////////////////////////////////
	//                            //
	//        Constructors        //
	//                            //
	////////////////////////////////
	
	/**
	 * @param lobby
	 */
	public Connecter(Lobby lobby) {
		this.lobby = lobby;
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
	 * @return the lobby
	 */
	public Lobby getLobby() {
		return lobby;
	}

	/**
	 * @param lobby the lobby to set
	 */
	public void setLobby(Lobby lobby) {
		this.lobby = lobby;
	}
}
