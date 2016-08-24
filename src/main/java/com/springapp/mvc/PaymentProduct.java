package com.springapp.mvc;


/**
 * Created by wulin on 2016/3/4.
 */
public class PaymentProduct {
    private static final long serialVersionUID = 1L;
    /**
     * “1”代表银行卡
     */
    private String productType;

    private String productTypeName;

    //如果是默认产品为1 ，非默认的0
    private int defaultPayment;

    private int weight;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public int getDefaultPayment() {
        return defaultPayment;
    }

    public void setDefaultPayment(int defaultPayment) {
        this.defaultPayment = defaultPayment;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
