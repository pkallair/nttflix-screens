package com.nttdata.screens.obj;

public class RequestScreen {
	ScreenData screenData;

	public RequestScreen() {
		
	}
	
	public RequestScreen(ScreenData screenData) {
		super();
		this.screenData = screenData;
	}

	public ScreenData getScreenData() {
		return screenData;
	}

	public void setScreenData(ScreenData screenData) {
		this.screenData = screenData;
	}
		
}
