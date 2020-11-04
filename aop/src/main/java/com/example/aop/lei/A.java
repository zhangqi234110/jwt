package com.example.aop.lei;

public class A {

    public static void main(String[] args) {
        new B(){
            public void adda(){
                System.out.println("我是B的匿名内部类");
            }
        }.adda();
    }


}
