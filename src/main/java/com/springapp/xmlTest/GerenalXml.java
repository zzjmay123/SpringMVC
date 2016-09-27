package com.springapp.xmlTest;

import com.jd.jr.pay.gate.signature.util.JdPayUtil;

import javax.annotation.Resource;

/**
 * Created by zhouzhenjiang on 2016/9/21.
 */
public class GerenalXml {
     String deskey = "Z8KMT8cT4z5ruu89znxFhRP4DdDBqLUH";
    String priKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAL60FMvs2u2xikCbANWohQQI+llOnFrobMh+Tzkn/sGVyFNVBBmyT8ej+6a6o28b2VGlMP+oOGRSjrJuqy7pwMJqMvWPxSmmMjTqbi/FYmJNJfYmcEHrf8Jwn5PFJN2bCQdsiXJfiMquvJTiSDDV9m43NCXccp/wHXr0UQ05OAYlAgMBAAECgYEAhBrNeUKXmibtxblah6eYlWX+vtT0/QibKvxMtyRclw/CWO/Aymg6WerfzezmgHaDQcq0ObX3co+6KCL/1Jy7GP/Hk32BgfFpbp90PtQXGjVp03wUobJUBlGFfIxQjnIPUMT145z7aYN0u+ycz17IhA6K3M0QSn39VaOxpp37XcECQQDp6Xfj5dZ1TPcnPMRnSbARwo6fluMmCSRKffO032UOThZkE8un5nD5VhI3KCEllhB6LiIeG35CR5yf++lBUcbRAkEA0LYZnUu8WeNaHwAlKshvquiPzk3xugjum3Gld3wrY6neMSP1F84pbGumpIMnUuglWtKaWPD5anC8sAlF6qMHFQJAFAif8Q/lT0SZQm4M8D+6abr9FiQJLl/IEO06qzoa4J/FgSrE3Yt6D5DUnI6+UAbLQHulBmkaZjjV7EnaD3MekQJAJHOJabVugex5MuzdkOlMx3aylv959lnVAoUItyOSmGd0jPSQu8Wf6nWqtxTI62vsCj66Akqj5Pknmz8jXOV4OQJBANtNmkZH79AQl3heWHnFsr6pPyiZwVopHphzifjddHu3Mvu8/nwQvgXGRu+2vXeUGGhVRlw9W8YYRfNEFiQ+L3o=";
    String pubKey ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC+tBTL7NrtsYpAmwDVqIUECPpZTpxa6GzIfk85J/7BlchTVQQZsk/Ho/umuqNvG9lRpTD/qDhkUo6ybqsu6cDCajL1j8UppjI06m4vxWJiTSX2JnBB63/CcJ+TxSTdmwkHbIlyX4jKrryU4kgw1fZuNzQl3HKf8B169FENOTgGJQIDAQAB";
//        String cert = CertUtil.getCert();

    String version = "V2.0";
    String merchant = "22318136";
    String oTradeNum = "223181361460707816970";


    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        GerenalXml gerenalXml = new GerenalXml();

//        gerenalXml.getXMLStr();
        gerenalXml.decrptXmlStr();

    }


    public void getXMLStr() throws IllegalAccessException {
//        String deskey = "Z8KMT8cT4z5ruu89znxFhRP4DdDBqLUH";
//        String priKey = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAL60FMvs2u2xikCbANWohQQI+llOnFrobMh+Tzkn/sGVyFNVBBmyT8ej+6a6o28b2VGlMP+oOGRSjrJuqy7pwMJqMvWPxSmmMjTqbi/FYmJNJfYmcEHrf8Jwn5PFJN2bCQdsiXJfiMquvJTiSDDV9m43NCXccp/wHXr0UQ05OAYlAgMBAAECgYEAhBrNeUKXmibtxblah6eYlWX+vtT0/QibKvxMtyRclw/CWO/Aymg6WerfzezmgHaDQcq0ObX3co+6KCL/1Jy7GP/Hk32BgfFpbp90PtQXGjVp03wUobJUBlGFfIxQjnIPUMT145z7aYN0u+ycz17IhA6K3M0QSn39VaOxpp37XcECQQDp6Xfj5dZ1TPcnPMRnSbARwo6fluMmCSRKffO032UOThZkE8un5nD5VhI3KCEllhB6LiIeG35CR5yf++lBUcbRAkEA0LYZnUu8WeNaHwAlKshvquiPzk3xugjum3Gld3wrY6neMSP1F84pbGumpIMnUuglWtKaWPD5anC8sAlF6qMHFQJAFAif8Q/lT0SZQm4M8D+6abr9FiQJLl/IEO06qzoa4J/FgSrE3Yt6D5DUnI6+UAbLQHulBmkaZjjV7EnaD3MekQJAJHOJabVugex5MuzdkOlMx3aylv959lnVAoUItyOSmGd0jPSQu8Wf6nWqtxTI62vsCj66Akqj5Pknmz8jXOV4OQJBANtNmkZH79AQl3heWHnFsr6pPyiZwVopHphzifjddHu3Mvu8/nwQvgXGRu+2vXeUGGhVRlw9W8YYRfNEFiQ+L3o=";
//        String pubKey ="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC+tBTL7NrtsYpAmwDVqIUECPpZTpxa6GzIfk85J/7BlchTVQQZsk/Ho/umuqNvG9lRpTD/qDhkUo6ybqsu6cDCajL1j8UppjI06m4vxWJiTSX2JnBB63/CcJ+TxSTdmwkHbIlyX4jKrryU4kgw1fZuNzQl3HKf8B169FENOTgGJQIDAQAB";
////        String cert = CertUtil.getCert();
//
//        String version = "V2.0";
//        String merchant = "22318136";
//        String oTradeNum = "223181361460707816970";

        TradeQueryInner queryTradeDTO = new TradeQueryInner();
        queryTradeDTO.setVersion(version);
        queryTradeDTO.setMerchant(merchant);
        queryTradeDTO.setoTradeNum(oTradeNum);
        queryTradeDTO.setTradeType("1"); // 0:消费 1：退款

        String xml = JdPayUtil.genReqXml(queryTradeDTO, priKey, deskey);
        System.out.println("query xml:" + xml);
    }


    public void decrptXmlStr() throws InstantiationException, IllegalAccessException {

        String rs ="<jdpay><version>V2.0</version><merchant>22318136</merchant><result><code>000000</code><desc>success</desc></result><encrypt>MThmMTdhZWQwMGJiZjA4MmVmZWVlYjZlZTYyNTZkZTAzMTRlY2I5ZjRhZGI0MTNkMmQ3NGRiYWEzZWZkNTE4ODM1MDg4MTNiMmQwNWI2OTllZmY4ZmYxMDVhZDQ1NTA0OGFhZWYxYWU0ZDJiZTM1MmNlOGU5YTlmYTIzMGFkMmUwZjRhMGQwMDZkMjRiNzdhNWQ4NjZlNmZlMzBlNzZkMDY4ZDdjMzJhNGJiMGU1OGU0NjA5Y2ZhMzBkNWJhMjdkMjBlOWM5YmE5Y2U2NWU1MzBjOTVlNTk0NGNhMzViZDZmYTQ2NWU0OGU2ZmM1YTVlOTA1MTZhYWY2NGJmNDY0MmUwYzNhZGI1ODQ2MDU3Nzk1Y2FmMzdiYzQ0MjRkODc2OWY0MjQxY2FhNzg4NjFiYmExZGIxYTBjYzFiMTA2MzhkZjQ0NTkxMDM3ODhhOTNiNGI0YzRmYjZjYTY5ZDA4NThlNmExZWU1YWVjNTFmN2JiZTc4YTZiNDljYzVmY2E3ZDhiNGVhYjk0YzhhOTNjMDhlNmExZWU1YWVjNTFmN2JhOTA3ODFiNzcwMjJhNTRkZjA4MmQ5MTlkNWNhMTZhZDBjYWMyZWMzMjVjNzIyNGE4NmRmNGNhYzlhNjk1MmY4MjhmYTkxOThkOTdlMzdmYjk3YTkxOWQ0YWVkNWJjMDQ4YzRlMjNlMjM2OGM5MmMzZTAyMTMyNDEwOWI0Y2RmYzAyZTRiNmIwMWExZmMwYTIyMWVkOGM4ZTc0Mjg5YTBjNGNkZDU2NWY1ZjZjMmEyNzlhYTBjZWM0NTQ1NmUzN2M2NTViNTJjNDdmNjI0MGJlM2QyMTU2ZDgwZjM5MTA2YWNmMWI2ZTkyN2RlZjkxYWQ3N2ZlMmU1Y2JjMzIyZjdmYjUxZGVmZmM1Yjc4ZTczMTYzMmVhZjFhZmVkNmQ2NjgwYTUxZGMzZGY1ODdhNWNhNWRkNjBlODQ0ZTkyZTZkMjJkNzMxMDc2NWQyMDQ0NjM5YTNhN2YxYjEzMmE0ZmY5OWEzYTdmMWIxMzJhNGZmOTEwMDhmMzFlZjhiOTFjMmM1MTFkYTZkYzZlZjdkNTQ1MTNmZDIwZjE3ZGI4YWY3NzEwMDhmMzFlZjhiOTFjMmMwMTJjMDc1MDBkY2RmNjgzM2FlOTNlMThhNTgyZTgwNDVlNDU1NDhlNTJjYjM5ZWQxMDA2NzVmYzRiNjdhMmM1MGRmY2ZjMTE2NWM0YjA1YmJhYWFmNGVmNzgxOWViMjMyMjE0NjM0ZDZlNzNmMjM0ZmI5ZTQ1NWJlYjQxODQ4Y2I3MmZiYWJjODYzNDRlMWM5MGY0N2ZhM2FlNDQzZjdhNGM1OTk3OTYzMWQwMGMxMWEyNzg3YTkzMDc0MzZiODAyNzg0MTRjMzYzNTU0ZmMwOWY0NjNhNDFkODk4NzY5ZDVhY2E0YTQ3MWEzZTU1MDk1MmVkNjg3MWY0MmRiZWM5NmQ5NDVhOWViZTI1YmE5NDQ4MGQwNWExZTRhY2EwNWVjMTE1Y2M4ZjZhZWI2NTVhYjI1Njk2Mzg4ZGIxZmRhOGM4ZDIzOTI5NThmODIxZTRmMDBlMGEwMTExMDY2ZjY4MzYxZjQ0N2Y4NjlhMWIxYjlkZTg3NDEyNTdiOGQ4N2ZhMGUwYzUxMTRhYThkM2E4NjYzMWVlNDM4YTc1MjBlMzhkMDM4NDZiODJkNjBlZjY2YTEyMWMxYjUwZDQ4NzBlYzE0Yjc0Zjc5YjYxZGZjNzQ5YTc3ODdkOTNjMzU5YTU1ZGVjODU3MjBhNDg4ZDM2OTMxNTkxZWY4OTNjNmIwNmRjNjY0M2Y5Yjc2Y2IzNzAxMTk3MWEzMTExM2I4MjgwNDY3ZjY0MzZjOWZmMGRjM2I4MzYwNDhmMmRjYzAzMzc0ODQwNjVkZjJmNmVlZmZlNDFlMGNhMTM4MGIxNzM5ZGUxZWJkOTU5NTg0YzYxYWQ2ZDNhZDBjYmZhOTVlNTExNWQ4ODQ3MDE5MGViODAxMTdhNjVhZDlhYzdjYTBkYzBjYWE1NmQ5NTgzZjJjNzIyM2RkZWE5ZTkyZTAzYTA1OTBmYTM1NDE3ODE1NWU5YjM1N2NmNWFmNjRhYTljYzM3N2ZiZjRlOTc5NTc0MjgyMjc1NDBiMWFmNTQ2MWM3ZjE=</encrypt></jdpay>";
        QueryRefundNewResponse queryRefundResponse = JdPayUtil.parseResp(pubKey, deskey, rs, QueryRefundNewResponse.class);
        System.out.println(queryRefundResponse);



    }
}
