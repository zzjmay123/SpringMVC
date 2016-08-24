package com.springapp.mvc;

public class ScanPayBean {
	
	private String time; //时间戳
	private String pin; 
	private String key; //临时收单key单号
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
