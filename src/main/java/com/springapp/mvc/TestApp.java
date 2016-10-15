package com.springapp.mvc;


import com.jd.payment.paycommon.utils.GsonUtils;

/**
 * Created by zhouzhenjiang on 2016/7/8.
 */
public class TestApp {

    public static void main(String[] args) {
        String time =String.valueOf(System.currentTimeMillis());

        String pin ="wdosHtyGoRyPrO";

        String key ="n1znok2yelm7a";

        ScanPayBean scanPayBean = new ScanPayBean();

        scanPayBean.setTime(time);
        scanPayBean.setKey(key);
        scanPayBean.setPin(pin);

        String psk = SecurityUtils.encrpt(GsonUtils.toJson(scanPayBean));

        StringBuffer urlStr =new StringBuffer();
        urlStr.append("http://h5pay.jd.com/code?")
                .append("psk="+psk)
                .append("&s=0");
        System.out.println(urlStr.toString());


    }
}
