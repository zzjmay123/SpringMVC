package com.springapp.mvc;


/**
 * 终端信息
 * @author luanmengting
 *
 */
public class TermInfo {
	
	/**
	 * 终端类型
	 */
	private String type;
	
	/**
	 * 终端IP TODO
	 */
	private String ipp;
	
	/**
	 * 终端MAC
	 */
	private String mac;
	
	/**
	 * 终端IMEI
	 */
	private String imei;
	
	/**
	 * 终端IDFV
	 */
	private String idfv;
	
	/**
	 * 终端ADID
	 */
	private String adid;
	
	/**
	 * 操作系统
	 */
	private String os;
	
	/**
	 * 操作系统版本
	 */
	private String osVersion;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIpp() {
		return ipp;
	}

	public void setIpp(String ipp) {
		this.ipp = ipp;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getIdfv() {
		return idfv;
	}

	public void setIdfv(String idfv) {
		this.idfv = idfv;
	}

	public String getAdid() {
		return adid;
	}

	public void setAdid(String adid) {
		this.adid = adid;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

}
