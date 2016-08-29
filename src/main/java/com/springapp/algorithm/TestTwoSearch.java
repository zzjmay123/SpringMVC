package com.springapp.algorithm;

/**
 * 二分查找--有序列表,前提是针对有序列表
 * Created by zhouzhenjiang on 2016/8/28.
 */
public class TestTwoSearch {


    public static void main(String[] args) {
        int[] sources = {0,1,16,24,35,47,59,62,73,88,89};

        int searchresult = insertSearch(sources,sources.length-1,16);

        System.out.println("返回匹配的下标：  result:"+searchresult);
    }

    /**
     *
     * @param source
     * @param n  最高位
     * @param key
     * @return  -1表示没有查到匹配项
     */
    private static int twoSearch(int[] source,int n,int key){
        int low,heigh,mid;
        low =0;
        heigh = n;

        while(low<=heigh){
            mid = (low+heigh)/2;  //java中的数组的下标从0开始

            if(key < source[mid]){
                heigh = mid-1;
            }else if(key >source[mid]){
                low = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    /**
     *插值查找
     * @param source
     * @param n  最高位
     * @param key
     * @return  -1表示没有查到匹配项
     */
    private static int insertSearch(int[] source,int n,int key){
        int low,heigh,mid;
        low =0;
        heigh = n;

        while(low<=heigh){
            mid = (int) (low+((key-source[low])/(source[heigh]-source[low]))*(heigh-low));

            if(key < source[mid]){
                heigh = mid-1;
            }else if(key >source[mid]){
                low = mid+1;
            }else{
                return mid;
            }
        }

        return -1;
    }


}
