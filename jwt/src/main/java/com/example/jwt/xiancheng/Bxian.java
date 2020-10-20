package com.example.jwt.xiancheng;

public class Bxian implements Runnable {

    @Override
    public void run() {
        synchronized (this){
            System.out.println("我是B");
            try {
                wait(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
