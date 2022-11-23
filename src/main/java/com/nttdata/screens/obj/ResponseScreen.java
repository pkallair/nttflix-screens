package com.nttdata.screens.obj;

public class ResponseScreen {
	String message; 
	Object userData;
	
	public ResponseScreen() {
		
	}
	public ResponseScreen(String message, Object userData) {
		super();
		this.message = message;
		this.userData = userData;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getUserData() {
		return userData;
	}
	public void setUserData(Object userData) {
		this.userData = userData;
	}
	
	
}
