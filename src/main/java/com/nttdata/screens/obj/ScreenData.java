package com.nttdata.screens.obj;

public class ScreenData {
	Long id; 
	String device; 
	String mac; 
	String username;
	
	public ScreenData() {
		
	}
	public ScreenData(Long id, String device, String mac, String username) {
		super();
		this.id = id;
		this.device = device;
		this.mac = mac;
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	} 
}
