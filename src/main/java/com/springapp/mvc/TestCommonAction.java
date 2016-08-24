package com.springapp.mvc;

import com.jd.jr.order.export.rest.domain.OrderBean;
import com.jd.jr.order.export.rest.domain.OrderInfoBean;
import com.jd.jr.order.export.rest.domain.cashier.CashierOrderInfoBean;
import com.jd.payment.paycommon.utils.GsonUtils;

/**
 * Created by zhouzhenjiang on 2016/7/26.
 */
public class TestCommonAction {

    public static void main(String ss[]) {
        String orderId = "15648948948";
        String toType = "220";
        String orderType = "20048";
        String total = "100";
        String skuMerchant = "31001";
        String productName = "光环侧刻RGB机械键盘速阿斯顿发送到发送到发送到发送到发送到发送到发送到程序沙发归属感的风格的发生过";
        String countDownTime = "2015-9-30";
        String orderSubmitTime = "2015-9-30";
        String expires="10";
        String requestTime="20160628183200";

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
//        cashierOrderInfoBean.setExpires(expires);
//        cashierOrderInfoBean.setRequestTime(requestTime);

        cashierOrderInfoBean.setPin("hyc2017");
//        cashierOrderInfoBean.setHolderName("吕涵山");
//        cashierOrderInfoBean.setHolderNo("62100019860906928X");
//        cashierOrderInfoBean.setReturnUrl("http://jrcashier.jd.com/finance/payment/jrpay.action");
        cashierOrderInfoBean.setSuccessUrl("http://www.jd.com");
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
