package com.example.aop.danli;

public class DanLi {
    private static String a;
    private DanLi(){}

    public static DanLi getInstance(){
        if (a==null){
            return new DanLi();
        }
        return null;
    }
}
