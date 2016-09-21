package com.springapp.ots;

import com.jd.jr.order.export.rest.domain.OrderBean;
import com.jd.jr.order.export.rest.domain.OrderInfoBean;
import com.jd.jr.order.export.rest.domain.cashier.CashierOrderInfoBean;
import com.jd.payment.paycommon.utils.GsonUtils;
import com.springapp.mvc.CashierParam;
import com.springapp.mvc.DictionarySortSign;
import com.springapp.mvc.SecurityUtils;


/**
 * Created by chenqi5 on 2015/10/10.
 * 维修中心
 */
public class Test10013 {
    public static void main(String ss[]) {
        String orderId = "201511061739001";
        String toType = "262";
        String orderType = "10013";
        String total = "0.01";
        String skuMerchant = "55003";
        String productName = "京东";
        String countDownTime = "2015-9-30";
        String orderSubmitTime = "2015-9-30";


        CashierParam cashierParam = new CashierParam();
        cashierParam.setOrderId(orderId);
        cashierParam.setToType(toType);

        CashierOrderInfoBean cashierOrderInfoBean = new CashierOrderInfoBean();
        cashierOrderInfoBean.setOrderId(orderId);
        cashierOrderInfoBean.setToType(toType);
        cashierOrderInfoBean.setOrderType(orderType);
        cashierOrderInfoBean.setCompanyId("6");
        cashierOrderInfoBean.setTotal(total);
        cashierOrderInfoBean.setSkuMerchant(skuMerchant);
        cashierOrderInfoBean.setProductName(productName);
        cashierOrderInfoBean.setCompanyName("金融");
        cashierOrderInfoBean.setCountdownTime(countDownTime);
        cashierOrderInfoBean.setOrderSubmitTime(orderSubmitTime);
        cashierOrderInfoBean.setPin("vacume");
        cashierOrderInfoBean.setReturnUrl("http://otscashier.jd.com/finance/noNeedLogin/pay.action");
        cashierOrderInfoBean.setSuccessUrl("");
        cashierParam.setPayJson(SecurityUtils.encrpt(GsonUtils.toJson(cashierOrderInfoBean)));

        OrderInfoBean orderInfoBean = new OrderInfoBean();

        OrderBean orderBean = new OrderBean();
        orderBean.setOrderId(orderId);
        orderInfoBean.setOrder(orderBean);

        cashierParam.setOrderJson(SecurityUtils.encrpt(GsonUtils.toJson(orderInfoBean)));

        cashierParam.setSign(DictionarySortSign.sign(cashierParam));

        System.out.println(GsonUtils.toJson(cashierParam));
        StringBuilder sbUrl = new StringBuilder();
        String url = "http://jrcashier.jd.com/finance/common/commonjrpay.action?";

        sbUrl.append("orderId=").append(cashierParam.getOrderId())
                .append("&toType=").append(cashierParam.getToType())
                .append("&payJson=").append(cashierParam.getPayJson())
                .append("&orderJson=").append(cashierParam.getOrderJson())
                .append("&sign=").append(cashierParam.getSign());


        System.out.println(url + sbUrl.toString());

    }

}
