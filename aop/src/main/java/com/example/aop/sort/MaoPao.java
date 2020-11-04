package com.example.aop.sort;

import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        //有一组数 [8, 2, 4, 6, 3, 1, 5, 7, 9]，请使用Java常用的算法(如冒泡、快排)实现按从小到大排序
        //方法一，工具类快速排序
        int[] arr1={8, 2, 4, 6, 3, 1, 5, 7, 9};
        Arrays.sort(arr1);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println(arr1[0]);

    }
}
