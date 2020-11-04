package com.example.aop.father;

public class Son extends Father {

    @Override
    public void hello(){
        System.out.println("son");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.hello();
    }

}
