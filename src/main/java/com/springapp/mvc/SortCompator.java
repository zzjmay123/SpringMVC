package com.springapp.mvc;

import java.util.Comparator;

/**
 * Created by zhouzhenjiang on 2016/8/6.
 */
public class SortCompator implements Comparator<PaymentProduct> {

    @Override
    public int compare(PaymentProduct o1, PaymentProduct o2) {
        //根据PayemntProduct的权重值进行排序，从小到大

        if(o1!=null && o2 !=null){
            //如果有默认产品列表，再按weight排序
          if(o1.getDefaultPayment()!=o2.getDefaultPayment()){
              return o2.getDefaultPayment()-o1.getDefaultPayment();
          }else{
              return o1.getWeight()-o2.getWeight();
          }
        }

        return 0;
    }
}
