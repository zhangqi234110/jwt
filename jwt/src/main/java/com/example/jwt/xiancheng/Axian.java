package com.example.jwt.xiancheng;

public class Axian implements Runnable {
    @Override
    public void run() {
        synchronized (this){
            System.out.println("我是A");

            try {
                wait(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
