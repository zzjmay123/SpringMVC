package com.springapp.mvc;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 支付前端安全加密解密工具类
 *
 */
public class SecurityUtils {
	
	private final static Log log = LogFactory.getLog(SecurityUtils.class);
	
	private static  final String key = "j1crhs8o22a82y42";
	
	
	/**
	 * 加密
	 * @param sign
	 * @return
	 * @throws Exception 
	 */
	public static String encrpt(String sign){

		try {
			return new AESCoder().encrpt(sign, key);
		} catch (Exception e) {
			log.error("pay 加密支付信息失败   当前参数： "+sign,e);
		}
		return "";
	
	}
	
	/**
	 * 解密
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String str) throws Exception{

		return new AESCoder().decrypt(str,key);

	}


	public static void main(String ss[]){
		String data="2b68a539865bfce1a5d70f865e6f9d5a";
//
		try {
			System.out.println(SecurityUtils.decrypt("2b68a539865bfce1a5d70f865e6f9d5a"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



    }


}
