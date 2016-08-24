package com.springapp.mvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 按照ascii字典序列加密
 */
public class DictionarySortSign {
    protected final static Log log = LogFactory.getLog(DictionarySortSign.class);
    private final static String Md5Key = "Jrdix#86JdH)8sde4&1S";

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    static class FieldComparator implements Comparator<Field> {
        @Override
        public int compare(Field o1, Field o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static String sign(Object o) {
        Class clz = o.getClass();
        Field[] fields = clz.getDeclaredFields();
        Arrays.sort(fields, new FieldComparator());
        StringBuilder sb = new StringBuilder();
        String result="";
        try {
            for (Field f : fields) {
                if (!"sign".equalsIgnoreCase(f.getName())){
                    f.setAccessible(true);
                    sb.append("&").append(f.getName()).append("=").append(f.get(o));
                }
            }
            if (sb.length() <1)
                return result;
            result= sb.substring(1)+Md5Key;
            MessageDigest messageDigest= MessageDigest.getInstance("MD5");
            messageDigest.update(result.getBytes("UTF-8"));
            byte[] retBytes=messageDigest.digest();
            result=bytesToHex(retBytes);
        } catch (Exception e) {
            log.error("create sign error! object:" + o,e);
        }

        return result;
    }

    public static void main(String ss[]){
//        CashierParam cashierParam = new CashierParam();
//        cashierParam.setOrderId("71231535820");
//        cashierParam.setToType("测试");
//
//        CashierOrderInfoBean cashierOrderInfoBean = new CashierOrderInfoBean();
//        cashierOrderInfoBean.setOrderId("71231535820");
//        cashierOrderInfoBean.setToType("220");
//        cashierOrderInfoBean.setOrderType("20048");
//        cashierOrderInfoBean.setCompanyId("6");
//        cashierOrderInfoBean.setTotal("1000.00");
//        cashierOrderInfoBean.setSkuMerchant("31001");
//        cashierOrderInfoBean.setProductName("勿动！");
//        cashierOrderInfoBean.setCompanyName("京东金融");
//        cashierOrderInfoBean.setSuccessUrl("");
//
//        cashierParam.setPayJson(GsonUtils.toJson(cashierOrderInfoBean));
//
//        OrderInfoBean orderInfoBean = new OrderInfoBean();
//
//        OrderBean orderBean = new OrderBean();
//        orderBean.setOrderId("71231535820");
//        orderInfoBean.setOrder(orderBean);
//
//        cashierParam.setOrderJson(GsonUtils.toJson(orderInfoBean));
//
//        cashierParam.setSign(DictionarySortSign.sign(cashierParam));
//
//        System.out.println(cashierParam.getSign());

    }

}
