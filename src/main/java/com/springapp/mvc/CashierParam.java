package com.springapp.mvc;

/**
 * Created by huyanli on 2015/8/14.
 */
public class CashierParam {

    private String orderId;//订单号
    private String toType;//交易类型
    private String payJson;//业务参数
    private String orderJson;//订单本地化参数
    private String sign;//加密

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    public String getPayJson() {
        return payJson;
    }

    public void setPayJson(String payJson) {
        this.payJson = payJson;
    }

    public String getOrderJson() {
        return orderJson;
    }

    public void setOrderJson(String orderJson) {
        this.orderJson = orderJson;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
