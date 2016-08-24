package com.springapp.mvc;

import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhouzhenjiang on 2016/6/14.
 */
public class TestJrAction {


    public static void main(String[] args) throws NoSuchAlgorithmException {
        System.out.println(getJrPayAction());
    }

    public static String getJrPayAction() throws NoSuchAlgorithmException {

        //生成关于JrPayAction的链接
        String orderId = "15612356489489";

        //应付金额
        String shouldPay ="0.01";
        //机构名称
        String companyName = Base64Util.encodeUrlSafe("测试商户号大师阿斯顿发送到发送到发送到发斯蒂芬");
        //商品名称
        String productName =Base64Util.encodeUrlSafe("商户请求测试单子大阿萨德发生的发送到飞");
        //订单类型
        String orderType ="20022";
        //支付类型
        String toType = "160";
        //skumerchant
        String skumerchant="40001";
        //下单的pin
//        String pin=Base64Util.encodeUrlSafe("wdosHtyGoRyPrO");
        String pin=Base64Util.encodeUrlSafe("hyc2017");

        //用户是否实名参数,这个需要在配置文件配置支持的orderType
        String holderName = Base64Util.encodeUrlSafe(AesUtil.encrypt("吕涵山","1qaz2wsx3edc"));;
        String holderNo = Base64Util.encodeUrlSafe(AesUtil.encrypt("62100019860906928X","1qaz2wsx3edc"));
//        String holderName = "";
//        String holderNo = "";
        String holderMobile =Base64Util.encodeUrlSafe(AesUtil.encrypt("15313003464","1qaz2wsx3edc"));;

        //超时时间
        String expires="10";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String requestTime=format.format(new Date(System.currentTimeMillis()));

        //跳转的Url
        String returnUrl="http://www.jd.com";

        StringBuffer jrActionUrl = new StringBuffer();

        jrActionUrl.append("http://jrcashier.jd.com/finance/payment/jrpay.action?")
                .append("orderId=" + orderId)
                .append("&shouldPay="+shouldPay)
                .append("&companyName="+companyName)
                .append("&productName="+productName)
                .append("&orderType="+orderType)
                .append("&toType="+toType)
                .append("&skumerchant="+skumerchant)
                .append("&pin="+pin)
                .append("&holderName="+holderName)
                .append("&holderNo="+holderNo)
                .append("&holderMobile=" + holderMobile)
                .append("&expires="+expires)
                .append("&requestTime="+requestTime)
                .append("&jump=xjk")
                .append("&returnUrl=" + returnUrl);


        String authKey = MD5.getMD5Code(jrActionUrl.toString()+"1qaz2wsx3edc");

        jrActionUrl.append("&authKey="+authKey);
        System.out.println("生成的链接：");

        return jrActionUrl.toString();
    }

}
