package com.springapp.xmlTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhouzhenjiang on 2016/9/21.
 */
@Component("configproperties")
public class ConfigProperties {

    @Value("${wepay.merchant.rsaPrivateKey}")
    private String merchantPriKey;


    @Value("${wepay.jd.rsaPublicKey}")
    private String jdPubliKey;

    @Value("${wepay.merchant.desKey}")
    private String deskey;

    public ConfigProperties() {
    }

    public String getMerchantPriKey() {
        return merchantPriKey;
    }

    public void setMerchantPriKey(String merchantPriKey) {
        this.merchantPriKey = merchantPriKey;
    }

    public String getJdPubliKey() {
        return jdPubliKey;
    }

    public void setJdPubliKey(String jdPubliKey) {
        this.jdPubliKey = jdPubliKey;
    }

    public String getDeskey() {
        return deskey;
    }

    public void setDeskey(String deskey) {
        this.deskey = deskey;
    }
}
