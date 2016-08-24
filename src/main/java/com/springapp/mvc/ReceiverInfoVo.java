package com.springapp.mvc;

/**
 * Created by zhouzhenjiang on 2016/8/4.
 */
public class ReceiverInfoVo {

    /**
     *收货人姓名
     */
    private String name;
    /**
     *收货地址
     */
    private String address;
    /**
     *收货手机号
     */
    private String mobile;
    /**
     *收货人座机
     */
    private String phone;
    /**
     *电子邮箱
     */
    private String email;
    /**
     *省份ID
     */
    private String province;
    /**
     *城市ID
     */
    private String city;
    /**
     *区县ID
     */
    private String country;

    public ReceiverInfoVo() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
