package main.java.com.gxl.algorithms.sorts;

/**
 * Created by guixilan on 2017/9/18.
 */
public class CommonUtils {
    public static void exchange(int [] A,int i,int j){
        int temp = A[i];
        A[i] = A[j];
        A[j]= temp;
    }
}
