package com.springapp.mvc;

import java.io.Serializable;

/**
 * Created by zhouzhenjiang on 2016/8/4.
 */
public class TermInfoVo implements Serializable {
    /**
     *终端类型
     */
    private String type;
    /**
     *终端IP
     */
    private String ip;
    /**
     *终端MAC
     */
    private String mac;
    /**
     *终端IMEI
     */
    private String imei;
    /**
     *终端IDFV
     */
    private String idfv;
    /**
     *终端ADID
     */
    private String adid;
    /**
     *操作系统
     */
    private String os;
    /**
     *操作系统版本
     */
    private String osVersion;

    public TermInfoVo() {
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return this.mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIdfv() {
        return this.idfv;
    }

    public void setIdfv(String idfv) {
        this.idfv = idfv;
    }

    public String getAdid() {
        return this.adid;
    }

    public void setAdid(String adid) {
        this.adid = adid;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}
