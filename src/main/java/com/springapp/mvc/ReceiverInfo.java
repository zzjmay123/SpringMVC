package com.springapp.mvc;


/**
 * 收货信息
 * @author luanmengting
 *
 */
public class ReceiverInfo {
	
	/**
	 * 收货人姓名
	 */
	private String name;
	
	/**
	 * 收货地址
	 */
	private String address;
	
	/**
	 * 收货手机号 TODO
	 */
	private String mobile;
	
	/**
	 * 收货人座机 TODO
	 */
	private String phone;
	
	/**
	 * 电子邮箱
	 */
	private String email;
	
	/**
	 * 省份ID
	 */
	private String province;
	
	/**
	 * 城市ID
	 */
	private String city;
	
	/**
	 * 区县ID
	 */
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
