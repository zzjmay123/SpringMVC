package com.springapp.mvc;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.jd.payment.paycommon.utils.GsonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouzhenjiang on 2016/8/5.
 */
public class TestCreateDJ {
    public static void main(String[] args) {
        List<GoodsInfo> goodsInfos = new ArrayList<GoodsInfo>();
        for (int i=0;i<3;i++){
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setType("GT01");
            goodsInfo.setId("1001"+i);
            goodsInfo.setNum("10");
            goodsInfo.setName("屈臣氏饮用水4.5升/桶测试"+i);
            goodsInfo.setPrice("30");
            goodsInfo.setCat1("20640");
            goodsInfo.setCat2("20819");
            goodsInfo.setCat3("20838");
            goodsInfos.add(goodsInfo);
        }

        //商品信息
        System.out.println("GoodsInfo list:\n"+ GsonUtils.toJson(goodsInfos));

        ReceiverInfoVo receiverInfo = new ReceiverInfoVo();
        receiverInfo.setName("陈晓萌");
        receiverInfo.setAddress("北京市朝阳区和平街十二区4号楼5单元11号");
        receiverInfo.setPhone("13811330769");
        receiverInfo.setProvince("1");
        receiverInfo.setCity("1");
        receiverInfo.setCountry("2333");
        receiverInfo.setMobile("010-95118");
        receiverInfo.setEmail("zzjmay@163.com");

        //收货地址
        System.out.println("ReceverInfo:\n" + GsonUtils.toJson(receiverInfo));


        TermInfoVo termInfo = new TermInfoVo();

        termInfo.setAdid("23232");
        termInfo.setOs("OS01");
        termInfo.setOsVersion("5.0.2");
        termInfo.setType("PC");
        termInfo.setIdfv("121212");
        termInfo.setMac("04: 02: 1f: 01: a1: db");
        termInfo.setImei("866946022568791");
        termInfo.setIp("127.0.0.1");
        System.out.println("TermInfo :\n" + GsonUtils.toJson(termInfo));

    }
}
