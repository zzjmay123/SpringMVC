package com.springapp.mvc;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class Base64Util {


    private static final String CHARSET_UTF8 = "UTF-8";

    public static String encode (String data) {

        try {
            byte[] dataBytes = Base64.encodeBase64(data.getBytes("UTF-8"));

            String dataBase64 = new String(dataBytes, "UTF-8");
            if (dataBase64 != null) {
                dataBase64 = dataBase64.trim();
            }

            return dataBase64;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Base64Util.encode UnsupportedEncodingException:" + e.getMessage());
        }

    }

    public static String decode (String data) {

        try {
            byte[] dataBytes = Base64.decodeBase64(data.getBytes(CHARSET_UTF8));

            String dataStr = new String(dataBytes, CHARSET_UTF8);

            return dataStr;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Base64Util.decode UnsupportedEncodingException:" + e.getMessage());
        }
    }

    public static String encodeUrlSafe(String data) {
        try {
            byte[] dataBytes = Base64.encodeBase64URLSafe (data.getBytes("UTF-8"));
            String dataBase64 = new String(dataBytes, "UTF-8");
            if (dataBase64 != null) {
                dataBase64 = dataBase64.trim();
            }

            return dataBase64;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Base64Util.encodeUrlSafe UnsupportedEncodingException:" + e.getMessage());
        }
    }

    public static String decodeUrlSafe(String data) {

        try {
            byte[] dataBytes = Base64.decodeBase64 (data.getBytes("UTF-8"));
            String dataStr = new String(dataBytes, "UTF-8");

            return dataStr;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Base64Util.decodeUrlSafe UnsupportedEncodingException:" + e.getMessage());
        }
    }
}
