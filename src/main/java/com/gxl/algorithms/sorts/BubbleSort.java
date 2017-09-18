package main.java.com.gxl.algorithms.sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by guixilan on 2017/9/14.
 */
public class BubbleSort {
    public static int[] sort(int [] arrays){
        for(int i = arrays.length-1; i >= 0;--i ){
            for(int j = 0;j < i;++j){
                if(arrays[j] > arrays[j+1])
                {
                    CommonUtils.exchange(arrays,j,j+1);
                }
            }
        }
        return arrays;
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
