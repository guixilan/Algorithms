package main.java.com.gxl.algorithms.sorts;//package com.gxl.algorithms.sorts;

import java.lang.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by xilan on 2017/9/13.
 */
public class InsertSort {
    public static int[] sort(int[] array){
        for(int i = 1; i < array.length;++i){
            int k = array[i];
            //子数组array[0,i-1]始终有序，所以子循环对[0,i-1]间的数据依次跟i进行比较，找到i对应元素的插入位置。
            int j = i-1;
            for(; j >= 0; j--){
                if(k < array[j])
                {
                    array[j+1] = array[j];
                }
                else
                {
                    break;
                }
            }
            //由循环不变式得内循环结束后[0,j]是有序的，j+1存放新的元素，保证[0,j+1]有序.则[0,j+1] U [j+2,i] ==> [0,i]有序，即有序子数组在
            //经过一轮循环后，由[0,i-1]增加到[0,i],下一次循环开始时候，i=i+1,则循环不变式[0,i-1]有序成立。
            array[j+1] = k;
        }
        return array;
    }

    public static void main(String args[]){
        int arrys[] = new int[20];
        for(int i = 0; i < 20;++i){
            int random = new Random().nextInt(100);
            arrys[i] = random;
        }
        System.out.println("before sort:"+ Arrays.toString(arrys));
        arrys = sort(arrys);
        System.out.println("after sort:"+ Arrays.toString(arrys));
    }
}
