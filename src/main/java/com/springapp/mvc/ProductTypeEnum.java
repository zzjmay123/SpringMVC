package com.springapp.mvc;

/**
 * Created by wulin on 2016/3/10.
 */
public enum ProductTypeEnum {
    EXPR("0", "快捷卡"),
    JIOU("1", "白条"),
    BALANCE("2", "余额"),
    COUPON("3", "优惠券"),
    WEIXIN("4","微信"),
    XJK("5","小金库");


    private String code;
    private String desc;

    private ProductTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ProductTypeEnum getEnum(String code) {
        for (ProductTypeEnum t : values()) {
            if (t.code.equals(code))
                return t;
        }
        throw new IllegalArgumentException("PayChannel is illegal");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
