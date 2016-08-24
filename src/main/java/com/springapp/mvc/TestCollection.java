package com.springapp.mvc;

import com.jd.payment.paycommon.utils.GsonUtils;
import org.apache.commons.collections.list.TreeList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 测试排序算法
 * Created by zhouzhenjiang on 2016/8/6.
 */
public class TestCollection {

    public static void main(String[] args) {
        List<PaymentProduct> list = new ArrayList<PaymentProduct>();


        //快捷产品
        PaymentProduct express =new PaymentProduct();
        express.setProductType(ProductTypeEnum.EXPR.getCode());
        express.setDefaultPayment(0);
        express.setProductTypeName("快捷产品");
        express.setWeight(70);
        list.add(express);


        //余额产品
        PaymentProduct jdAm =new PaymentProduct();
        jdAm.setProductType(ProductTypeEnum.JIOU.getCode());
        jdAm.setDefaultPayment(0);
        jdAm.setProductTypeName("余额产品");
        jdAm.setWeight(10);
        list.add(jdAm);

        //小金库产品
        PaymentProduct xjk =new PaymentProduct();
        xjk.setProductType(ProductTypeEnum.JIOU.getCode());
        xjk.setDefaultPayment(0);
        xjk.setProductTypeName("小金库产品");
        xjk.setWeight(30);
        list.add(xjk);

        //白条产品
        PaymentProduct baitiao =new PaymentProduct();
        baitiao.setProductType(ProductTypeEnum.JIOU.getCode());
        baitiao.setDefaultPayment(1);
        baitiao.setProductTypeName("白条产品");
        baitiao.setWeight(0);
        list.add(baitiao);


        Collections.sort(list,new SortCompator());

        System.out.println("排序后的链表:\n"+ GsonUtils.toJson(list));


    }
}
