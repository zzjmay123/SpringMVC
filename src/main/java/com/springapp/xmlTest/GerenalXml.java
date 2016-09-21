package com.springapp.xmlTest;

import com.jd.jr.pay.gate.signature.util.JdPayUtil;

import javax.annotation.Resource;

/**
 * Created by zhouzhenjiang on 2016/9/21.
 */
public class GerenalXml {

    @Resource
    private ConfigProperties configproperties;

    public static void main(String[] args) throws IllegalAccessException {
        GerenalXml gerenalXml = new GerenalXml();

        gerenalXml.getXMLStr();

    }


    public void getXMLStr() throws IllegalAccessException {
        String deskey = "Z8KMT8cT4z5ruu89znxFhRP4DdDBqLUH";
        String priKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAL60FMvs2u2xikCbANWohQQI+llOnFrobMh+Tzkn/sGVyFNVBBmyT8ej+6a6o28b2VGlMP+oOGRSjrJuqy7pwMJqMvWPxSmmMjTqbi/FYmJNJfYmcEHrf8Jwn5PFJN2bCQdsiXJfiMquvJTiSDDV9m43NCXccp/wHXr0UQ05OAYlAgMBAAECgYEAhBrNeUKXmibtxblah6eYlWX+vtT0/QibKvxMtyRclw/CWO/Aymg6WerfzezmgHaDQcq0ObX3co+6KCL/1Jy7GP/Hk32BgfFpbp90PtQXGjVp03wUobJUBlGFfIxQjnIPUMT145z7aYN0u+ycz17IhA6K3M0QSn39VaOxpp37XcECQQDp6Xfj5dZ1TPcnPMRnSbARwo6fluMmCSRKffO032UOThZkE8un5nD5VhI3KCEllhB6LiIeG35CR5yf++lBUcbRAkEA0LYZnUu8WeNaHwAlKshvquiPzk3xugjum3Gld3wrY6neMSP1F84pbGumpIMnUuglWtKaWPD5anC8sAlF6qMHFQJAFAif8Q/lT0SZQm4M8D+6abr9FiQJLl/IEO06qzoa4J/FgSrE3Yt6D5DUnI6+UAbLQHulBmkaZjjV7EnaD3MekQJAJHOJabVugex5MuzdkOlMx3aylv959lnVAoUItyOSmGd0jPSQu8Wf6nWqtxTI62vsCj66Akqj5Pknmz8jXOV4OQJBANtNmkZH79AQl3heWHnFsr6pPyiZwVopHphzifjddHu3Mvu8/nwQvgXGRu+2vXeUGGhVRlw9W8YYRfNEFiQ+L3o=";
        String pubKey ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC+tBTL7NrtsYpAmwDVqIUECPpZTpxa6GzIfk85J/7BlchTVQQZsk/Ho/umuqNvG9lRpTD/qDhkUo6ybqsu6cDCajL1j8UppjI06m4vxWJiTSX2JnBB63/CcJ+TxSTdmwkHbIlyX4jKrryU4kgw1fZuNzQl3HKf8B169FENOTgGJQIDAQAB";
//        String cert = CertUtil.getCert();

        String version = "V2.0";
        String merchant = "22318136";
        String oTradeNum = "223181361460707816970";

        TradeQueryInner queryTradeDTO = new TradeQueryInner();
        queryTradeDTO.setVersion(version);
        queryTradeDTO.setMerchant(merchant);
        queryTradeDTO.setoTradeNum(oTradeNum);
        queryTradeDTO.setTradeType("1"); // 0:消费 1：退款

        String xml = JdPayUtil.genReqXml(queryTradeDTO, priKey, deskey);
        System.out.println("query xml:" + xml);
    }

    public ConfigProperties getConfigproperties() {
        return configproperties;
    }

    public void setConfigproperties(ConfigProperties configproperties) {
        this.configproperties = configproperties;
    }
}
