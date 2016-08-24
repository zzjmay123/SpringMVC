package com.springapp.mvc;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public static String getMD5Code(String str) throws NoSuchAlgorithmException {
        byte unencoded[]=null;
		try {
			unencoded = str.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        MessageDigest md5 = null;
        
            md5 = MessageDigest.getInstance("MD5");
       
        md5.update(unencoded);
        byte encoded[] = md5.digest();
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < encoded.length; i++)
        {
            if((encoded[i] & 255) < 16)
                buf.append("0");
            buf.append(Long.toString(encoded[i] & 255, 16));
        }

        return buf.toString().toUpperCase();
    }
	/*public static void main(String args[]){
		System.out.println(MD5.getMD5Code("23232323ABCDS"));
	}*/
}

