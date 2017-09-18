package main.java.com.gxl.algorithms.sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by guixilan on 2017/9/18.
 */
public class SelectSort {
    public static void sort(int[] arrays){
        if(arrays == null || arrays.length == 0)
        {
            return;
        }

        for(int i = 0; i < arrays.length;++i){
            int min = minIndex(arrays,i);
            CommonUtils.exchange(arrays,i,min);
        }
    }

    private static int minIndex(int[] arrays,int s){
        if(s >= arrays.length)
        {
            return -1;
        }
        int minIndex = s;
        for(int i = s; i < arrays.length;++i){
            if(arrays[i] < arrays[minIndex])
            {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String args[]){
        int arrys[] = new int[20];
        for(int i = 0; i < 20;++i){
            int random = new Random().nextInt(100);
            arrys[i] = random;
        }
        System.out.println("before sort:"+ Arrays.toString(arrys));
        sort(arrys);
        System.out.println("after sort:"+ Arrays.toString(arrys));
    }


}
